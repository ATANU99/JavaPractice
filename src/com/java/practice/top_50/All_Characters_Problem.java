package com.java.practice.top_50;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class All_Characters_Problem {

	public static void main(String[] args) {
		
		Character();
	}
	
	public static void Character() {
		String str="swiss";
		
		Map<Character,Long> map=str.chars()
				                   .mapToObj(c->(char)c)
				                   .collect(
				                		   Collectors.groupingBy(
				                				   Function.identity(),
				                				   LinkedHashMap::new,
				                				   Collectors.counting()
				                				   
				                				   )
				                		   );
		
		System.out.println(map);
		
		char c=map.entrySet().stream().filter(e->e.getValue()==1)
				.map(Map.Entry::getKey)//.map(e->e.getKey)
				//.skip(1)
				.findFirst().orElse(null);
		
		
		System.out.println(c);
		
		
	}
	
}
