package review_Day2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		// 숫자 5개를 입력받아서 배열에 저장하고
		// 해당 배열의 평균을 구하세요
//		
//		Scanner s = new Scanner(System.in);
//		int arr[]= new int [5];
//		for(int i = 0; i<arr.length;i++) {
//			System.out.println((i+1)+" 번째 숫자 입력 : ");
//			arr[i] = s.nextInt();
//		}
//		System.out.println("평균 : "+ArrayFunc.avg(arr));

		// ---------------------
		// 5개의 공간을 가지는 배열에 랜덤한 숫자 (1~10) 사이 값을 넣고
		// 해당 값들중에서 가장큰값을 출력

//		int arr2[] = new int[5];
//		Random ran = new Random();
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = ran.nextInt(10) + 1;
//			for (int j = 1; j < i; j++) {
//				if (arr2[j] == arr2[i]) {
//					i--;
//					break;
//				}
//				System.out.println(Arrays.toString(arr2));
//			}
//			System.out.println(ArrayFunc.max(arr2));

		int[] arr3 = ArrayFunc.randomArr(5, 20, 100);
		// 첫번째 파라미터 : 랜덤한 숫자의계수(배열의크기)
		// 두번쨰 파라미터 : 랜덤한 숫자의 시작점;
		// 세번째 파라미터 : 랜덤한 숫자의 끝;
		// 결론 5개의공간을 가지는 배열 생성후
		// 20~100사이의 랜덤한 값을 넣고 해당 배열리턴
	}
}
