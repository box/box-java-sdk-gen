package com.box.sdkgen.internal.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;

public class UtilsManager {

    public static <K, V> Map<K, V> mapOf(Entry<K, V>... entries){
        return Arrays.stream(entries)
                .collect(HashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), HashMap::putAll);
    }

    public static <K, V> Entry<K, V> entryOf(K key, V value){
        return Entry.of(key, value);
    }

    public static <K, V> Map<K, V> mergeMaps(Map<K,V> map1, Map<K,V> map2){
        Map<K, V> mergedMap = new HashMap<>();
        mergedMap.putAll(map1);
        mergedMap.putAll(map2);
        return mergedMap;
    }

    public static Map<String, String> prepareParams(Map<String, String> map){
        map.values().removeIf(Objects::isNull);
        return map;
    }

    public static String convertToString(Object value){
        if(value == null){
            return null;
        }
        if (value instanceof List) {
            return ((List<?>) value).stream()
                    .map(UtilsManager::convertToString)
                    .collect(Collectors.joining(","));
        }
        return value.toString();
    }

}