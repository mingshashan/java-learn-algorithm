package com.ithink.learn.algorithm.sort.insert;

import java.util.Arrays;

/**
 * 希尔排序
 * 
 * @author mingshashan
 *
 */
public class ShellSort {
	public static int[] sort(int[] array) {
		int temp = 0;
		int step = array.length / 2;

		while (step >= 1) {
			for (int i = 0; i < step; i++) {
				for (int j = i + step; j < array.length; j = j + step) {
					if (array[j] < array[j - step]) {
						temp = array[j];
						int k = j - step;
						while (k >= 0 && array[k] > temp) {
							array[k + step] = array[k];
							k = k - step;
						}

						array[k + step] = temp;
					}
				}
			}

			step = step / 2;
		}

		return array;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 7, 9, 1, 0, 7, 3, 6 };

		int[] sortedArr = sort(array);

		System.out.println(Arrays.toString(sortedArr));
	}
}
