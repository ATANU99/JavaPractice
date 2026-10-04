package com.java.practice.top_50;

import java.util.Stack;

public class Valid_Parentheses {
	
	public static void main(String[] args) {
		
		
		String in="[{()}]";
		
		Stack<Character> stack=new Stack<>();
		
		for (char ch:in.toCharArray()) {
			
			if(ch == '[' || ch== '{' || ch=='(') {
				stack.push(ch);
			}
			
			
			else {
				
				if(stack.isEmpty()) {
					System.out.println("Invalid");
					break;
				}
				
				char top=stack.pop();
				if(ch==')' && top != '(' 
					|| ch=='}' && top!='{'
					|| ch==']' && top!='[') {
					
					System.out.println("Invalid");
				}
				
				
				
			}
			
		}
		System.out.println("Valid");
		
	}

}
