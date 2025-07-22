package Day5;

import java.util.Arrays;

public class SelctionSort2 {

	public static void main(String[] args) {
		// 앞에서 했던 선택정렬을 반복문안에 넣어서
		// 확장성 있게 코드를 개선

		int arr[] = { 3, 4, 1, 5, 2 };

		
		for(int j=0; j<arr.length-1;j++) {
			int minIndex = j;
			for (int i = j+1; i < arr.length; i++) {
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
				int temp = arr[j];
				arr[j] = arr[minIndex];
				arr[minIndex] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		
//		for (int i = 0; i < arr.length - 1; i++) {
//			minIndex = i;
//			for (int j = 1; j < arr.length; j++) {
//				if (arr[minIndex] > arr[j]) {
//					minIndex = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[minIndex];
//			arr[minIndex] = temp;
//			System.out.println(Arrays.toString(arr));
//		}
	}
}
