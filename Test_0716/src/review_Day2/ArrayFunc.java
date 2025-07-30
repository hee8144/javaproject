package review_Day2;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {

	// 배열의 모든 값을 음수로 만드는 메솓
	// parameter1: 정수형배열

	public static void minuArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
		}
	}

	// 매열에서 가장큰값을 나타내주는 메소드
	// parameter1: 정수형배열
	public static int max(int[] arr) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	// 배열의 모든 값의 합을 더해서 리턴하는 메소드
	// parameter1: 정수형배열

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 배열에서 특정인덱스(parameter2) 의 값을 리턴하는 메소드
	// parameter1: 정수형배열
	// parameter2: 정수(배열의인덱스)

	public static int indexValue(int[] arr, int index) {
		return arr[index];
	}

	// 배열의 편균값을 리턴해주는 메소드
	// parameter1: 정수형배열

	public static double avg(int[] arr) {
		double avg = (double) sum(arr) / arr.length;
		return (double) avg;
	}

	// 배열에서 특정값(parameter2)이 있는지 없는지 판별하는 메소드
	// parameter1: 정수형배열
	// parameter2: 정수(찾고자하는것)
	// return : true or false
	public static boolean searchValue(int arr[], int num) {
		boolean flg = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				flg = true;
			}
		}
		return flg;
	}

	// 배열에 랜덤한 값을 넣어서 만든 후 리턴해주는 메소드
	// parameter1: 배열 사이즈
	// paramerer2:랜덤숫자의 시작점
	// parameter3 랜덤숫자의끝 숫자
	// return 랜덤숫자가 담긴 배열

	public static int[] randomArr(int size, int start, int end) {
		int arr2[] = new int[size];
		Random ran = new Random();
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = ran.nextInt(end - start + 1) + start;
			for (int j = 1; j < i; j++) {
				if (arr2[j] == arr2[i]) {
					i--;
					break;
				}
			}
		}
		return arr2;
	}

	// 배열에서 홀수 , 짝수 의 개수를 리턴해주는 메소드
	// parameter1: 정수형배열
	// parameter2:홀수,짝수 구분 문자열
	// **A에 odd , even 외에 값에대한 예외처리
	public static int arrLength(int arr[], String A) {

		int size = 0;
		int num = A.equals("even") ? 0 : 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == num) {
				size++;
			}
		}
		return size;
	}

	// 배열에서 홀수 , 짝수 따로 분리해서 배열로 만든 후 리턴해주는 메소드
	// parameter1: 정수형배열
	// parameter2: 문자열 => 홀수,짝수 구분 문자열
	//parameter3 : 정수 => 홀수 혹은 짝수 배열의 개수
	// **A에 odd , even 외에 값에대한 예외처리
	public static int[] returnArr(int arr[], String A, int size) {

		int Arr[] = new int[size];
		int count = 0;
		int num = A.equals("even") ? 0 : 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == num) {
				Arr[count++] = arr[i];
			}
		}
		return Arr;
	}

	public static int[] returnArr(int arr[], String A) {
//		int size = arrLength(arr,A);
//		int Arr[] = new int [size];
//		int count=0;
//		int num = A.equals("even") ? 0:1; 
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == num) {
//				Arr[count++]=arr[i];
//			}
//		}
		return returnArr(arr, A, arrLength(arr, A));
	}

	public static void descSort(int[] arr) {
		minuArr(arr);
		Arrays.sort(arr);
		minuArr(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {

	}
}
