package com.java.practice.basics;

public class PalindromString {
	
	public static void main(String[] args) {
		
		String in="PEPEPQ";
		int n=in.length();
		StringBuilder sb=new StringBuilder();
		while(n>0) {
			sb.append(in.charAt(n-1));
			n--;
		}
		
		if(sb.toString().equals(in)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not");
		}
		
	}

}
