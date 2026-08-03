package com.java.practice.basics;

public class Fibonaci {
	
	
	public static void main(String[] args) {
		 
		int n=10;
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.println(fib(i) +" ");
			sum=sum+fib(i);
		}
		
		System.out.println(sum);
		
	}
	
	public static int fib(int n) {
		
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		
		return fib(n-1)+fib(n-2);
		
	}

}
