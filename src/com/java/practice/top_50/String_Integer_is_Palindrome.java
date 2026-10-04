package com.java.practice.top_50;

public class String_Integer_is_Palindrome {
	
	public static void main(String[] args) {
		
		System.out.println(Palindrome2());
	}
	
	public static boolean Palindrome1() {
		String input="madam";
		StringBuilder s=new StringBuilder();
		for(char c:input.toCharArray()) {
			s.insert(0,c);// means insert c at index 0, and shift the existing characters to the right.
		}
		return  input.equalsIgnoreCase(s.toString());
		
	}
	
	public static boolean Palindrome2() {
		int input=12234;
		int output=0;
		int keep=input;
		
		while(input>0) {
			int d=input%10;
			output=output*10+d;
			input=input/10;
		}
		
		return keep==output?true:false;
		
	}

}
