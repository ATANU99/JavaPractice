package com.java.practice.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

	
	public static void main( String args[]) {
		high() ;
	}
	
	public static void high() {
		List<Integer> salaries=Arrays.asList(
			    50000,
			    80000,
			    60000,
			    90000,
			    80000,
			    70000,
			    90000,
			    60000
			);
		int n=3;
		
		Integer res= salaries.stream().distinct().sorted(Comparator.reverseOrder())
				.skip(n-1)
				.findFirst()
				.orElse(null);
		
		System.out.println(res);
	}
	
	
}
