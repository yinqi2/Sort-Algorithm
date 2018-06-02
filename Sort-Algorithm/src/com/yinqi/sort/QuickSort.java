package com.yinqi.sort;

//快速排序
public class QuickSort {

	public static void main(String[] args) {
		// 测试数组
		int[] arr = { 4, 6, 3, 2, 5, 9, 0 };
		quickSort(arr, 0, 6);
		for (int i = 0; i < 7; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void quickSort(int[] arr, int s, int e) {
		// 递归出口
		if (s >= e) {
			return;
		}
		int i = s;
		int j = e;
		int temp = arr[s];

		while (i != j) {
			while (i < j && arr[j] >= temp)
				j--;
			arr[i] = arr[j];
			while (i < j && arr[i] <= temp)
				i++;
			arr[j] = arr[i];
		}
		arr[i] = temp;
		// 递归调用
		quickSort(arr, s, i - 1);
		quickSort(arr, i + 1, e);
	}
}
