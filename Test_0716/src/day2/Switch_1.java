package day2;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~6사이 값을 입력 받아서
		// 입력한 숫자 + "학년입니다"
		Scanner s = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요:");
		int num = s.nextInt();

		switch (num) {
			case 1:
				System.out.println("1학년은 30점이상합격");
				break;
			case 2:
				System.out.println("2학년은 40점이상합격");
				break;
			case 3:
				System.out.println("3학년은 50점이상합격");
				break;
			case 4:
				System.out.println("4학년은 60점이상합격");
				break;
			case 5:
				System.out.println("5학년은 70점이상합격");
				break;
			case 6:
				System.out.println("6학년은 80점이상합격");
				break;
			default:
				System.out.println("잘못입력하셧습니다.");
		}

	}

}
