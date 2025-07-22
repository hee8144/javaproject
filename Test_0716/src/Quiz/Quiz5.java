package Quiz;

import java.util.Arrays;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,7,10,6,15,2};
		int sum = 0;
		for(int i = 0 ; i < arr.length;i++) {
			sum+=arr[i]; 
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("모든숫자들의 합 :" + sum);
		System.out.println("모든숫자들의 평균 :" + sum/arr.length);
	}

}
