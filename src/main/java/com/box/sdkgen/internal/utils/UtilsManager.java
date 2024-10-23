package com.box.sdkgen.internal.utils;

import com.box.sdkgen.serialization.json.EnumWrapper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

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
    if (value instanceof List) {
      return ((List<?>) value)
          .stream().map(UtilsManager::convertToString).collect(Collectors.joining(","));
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
}
