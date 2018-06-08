package com.yinqi.sort;

public class InsertSort {

	public static void main(String[] args) {
		// 测试数组
		int[] arr = { 4, 6, 3, 2, 5, 9, 0 };
		insertSort(arr, 7);
		for (int i = 0; i < 7; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	//插入排序
	public static void insertSort(int[] arr, int n) {
        //循环插入剩余的元素到以排好序的序列中
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			//从[0~i-1]中寻找正确插入的位置
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}
}
