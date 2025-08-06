package Day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		try {
			System.out.println("숫자 입력 1 : ");
			int num1 = s.nextInt();
			System.out.println("숫자 입력 2 : ");
			int num2 = s.nextInt();
			System.out.println(num1/num2);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나눌수없습니다.");
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력해라.");
		}
	}
}
