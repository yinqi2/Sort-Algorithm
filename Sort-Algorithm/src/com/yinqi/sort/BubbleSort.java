package com.yinqi.sort;

public class BubbleSort {

	public static void main(String[] args) {
        //测试数组
		int[] arr = {4, 6,3,2,5,9,0}; 
		bubbleSort(arr,7);
		for(int i = 0;i<7;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	// 从小到大排序,arr为待排序数组，n为数组长度。
	public static void bubbleSort(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				// 判断相邻元素位置是否正确，若不正确则交换两者位置。
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}
}
