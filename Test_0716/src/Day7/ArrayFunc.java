package Day7;

import java.util.Arrays;

public class ArrayFunc {

	static public int maxArr(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) { // {3, 5, 12, 8, 15, 7};
				max = arr[i];
			}
		}
		return max;
	}

	static public double avgArr(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double)sum/arr.length;
	}

	static public int[] oddArr(int arr[]) {
		
		int oddCount =0;
		for(int value : arr) {
			if(value % 2 ==1) {
				oddCount++;
			}
		}
		int oddIndex=0;
		int oddArr[] = new int[oddCount];
		for(int i = 0; i< arr.length;i++) {
			if(arr[i] % 2 ==1) {
				oddArr[oddIndex++] =arr[i];
			}
		}
		
		return oddArr;
	}
	
	static public int[] bigNumArr(int arr[]) {
		
		int bigNumArrIndex= 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>=8) {
				bigNumArrIndex++;
			}
		}
		int bigNumArr [] = new int [bigNumArrIndex];
		int num =0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>=8) {
				bigNumArr[num] =arr[i];
				num++;
			}
		}
		
		return bigNumArr;
	}
}
