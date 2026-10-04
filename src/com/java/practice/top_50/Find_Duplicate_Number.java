package com.java.practice.top_50;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_Number {
	
	
	public static void main(String[] args) {
		
		
		int arr[]= {1,3,4,2,2,3};
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(set.contains(arr[i]))
			{
				System.out.println(arr[i]);
			}
			
			set.add(arr[i]);
		}

		
	}

}
