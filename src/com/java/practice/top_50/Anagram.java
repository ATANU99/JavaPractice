package com.java.practice.top_50;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
	
	public static void main(String[] args) {
		
		Anagram3();
	}
	
	public static void Anagram1() {
		String str1="silent";
		String str2="listen";
		
		String a=str1.chars().mapToObj(c->String.valueOf((char)c)).sorted().collect(Collectors.joining());
		
		System.out.println(a);
		
		String b=str2.chars().mapToObj(d->String.valueOf((char)d)).sorted().collect(Collectors.joining());
		
		System.out.println(b);
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	public static void Anagram2() {
		String str1="silent";
		String str2="listen";
		
		char[] a=str1.toLowerCase().toCharArray();
		char[] b=str2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	public static void Anagram3() {
		String str1="silent";
		String str2="listen";
		
		System.out.println(
				
				str1.chars().sorted().boxed().collect(Collectors.toList()).equals(
						
						str2.chars().sorted().boxed().collect(Collectors.toList())
						
						)
				
				
				);
	}

}
