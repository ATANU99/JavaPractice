package com.java.practice.top_50;

import java.util.HashSet;
import java.util.Set;

public class Find_Common_Elements {

	
	public static void main(String[] args) {

		int arr1[] = { 1,2,3,4};
		int arr2[] = { 3,4,5,6 };

		int n = arr1.length + arr2.length;

		int res[] = new int[n];
		
		Set<Integer> set=new HashSet<>();

		int i = 0;
		int j = 0;
		int k = 0;

		

		while (i < arr1.length) {

			set.add(arr1[i]);
			i++;

		}

		while (j < arr2.length) {

			
			if(set.contains(arr2[j])) {
				System.out.println(arr2[j]);
			}
			
			j++;
			

		}

		

	}
	
	
}
