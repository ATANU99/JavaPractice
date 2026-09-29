package com.java.practice.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfString {
	
	public static void main( String args[]) {
		freq() ;
	}
	
	public static void freq() {
		
		String input ="java is easy and java is powerful and spring is powerful";
		
		List<String> list=new ArrayList<>(Arrays.asList(input.split("\\s+")));
		
		System.out.println(list);
		
		Map<String,Long> map=list.stream()
									.collect(
										Collectors.groupingBy(
												
												Function.identity(),
												LinkedHashMap::new,
												Collectors.counting()
												
												)
											
											);
		
		System.out.println(map);		
		
		Map.Entry<String, Long> maxEntry=map.entrySet().stream().max(Comparator.comparing(
				
				Map.Entry::getValue
				
				)).orElse(null);
		
		System.out.println(maxEntry.getKey());							
	}

}
