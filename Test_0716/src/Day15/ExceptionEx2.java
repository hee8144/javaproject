package Day15;

import java.util.Scanner;

public class ExceptionEx2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		try {
			System.out.println("숫자 입력 1 : ");
			int num1 = s.nextInt();
			System.out.println("숫자 입력 2 : ");
			int num2 = s.nextInt();
			System.out.println(num1/num2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러가 발생했음.");
		}
	}
}
