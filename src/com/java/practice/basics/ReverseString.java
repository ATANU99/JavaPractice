package com.java.practice.basics;

public class ReverseString {
	
	//	Reverse a String -- Hello <-> olleH
	//  Reverse Without Using Built-in Methods	
	public static void main(String args[]) {
		String input="Hello";
		int n =input.length();
		StringBuilder res=new StringBuilder();
		while(n>0) {
			
			res.append(input.charAt(n-1));
			n--;
		}
		System.out.println(res);
	}
	
	
}
