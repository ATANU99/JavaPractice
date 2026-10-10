package com.java.practice.top_50;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static void main(String[] args) {

		String input = "programming";


		String res=input.chars().distinct()
				        .mapToObj(c->String.valueOf((char)c))
				        .collect(Collectors.joining());
		
		System.out.println(res);
		
		Set<Character> set= new HashSet<>();
		StringBuilder s=new StringBuilder();
		
		for(char ch:input.toCharArray()) {
				
			if(set.add(ch)) {
				s.append(ch);
			}
			
		}
		
		System.out.println(s);

	}


}
