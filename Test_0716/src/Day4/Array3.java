package Day4;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.arr 배열에서 가장 큰값 찾기
//		int arr[]= {1,5,10,25,3};
//		int max = arr[0];
//		
//		for(int i = 1 ; i <arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("가장큰값 : "+max);
		
		//2.arr 배열에서 가장큰값의 위치(index) 찾기
		//내풀이
//		int arr[]= {1,5,10,25,3};
//		int max = arr[0];
//		int maxIndex= 0;
//		for(int i = 1 ; i <arr.length;i++) {
//			if(arr[i]>max) {
//				max= arr[i];
//				maxIndex = i;
//			}
//		}
		//선생님 풀이
		int arr[]= {1,5,10,25,3};
		int maxIndex= 0;
		for(int i = 1 ; i <arr.length;i++) {
			if(arr[i]>arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("가장큰값의 위치는 : "+maxIndex+"번째 입니다");
		
		
	}

}
