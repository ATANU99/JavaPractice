package com.java.practice.top_50;

public class Merge_Two_Sorted_Arrays {

	public static void main(String[] args) {

		int arr1[] = { 1, 3, 5 };
		int arr2[] = { 2, 4, 6 };

		int n = arr1.length + arr2.length;

		int res[] = new int[n];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				i++;
			} else {
				res[k] = arr2[j];
				j++;
			}
			k++;

		}

		while (i < arr1.length) {

			res[k] = arr1[i];
			i++;

			k++;

		}

		while (j < arr2.length) {

			
				res[k] = arr2[j];
				j++;

				k++;
			

		}

		for (int e : res) {
			System.out.println(e);
		}

	}

}
