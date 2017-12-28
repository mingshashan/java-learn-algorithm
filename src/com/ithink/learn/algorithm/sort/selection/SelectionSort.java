package com.ithink.learn.algorithm.sort.selection;

import java.util.Arrays;

/**
 * 选择排序：
 * 每次从未排序的队列中选出最小的，放到已经排好序的队列的最后面，并从无序队列中除去该值
 * @author mingshashan
 */
public class SelectionSort {
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
