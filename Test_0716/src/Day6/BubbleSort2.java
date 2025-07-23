package Day6;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		
		int arr[] = {3,5,1,4,2};
		
		for(int i = 1;i<arr.length;i++) {
			for(int j = 0; j<arr.length - i;j++) {
				if(arr[i] < arr[i+1]) {
					int temp = arr[i];
					arr[i]= arr[i+1];
					arr[i] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
