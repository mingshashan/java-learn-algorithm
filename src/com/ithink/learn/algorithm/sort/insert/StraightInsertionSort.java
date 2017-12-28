package com.ithink.learn.algorithm.sort.insert;

import java.util.Arrays;

/**
 * 插入排序：
 * 假定数组的第一个元素是一个有序序列，然后从第二个元素开始将元素追个插入到前面的有序队列中
 * 需要不断的移动序列，将元素插入到合适的位置
 * @author mingshashan
 *
 */
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
