package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤한 구구단 문재를 출제
		// 맞췄을 때 점수를 준다거나 , 맞춘 계수를 판단
		// Math, Random

//		int num=Math.max(1, 10);
//		System.out.println(num);

		Random ran = new Random();
//		int x = ran.nextInt(10);// 0~9까지 10개
//		int y =ran.nextInt(10+1);//
//		System.out.println(x);
		int x = ran.nextInt(8) + 2;
		int y = ran.nextInt(9) + 1;
		System.out.println("랜덤 구구단 문제 풀이");
		System.out.print(x + " * " + y + " = ");

		// 정답을 입력받고
		// 정답이면 "정답입니다." , 오답이면 "틀렸습니다."출력

		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		if (answer == (x * y)) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}

	}
}
