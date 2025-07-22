package Day5;

import java.util.Arrays;

public class Day4_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택정렬

		int arr[] = { 3, 5, 1, 4, 2 };
		// 가장작은 값의 위치찾기(index);
		int minIndex = 0;
	
		for(int i=1; i<arr.length;i++) {
			if(arr[i]<arr[minIndex]) {
				minIndex=i;
			}
		}
		System.out.println(minIndex);
		
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex]= temp;
		
		System.out.println(Arrays.toString(arr));
	}

}
