package com.java.practice.top_50;

public class Reverse_a_string {
	
		public static void main(String[] args) {
			
			System.out.println(reverse2());
		}
		
		public static String reverse() {
			String input="hello";
			return new StringBuilder().append(input).reverse().toString();
		}
		
		public static String reverse2() {
			String input="hello";
			StringBuilder s=new StringBuilder();
			for(char c:input.toCharArray()) {
				s.insert(0,c);// means insert c at index 0, and shift the existing characters to the right.
			}
			return s.toString();
		}

}
