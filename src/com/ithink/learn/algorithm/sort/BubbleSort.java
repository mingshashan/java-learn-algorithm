package com.ithink.learn.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
	public static int[] sort(int[] array) {
		int temp = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{7, 9, 1, 0, 7, 3, 6};
		
		int[] sortedArr = sort(array);
		
		System.out.println(Arrays.toString(sortedArr));
	}
}
