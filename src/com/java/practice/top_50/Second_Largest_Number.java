package com.java.practice.top_50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Second_Largest_Number {

	public static void main(String[] args) {

		find();
	}
	
	public static void find() {
		
		List<Integer> list= Arrays.asList(10,20,5,20,8);
		
		Integer res=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		
		System.out.println(res);
		
		
	}

}
