package com.java.practice.basics;

public class ReverseStringRecursive {

	
	public static void main(String args[]) {
		String input="Hello";
		int n =input.length();
		StringBuilder res=new StringBuilder();
		System.out.println(reverseString(input, n, res));
	}
	public static StringBuilder reverseString(String in,int n,StringBuilder s){
		if(n==0) {
			return s;
		}
		
		return reverseString(in,n-1,s.append(in.charAt(n-1)));
	}

}
