package com.box.sdkgen.serialization.json;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

public class JsonManager {

  public static final ObjectMapper OBJECT_MAPPER =
      new ObjectMapper()
          .setSerializationInclusion(JsonInclude.Include.NON_NULL)
          .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

  public static JsonNode serialize(Object value) {
    return OBJECT_MAPPER.valueToTree(value);
  }

  public static <T extends SerializableObject> T deserialize(JsonNode content, Class<T> valueType) {
    T deserializedObject = OBJECT_MAPPER.convertValue(content, valueType);
    deserializedObject.setRawData(content);
    return deserializedObject;
  }

  public static JsonNode jsonToSerializedData(String text) {
    try {
      return OBJECT_MAPPER.readTree(text);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public static JsonNode jsonToSerializedData(JsonParser jp) {
    try {
      return OBJECT_MAPPER.readTree(jp);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static String sdToJson(JsonNode jsonNode) {
    return jsonNode.toString();
  }

  public static String sdToUrlParams(JsonNode jsonNode) {
    Map<String, String> map =
        OBJECT_MAPPER.convertValue(jsonNode, new TypeReference<Map<String, String>>() {});
    StringBuilder formData = new StringBuilder();
    for (Map.Entry<String, String> entry : map.entrySet()) {
      if (formData.length() != 0) {
        formData.append('&');
      }
      formData.append(URLEncoder.encode(entry.getKey()));
      formData.append('=');
      formData.append(URLEncoder.encode(entry.getValue()));
    }
    return formData.toString();
  }

  public static String getSdValueByKey(JsonNode jsonNode, String key) {
    return jsonNode.get(key).asText();
  }
}
