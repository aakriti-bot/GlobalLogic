package com.globallogic.demo;

import java.util.*;
public class Mapping {
	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<>();
		map.put("Aakriti", 1);
		map.put("Anshika", 2);
		map.put("Himani", 3);
		map.put("Sakshi", 4);
		map.put("Shephali", 5);
		System.out.println(map);
		Set<String> keys=map.keySet();
		for(String key:keys)
		System.out.println(map.get(key));
}
}
