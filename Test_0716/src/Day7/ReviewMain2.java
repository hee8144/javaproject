package Day7;

import java.util.Arrays;

public class ReviewMain2 {
	public static void main(String[] args) {
		int a= 10;
		int b= a;
		b=15;
		System.err.println(a);
		
		Fruit_Review1 orange = new Fruit_Review1("오렌지",1000);
//		Fruit_Review1 jejuOrange = orange;
		Fruit_Review1 jejuOrange = new Fruit_Review1("제주오렌지",1000);
		
		System.out.println(orange.getPrice());
		jejuOrange.setPrice(2000);
		System.out.println(orange.getPrice());
		
//		int arr[]= {1,3,2,4,5};
//		int arr2[]= arr;
//		arr2[2] = 999999;		
//		System.out.println(Arrays.toString(arr));
		
		int arr[] = {1,3,2,4,5};
		int arr2[] = new int [arr.length];
		for (int i = 0 ; i< arr.length; i ++ ) {
			arr2[i] = arr[i];
		}
//		arr2= arr.clone();
		System.out.println(Arrays.toString(arr2));
		
	}
}
