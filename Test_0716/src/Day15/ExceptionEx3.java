package Day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		while(true) {
			try {
				System.out.println("숫자 입력 1 : ");
				int num1 = s.nextInt();
				System.out.println("숫자 입력 2 : ");
				int num2 = s.nextInt();
				System.out.println(num1/num2);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println("예상치 못한 에러 발생");
				s.nextLine();
			}
			
		}
	}
}
