package com.main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapUtils {

	public static Map<String, List<?>> getMap(Map<String, List<?>> map, String key) {
		Map<String, List<?>> collect = map.entrySet().stream()
				.filter(x -> x.getKey().equals(key))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		return collect;
	}
	
	public static <T extends Object> T cast(Object obj) {
		return (T)obj;
	}
}
