package Day4;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가장큰 값과 작은값의 위치바꾸기
		
		int arr[]= {20,5,25,10,3};
		int maxIndex= 0;
		int minIndex= 0;
		for(int i = 1 ; i <arr.length;i++) {
			if(arr[i]>arr[maxIndex]) {
				maxIndex = i;
			}
			if(arr[i]<arr[maxIndex]) {
				minIndex = i;
			}
		}
		System.out.println("가장큰값의 위치는 : "+maxIndex+"번째 입니다");
		System.out.println("가장작은값의 위치는 : "+minIndex+"번째 입니다");
		
		int temp = arr[maxIndex];
		arr[maxIndex]=arr[minIndex];
		arr[minIndex]=temp; 
		System.out.println(Arrays.toString(arr));
		
	}
}
