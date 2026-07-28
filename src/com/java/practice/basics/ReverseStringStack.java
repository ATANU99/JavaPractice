package com.java.practice.basics;

import java.util.Stack;

public class ReverseStringStack {
	public static void main(String args[]) {
		String input="Hello";
		int n =input.length();
		Stack<Character> stack=new Stack<>();
	    for(int i=0;i<input.length();i++) {
	    	stack.push(input.charAt(i));
	    }
	
		StringBuilder s=new StringBuilder();
//	   for(int i=stack.size()-1;i>=0;i--) {
//	    	s.append(stack.pop());
//	    }
		while (!stack.isEmpty()) {
		    s.append(stack.pop());
		}
	   System.out.println(s);
	}
}
