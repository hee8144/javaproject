package day2;

import java.util.Scanner;

public class Loop_For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자를 하나 입력받아서 해당숫자의 구구단을 출력
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자하나를 입력해주세요:");
		int dan = s.nextInt();
		
		for(int i = 9 ; i>=1;i--) {
			System.out.println(dan + " * " + i + " = " + (dan*i) );
		}
	}

}
