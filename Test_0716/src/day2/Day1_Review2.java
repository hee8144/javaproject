package day2;

public class Day1_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//
		//
		String name = "홍길동";
		int age = 30;
		System.out.println(name + age); // 홍길동30
		System.out.println(age + 5); // 35
		System.out.println(name + age + 5); // 홍길동305
		System.out.println(name + (age + 5));// 홍길동 35

		// 정수의 정수의 계산 결과는 정수;
		// 실수와 정수의 계산 결과는 실수 (실수가 1개라도 있으면 결과는 실수)
		int num1 = 10;
		int num2 = 4;
		System.out.println(num1 / num2);// 2
		System.out.println(num1 / (double) num2);// 2.5
		double num3 = 4.0;
		System.out.println(num1 / num3);// 2.5

		// % -> 나머지연산(나눴을떄 나머지값을리턴)
		int num4 = 10;
		System.out.println(num4 % 2);
		System.out.println(num4 % 3);
		System.out.println(num4 % 4);
		

	}

}
