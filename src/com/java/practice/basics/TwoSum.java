package com.java.practice.basics;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	
	public static void main(String args[]) {
		
		 int[] arr = {2, 11, 15,7, 9};
	        int target = 9;
		twoSum(arr, target);
	}
	
	public static void twoSum(int arr[], int target) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for ( int i=0;i<arr.length;i++) {
			int com=target-arr[i];
			if(map.containsKey(com)) {
				System.out.println(map.get(com)+"  "+i);
			}
			
			map.put(arr[i],i);
		}
		
	}

}
