package com.box.sdkgen.internal.utils;

import com.box.sdkgen.box.errors.BoxSDKError;
import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.box.sdkgen.serialization.json.Valuable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PrivateKey;
import java.security.Security;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMDecryptorProvider;
import org.bouncycastle.openssl.PEMEncryptedKeyPair;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder;
import org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.bouncycastle.pkcs.PKCSException;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;
import org.jose4j.lang.JoseException;

public class UtilsManager {
  private static final int BUFFER_SIZE = 8192;

  public static <K, V> Map<K, V> mapOf(Entry<K, V>... entries) {
    return Arrays.stream(entries)
        .collect(
            HashMap::new,
            (map, entry) -> map.put(entry.getKey(), entry.getValue()),
            HashMap::putAll);
  }

  public static <K, V> Entry<K, V> entryOf(K key, V value) {
    return Entry.of(key, value);
  }

  public static <K, V> Map<K, V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
    Map<K, V> mergedMap = new HashMap<>();
    mergedMap.putAll(map1);
    mergedMap.putAll(map2);
    return mergedMap;
  }

  public static Map<String, String> prepareParams(Map<String, String> map) {
    map.values().removeIf(Objects::isNull);
    return map;
  }

  public static String convertToString(Object value) {
    if (value == null) {
      return null;
    }
    if (value instanceof EnumWrapper) {
      return ((EnumWrapper<?>) value).getStringValue();
    }
    if (value instanceof Valuable) {
      return ((Valuable) value).getValue();
    }
    if (value instanceof List) {
      return ((List<?>) value)
          .stream().map(UtilsManager::convertToString).collect(Collectors.joining(","));
    }
    if (value instanceof ArrayNode) {
      return convertToString(new ObjectMapper().convertValue(value, List.class));
    }

    if (value instanceof JsonNode) {
      return ((JsonNode) value).asText();
    }
    return value.toString();
  }

  public static void writeInputStreamToOutputStream(InputStream input, OutputStream output) {
    try {
      byte[] buffer = new byte[BUFFER_SIZE];
      int n = input.read(buffer);
      while (n != -1) {
        output.write(buffer, 0, n);
        n = input.read(buffer);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        input.close();
        output.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public static String getUuid() {
    return UUID.randomUUID().toString();
  }

  public static byte[] generateByteBuffer(int size) {
    byte[] bytes = new byte[size];
    Arrays.fill(bytes, (byte) 0);
    return bytes;
  }

  public static InputStream generateByteStream(int size) {
    byte[] bytes = generateByteBuffer(size);
    return new ByteArrayInputStream(bytes);
  }

  public static InputStream generateByteStreamFromBuffer(byte[] buffer) {
    return new ByteArrayInputStream(buffer);
  }

  public static byte[] readByteStream(InputStream inputStream) {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    byte[] data = new byte[BUFFER_SIZE];
    int bytesRead;
    try {
      while ((bytesRead = inputStream.read(data, 0, data.length)) != -1) {
        buffer.write(data, 0, bytesRead);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        inputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    return buffer.toByteArray();
  }

  public static boolean bufferEquals(byte[] buffer1, byte[] buffer2) {
    return Arrays.equals(buffer1, buffer2);
  }

  public static int bufferLength(byte[] buffer) {
    return buffer.length;
  }

  public static InputStream decodeBase64ByteStream(String value) {
    return new ByteArrayInputStream(Base64.getDecoder().decode(value));
  }

  public static String decodeBase64(String value) {
    return new String(Base64.getDecoder().decode(value));
  }

  public static InputStream stringToByteStream(String value) {
    return new ByteArrayInputStream(value.getBytes());
  }

  public static OutputStream getFileOutputStream(String filePath) {
    try {
      return new FileOutputStream(filePath);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public static void closeFileOutputStream(OutputStream outputStream) {
    try {
      outputStream.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static byte[] readBufferFromFile(String filePath) {
    try {
      InputStream inputStream = Files.newInputStream(Paths.get(filePath));
      return readByteStream(inputStream);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static String getEnvVar(String envVar) {
    return System.getenv(envVar);
  }

  public static void delayInSeconds(int seconds) {
    try {
      Thread.sleep(seconds * 1000L);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public static String readTextFromFile(String filePath) {
    try {
      return new String(Files.readAllBytes(Paths.get(filePath)));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static boolean isBrowser() {
    return false;
  }

  public static long getEpochTimeInSeconds() {
    return System.currentTimeMillis() / 1000;
  }

  public static PrivateKey decryptPrivateKey(String encryptedPrivateKey, String passphrase) {
    Security.addProvider(new BouncyCastleProvider());
    PrivateKey decryptedPrivateKey;
    try {
      PEMParser keyReader = new PEMParser(new StringReader(encryptedPrivateKey));
      Object keyPair = keyReader.readObject();
      keyReader.close();

      if (keyPair instanceof PrivateKeyInfo) {
        PrivateKeyInfo keyInfo = (PrivateKeyInfo) keyPair;
        decryptedPrivateKey = (new JcaPEMKeyConverter()).getPrivateKey(keyInfo);
      } else if (keyPair instanceof PEMEncryptedKeyPair) {
        JcePEMDecryptorProviderBuilder builder = new JcePEMDecryptorProviderBuilder();
        PEMDecryptorProvider decryptionProvider = builder.build(passphrase.toCharArray());
        keyPair = ((PEMEncryptedKeyPair) keyPair).decryptKeyPair(decryptionProvider);
        PrivateKeyInfo keyInfo = ((PEMKeyPair) keyPair).getPrivateKeyInfo();
        decryptedPrivateKey = (new JcaPEMKeyConverter()).getPrivateKey(keyInfo);
      } else if (keyPair instanceof PKCS8EncryptedPrivateKeyInfo) {
        InputDecryptorProvider pkcs8Prov =
            new JceOpenSSLPKCS8DecryptorProviderBuilder()
                .setProvider("BC")
                .build(passphrase.toCharArray());
        PrivateKeyInfo keyInfo =
            ((PKCS8EncryptedPrivateKeyInfo) keyPair).decryptPrivateKeyInfo(pkcs8Prov);
        decryptedPrivateKey = (new JcaPEMKeyConverter()).getPrivateKey(keyInfo);
      } else {
        PrivateKeyInfo keyInfo = ((PEMKeyPair) keyPair).getPrivateKeyInfo();
        decryptedPrivateKey = (new JcaPEMKeyConverter()).getPrivateKey(keyInfo);
      }
    } catch (IOException e) {
      throw new BoxSDKError("Error parsing private key for Box Developer Edition.", e);
    } catch (OperatorCreationException e) {
      throw new BoxSDKError("Error parsing PKCS#8 private key for Box Developer Edition.", e);
    } catch (PKCSException e) {
      throw new BoxSDKError("Error parsing PKCS private key for Box Developer Edition.", e);
    }
    return decryptedPrivateKey;
  }

  public static String createJwtAssertion(
      Map<String, Object> claims, JwtKey jwtKey, JwtSignOptions jwtOptions) {
    JwtClaims jwtClaims = new JwtClaims();
    jwtClaims.setIssuer(jwtOptions.getIssuer());
    jwtClaims.setAudience(jwtOptions.getAudience());
    jwtClaims.setExpirationTime(NumericDate.fromSeconds((Long) claims.get("exp")));

    jwtClaims.setSubject(jwtOptions.getSubject());
    jwtClaims.setClaim("box_sub_type", claims.get("box_sub_type"));
    jwtClaims.setGeneratedJwtId(64);

    JsonWebSignature jws = new JsonWebSignature();
    jws.setPayload(jwtClaims.toJson());
    jws.setKey(decryptPrivateKey(jwtKey.getKey(), jwtKey.getPassphrase()));
    jws.setAlgorithmHeaderValue(jwtOptions.getAlgorithm().getValue());
    jws.setHeader("typ", "JWT");
    if ((jwtOptions.getKeyid() != null) && !jwtOptions.getKeyid().isEmpty()) {
      jws.setHeader("kid", jwtOptions.getKeyid());
    }

    String assertion;

    try {
      assertion = jws.getCompactSerialization();
    } catch (JoseException e) {
      throw new BoxSDKError("Error serializing JSON Web Token assertion.", e);
    }

    return assertion;
  }

  public static JsonNode getValueFromObjectRawData(SerializableObject obj, String key) {
    return obj.getRawData().get(key);
  }
}
