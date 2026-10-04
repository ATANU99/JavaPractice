package com.java.practice.top_50;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		
		
		int arr[]= {2,7,11,15};
		int t=9;
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			int c=t-arr[i];// 9-2=7 -- [7,0], 9-7=2 --[2,1] 
			
			if(map.containsKey(c)) {
				System.out.println(map.get(c)+"  "+i);
			}
			
			map.put(arr[i], i);
			
		}
		
		
		
	}

}
