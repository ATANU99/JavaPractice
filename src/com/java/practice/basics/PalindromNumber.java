package com.java.practice.basics;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		int in=101;
		int org=in;
		int out=0;
		if (in < 0) {
		    System.out.println(false);
		    return;
		}
		while(in>0) {
			int temp;
			temp=in%10;
			out=out*10+temp;
			in=in/10;
		}
		
		System.out.println(org==out);
	}

}
