package com.collection;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("abc", 1);
		map.put("pqr", 2);
		map.put("abc", 3);
		map.put(null, 4);
		map.put(null, 3);

		System.out.println(map);
	}

}
