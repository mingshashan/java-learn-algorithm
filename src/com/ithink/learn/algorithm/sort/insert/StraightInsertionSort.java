package com.ithink.learn.algorithm.sort.insert;

import java.util.Arrays;

public class StraightInsertionSort {
	
	public static int[] sort(int[] array) {
		int index = 0;
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			index = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			
			if (index == i) {
				continue;
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{7, 9, 1, 0, 7, 3, 6};
		
		int[] sortedArr = sort(array);
		
		System.out.println(Arrays.toString(sortedArr));
	}
}
