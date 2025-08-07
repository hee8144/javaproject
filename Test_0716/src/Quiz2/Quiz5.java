package Quiz2;

import java.util.Arrays;
import java.util.Random;

public class Quiz5 {
	
	
	public static int maxmin(int arr[]) {
		int max=0;
		int min=0;
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]<0) {
				arr[i] = -arr[i];
			}else {
				arr[i] = arr[i];
			}
		}
		max=arr[arr.length-1];
		min=arr[0];
		return max-min;
	}
	
	public static int[] randomNum() {
		Random ran =new Random();
		int arr[] = new int [5];
		for(int i=0; i<arr.length;i++) {
			arr[i] = ran.nextInt(31)-15;
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[] =randomNum();
		System.out.println(Arrays.toString(arr));
		System.out.println(maxmin(arr));
	}
}
