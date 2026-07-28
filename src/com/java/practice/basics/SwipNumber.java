package com.java.practice.basics;

public class SwipNumber {
	
	
	
	public static void main(String[] args) {
		int a=10122;
		int b=2021246;
		
//		a=a+b;//30
//		b=a-b;//10
//		a=a-b;//20
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a+" "+b);
	}

}
