package Quiz;

import java.util.Arrays;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,7,10,6,15,2};
		int maxIndex=0;
		for(int i =1; i<arr.length;i++) {
			if(arr[maxIndex] < arr[i]) {
				maxIndex=i;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("가장큰값의 위치는 "+maxIndex+"번쨰 입니다");
		
	}

}
