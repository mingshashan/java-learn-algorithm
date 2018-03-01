package com.ithink.learn.algorithm.sort.selection;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] array = new int[]{7, 9, 1, 0, 7, 3, 6};

		int[] sortedArr = sort(array);

		System.out.println(Arrays.toString(sortedArr));
	}

	public static int[] sort(int[] array) {

		if (null == array || 1 >= array.length)
		{
			return array;
		}

		for (int i = array.length / 2 - 1; i < array.length; i++) {
			adjustHeap(array, i, array.length);
		}

		for (int i = array.length - 1; i >=0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			adjustHeap(array, 0, i - 1);
		}

		return array;
	}


	public static void adjustHeap(int[] array, int i, int length) {

		int temp = array[i];

		for (int j = 2 * i + 1; j < length; j = j * 2 + 1) {
			if (j + 1 < length && array[j] < array[j + 1]) {
				j++;
			}

			if (temp >= array[j]) {
				break;
			}

			array[i] = array[j];
			i = j;
		}
		array[i] = temp;
	}

}
