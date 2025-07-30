package review_Day2;

import java.util.Arrays;

public class Array5 {
	public static void main(String[] args) {
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));

		// 홀수배열
		// 짝수배열
		// oddArr ,evenArr
//		int oddArrIndex = 0;
//		int evenArrIndex = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				evenArrIndex++;
//			} else {
//				oddArrIndex++;
//			}
//		}
		int oddsize = ArrayFunc.arrLength(arr,"odd");
		int evensize = ArrayFunc.arrLength(arr,"even");
		
		int[] oddArr = ArrayFunc.returnArr(arr, "odd", oddsize);
		//홀수들만 담긴 배열을 리턴
		int[] oddArr2 = ArrayFunc.returnArr(arr, "odd");
		//홀수들만 담긴 배열을 리턴
		System.out.println(oddsize);
		System.out.println(evensize);
		System.out.println(Arrays.toString(oddArr));
		System.out.println(Arrays.toString(oddArr2));
		
	}
	
	
}
