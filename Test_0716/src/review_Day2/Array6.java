package review_Day2;

import java.util.Arrays;
import java.util.Random;

public class Array6 {
	public static void main(String[] args) {
		int arr[]=ArrayFunc.randomArr(10, 1, 30);
		//오름차순 -> Arrays.sort(arr);
		// 림차순 => ArrayFunc.descSort(arr);
		ArrayFunc.descSort(arr);
		int arr2[][]= {
				{10,5},{3,7},{2,9}	
		};
		//arr2의 모든값의 합
		int sum=0;
		for(int i = 0; i<arr2.length;i++) {
			for(int j = 0;j<arr2[i].length;j++ ) {
				sum+=arr2[i][j];
			}
		}
		
		//-------------
		// 4* 5 램던한 숫자를 넣으면 좋겠다
		//랜덤한 숫자의 범위는 10~50 사이이면 좋겠다.
		//ArrayFunc클래스의 randomArr()함수를 쓰면 좋겠다.
		
		int arr3[][] = new int[4][5];
		for(int i=0;i<arr3.length;i++) {
				arr3[i]=ArrayFunc.randomArr(5, 10, 50);
				System.out.println(Arrays.toString(arr3[i])+" ");
		}
		
		System.out.println(sum);
	}
}
	