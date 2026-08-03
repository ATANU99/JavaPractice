package com.java.practice.basics;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n=36;
		boolean isP=true;
		
		if(n<=1) {
			isP=false;
		}
		
		// why Math sqrt-- > 1*36=36, 2*18=36, 3*12=36, 4*9=36, 6* 6=36
		// after 6, 9*4==36... so pair is repeating
		
		for(int i=2;i<Math.sqrt(n);i++) {
			
			if(n%i==0) {
				isP=false;
				break;
			}
			
		}
		
	   System.out.println(n%2==0 ? "Not Prime": "Prime");
		
		
	}

}
