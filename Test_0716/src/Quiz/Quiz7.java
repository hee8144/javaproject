package Quiz;

import java.util.Arrays;
import java.util.Random;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[5];
		
		Random ran = new Random();
		for(int i = 0 ; i<5;i++) {
			int a = ran.nextInt(30)+1;
			if(a % 2== 1) {
				arr[i]=a;				
			}else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
