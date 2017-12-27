package com.ithink.learn.algorithm.sort.insert;

import java.util.Arrays;

public class StraightInsertionSort {

	public static int[] sort(int[] array) {
		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 7, 9, 1, 0, 7, 3, 6 };

		int[] sortedArr = sort(array);

		System.out.println(Arrays.toString(sortedArr));
	}
}
