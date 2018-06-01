package com.yinqi.sort;

//选择排序
public class SelectSort {

	public static void main(String[] args) {
		// 测试数组
		int[] arr = { 4, 6, 3, 2, 5, 9, 0 };
		selectSort(arr, 7);
		for (int i = 0; i < 7; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	// 从小到大排序,arr为待排序数组，n为数组长度。
	public static void selectSort(int[] arr, int n) {
		int minIndex;
		for (int i = 0; i < n - 1; i++) {
			minIndex = i;
			// 循环找出最小值的下标。
			for (int j = i + 1; j < n; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			// 将最小值与当前位置进行交换。
			if (minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
