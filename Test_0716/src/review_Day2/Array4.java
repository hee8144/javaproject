package review_Day2;

import java.util.Arrays;

public class Array4 {
	public static void main(String[] args) {
		// 공간은 10개
		// 숫자 범위 : 1~30

		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));

		// 홀수배열
		// 짝수배열
		// oddArr ,evenArr
		int oddArrIndex = 0;
		int evenArrIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArrIndex++;
			} else {
				oddArrIndex++;
			}
		}
		int oddArr[] = new int[oddArrIndex];
		int evenArr[] = new int[evenArrIndex];
		int x=0;
		int y=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[x++] = arr[i];
			} else {
				oddArr[y++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(oddArr));
		System.out.println(Arrays.toString(evenArr));
	}
}
