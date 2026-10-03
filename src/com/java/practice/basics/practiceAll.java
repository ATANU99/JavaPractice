package com.java.practice.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practiceAll {
	
	
	
	public static void flatmap() {
		List<List<String>> list=Arrays.asList(
				Arrays.asList("Apple","Banana"),
				Arrays.asList("Mango")
				);
		System.out.println(list);
		
		List<String> res=list.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(res);
	}
	
  public static void freq() {
		String in="Programming";
		
		Map<Character,Long> res=in.chars().mapToObj(c->(char) c)
				.collect(Collectors.groupingBy(
						
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()
						
						))
				;
		System.out.println(res);
		//First Repeating Character
		Character c=
				res.entrySet().stream()
				.filter(e->e.getValue()>1)
				.map(Map.Entry::getKey)
				.findFirst().orElse(null);
		
		System.out.println(c);
		
		//First Non Repeating Character
				Character ch=
						res.entrySet().stream()
						.filter(e->e.getValue()==1)
						.map(Map.Entry::getKey)
						.findFirst().orElse(null);
				
				System.out.println(ch);
		//Duplicate chars
			 Set<Character> duplicates=res.entrySet().stream()
					 						.filter(e->e.getValue()>1)
					 						.map(Map.Entry::getKey)
					 						.collect(Collectors.toSet());
			
		 System.out.println(duplicates);
		 
		//Remove duplicates
		 String remove=in.chars()
				         .mapToObj( e ->String.valueOf((char) e) )
				         .distinct()
				         .collect(Collectors.joining());
		 
		System.out.println(remove);	 
		
		//reverse 
		
		String st="hello";
		
		StringBuilder s=new StringBuilder();
		
		for(char cc:st.toCharArray()) {
			
			s.insert(0, cc);
			System.out.println(s);
			
		}
		// palindrom string

		String st1 = "madam";

		StringBuilder s1 = new StringBuilder();

		for (char cc : st1.toCharArray()) {

			s1.insert(0, cc);
			System.out.println(s1);

		}
		if(st1.equalsIgnoreCase(s1.toString())) {
			System.out.println("palindrom String");
		}else {
			System.out.println("Not");
		}
		
		// palindrom string

		int in1 = 12321;

		int org=in1;
		int rev=0;
		

		while(in1>0) {
			
			int d=in1%10;
			rev=rev*10+d;
			in1=in1/10;
			
		}
		System.out.println(org);
		System.out.println(rev);
		if (org==rev) {
			System.out.println("palindrom number");
		} else {
			System.out.println("Not");
		}
		
		//anagram
		String s2 = "listen";
		String s3 = "silentt";
		
		String a=s2.chars().mapToObj(x->String.valueOf((char) x))
				.sorted().collect(Collectors.joining());
		String b=s3.chars().mapToObj(y->String.valueOf((char) y))
				.sorted().collect(Collectors.joining());
		
		System.out.println(a.equalsIgnoreCase(b));
		
		//two sum
		
		 int[] arr = {2, 11, 15,7, 9};
	        int target = 9;
		
		Map<Integer,Integer> twosum=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int com=target-arr[i];
			if(twosum.containsKey(com)) {
				System.out.println(twosum.get(com)+"  "+i);
			}
			twosum.put( arr[i],i);
		}
 			 
  }
  
  
			
	
  public static void main(String[] args) {
		freq();
	}
}
