package com.java.practice.top_50;

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {

		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int curSum=arr[0];//-2
		int maxSum=arr[0];

		for (int i = 1; i < arr.length; i++) {

			System.out.println(arr[i] +"="+ (curSum+arr[i]));
			curSum=Math.max(arr[i], curSum+arr[i]);
			maxSum=Math.max(maxSum, curSum);
			
			System.out.println(curSum);
			System.out.println(maxSum);
		}
		
		System.out.println(
				"Max"+maxSum);

	}

}
