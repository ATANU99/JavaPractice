package com.java.practice.top_50;

public class Reverse_Each_Words_in_a_String {
	
	public static void main(String[] args) {
		
		String input="Java Spring Boot";
		
		
		StringBuilder  temp=new StringBuilder();
		StringBuilder  res=new StringBuilder();
		
		String[] s=input.split(" ");
		
		for (String in: s) {
			
			temp.append(in).reverse();
			res.append(temp).append(" ");
			
			temp=new StringBuilder();
		}
		
		System.out.println(res);
		
		
		
		
	}

}
