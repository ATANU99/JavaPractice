package com.java.practice.top_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Move_Zeroes_to_End {
	
	
public static void main(String[] args) {
		
		
		int arr[]= {0,1,0,3,12};
		
		List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));	
		
		List<Integer> res=list.stream().sorted(Comparator.reverseOrder()).toList();
		
		System.out.println(
				
				res
				
				
				);

		
	}

}
