package Quiz;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = s.nextInt();
		for(int i =9;i>0;i--) {
			System.out.println(num + " * " + i + " = "+ num*i);
		}
		
		
	}

}
