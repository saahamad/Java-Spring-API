package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestHeapError {

	public static void main(String[] args) {
		
		String name = "Sarfaraz";
		List<String> list = new ArrayList<>();
		
		int i=1;
		System.out.println("Started...");
		while(i<=1000)
		{
			
			name = name + "Love to India!";
			list.add(name);
			i++;
		}
		
		System.out.println("Completed..."+list);
			
		}
		

	}


