package day3;

import java.util.Scanner;

public class Loop_For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9단 => 2단
		
//		for(int i = 9 ; i >=2 ; i-- ) {
//			System.out.println(i);
//			for(int j= 9; j >=1; j--) {
//				System.out.println(i + " * " + j+ " = " + ( i * j));
//			}
//		}
		
		// 숫자를 하나 입력받아서 해당 숫자만큼 늘어나느 별찍기
		System.out.print("숫자를 입력하세요 :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i= 1; i<= num; i++) {
			for(int j =1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
