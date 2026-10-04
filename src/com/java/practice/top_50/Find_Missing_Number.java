package com.java.practice.top_50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_Missing_Number {

	public static void main(String[] args) {

		
       int arr[]= {1,2,3,5};
      
       int len=arr.length+1;
       
       int exp=len*(len+1)/2;
       
       int act=Arrays.stream(arr).sum();
              System.out.println(exp-act);
		
	}

}
