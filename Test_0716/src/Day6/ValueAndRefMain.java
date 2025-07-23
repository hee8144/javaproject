package Day6;

import java.util.Arrays;

public class ValueAndRefMain {
	public static void main(String[] args) {
		ValueAndRef V = new ValueAndRef();
		int x= 10;
		V.ValueTest(x);
		
		System.out.println(x);
		
		int arr[]= {1,2,3,4,5};
		V.refTest(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
