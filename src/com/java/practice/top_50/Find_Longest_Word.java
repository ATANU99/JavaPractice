package com.java.practice.top_50;

import java.util.Arrays;
import java.util.Comparator;

public class Find_Longest_Word {
	
	public static void main(String[] args) {

		String input = "I am Java Developer";

		String lon = null;
		int length=0;

		for (String s : input.split(" ")) {

			if(s.length()>length) {
				length=s.length();
				lon=s;
			}

		}

		System.out.println(lon);
		
		String len=Arrays.stream(input.split(" "))
							.max(Comparator.comparingInt(
									String::length
									)).orElse("");
		
		System.out.println(len);


	}

}
