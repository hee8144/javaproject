package review_Final;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class review3 {
	public static void main(String[] args) {
		//향상된 for문
		//삼향연산자
		int arr[]= {1,3,5,7,8};
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
		for(int num: arr) {
			System.out.println(num+" ");
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		Random ran = new Random();
		for(int i = 1 ; i< 10; i++) {
			map.put(ran.nextInt(10)+1,ran.nextInt(10)+1 );
		}
		System.out.println(map);
		
		for(int key : map.keySet()) {
			System.out.print(key + "");
		}
		
		//숫자 하나 입력받아서 10보다 크면 ' 큰수 ' 출력 작으면 '작은수 '출력
		Scanner s = new Scanner (System.in);
		if(s.nextInt() > 10) {
			System.out.println("큰수");
		}else {
			System.out.println("작은 수");
		}
		String str = s.nextInt()>10 ? "큰수" : "작은수";
		System.out.println(str);
		
		
		
		
	}
}
