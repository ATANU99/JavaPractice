package com.java.practice.top_50;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {

		subString2();
	}
	
	
	public static void subString1() {
		String str="abcabcbb";
		
		int max=Integer.MIN_VALUE;
		
		
		
		for( int pos=0;pos<str.length();pos++) {
			System.out.println(pos);
			int count=0;
			Set<Character> set=new HashSet<>();
			for(int i=pos;i<str.length();i++) {
				
				char ch=str.charAt(i);
				if(set.add(ch)) {
					
					count++;
					System.out.println(set +"-"+count);
				}
				
			}
			
			max=Math.max(max, count);
			
		}
		System.out.println("max"+max);
		
	}
	
	
	public static void subString2() {
		String str="abcabcbb";
	
		int left=0;
		int max=0;
	
		Set<Character> set=new LinkedHashSet<>();
		
		for(int right=0;right<str.length();right++) {
			
			char ch=str.charAt(right);
			
			while(set.contains(ch)) {
				
				set.remove(str.charAt(left));
				left++;
				
			}
			
			set.add(ch);
			System.out.println(set);
			
			max=Math.max(max,right-left+1);
			
			System.out.println(right+" - "+left + " + " +1 + " = " +max);
		}
		
	System.out.println(max);
		
	}
}
