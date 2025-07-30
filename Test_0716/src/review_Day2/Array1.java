package review_Day2;

import java.util.Arrays;

public class Array1 extends ArrayFunc{

	public static void main(String[] args) {

		int arr[] = { 5, 8, 2, 6, 10, 4 };
		minuArr(arr);
		Arrays.sort(arr);
		minuArr(arr);
		System.out.println(Arrays.toString(arr));
		
		int maxValue = ArrayFunc.max(arr);
		
		System.out.println(maxValue);
	}

}
