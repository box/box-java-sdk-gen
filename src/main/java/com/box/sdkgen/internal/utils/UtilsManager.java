package com.box.sdkgen.internal.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
}
