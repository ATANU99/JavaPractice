package com.java.practice.basics;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersProb {
	
	public static void main(String args[]) {
//		firstDuplicate();
//		
//		allDuplicate();
		
		firstDuplicateStream();
	}
	
	
	public static void firstDuplicate() {
		String str="programming";
		
		Set<Character> set=new HashSet<>();
		for (char c: str.toCharArray()) {
			if(!set.add(c)) {
				System.out.println("First duplicate char - " + c);
				break;
			}
		}
	}
	
	public static void firstDuplicateStream() {
		String str="programming";
		
		Set<Character> set=new HashSet<>();
	     
		Map<Character,Long> map=str.chars().mapToObj(c->(char) c)
		           .collect(
		        		   Collectors.groupingBy(
		        				   Function.identity(),
		        				   LinkedHashMap::new,
		        				   Collectors.counting()	   
		        				   )
		        		   );
		
		char res=map.entrySet().stream()
				.filter(e->e.getValue()==1)
				.map(Map.Entry::getKey)
//				.skip(1)
				.findFirst()
				.orElseThrow();
		
		System.out.println(map);
		System.out.println(res);
	}
	
	public static void allDuplicate() {
		String str="programming";
		
		Set<Character> set=new HashSet<>();
		for (char c: str.toCharArray()) {
			if(!set.add(c)) {
				System.out.println("All duplicate char - " + c);
				
			}
		}
	}

}
