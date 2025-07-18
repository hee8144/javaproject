package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 무한루프
		// 사용자가 5문제를 맞추면
		// "5문제를 맞추셧습니다" 출력하고 종료
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		int count = 0;
		System.out.println("랜덤구구단 문제 풀이(0을 누르면종료됩니다.)");
		while (true) {
			int x = ran.nextInt(8) + 2;//2~9
			int y = ran.nextInt(9)+1;//1~9
			System.out.print( x +" * "+ y + " = ");
			int answer = s.nextInt();
			if(answer == x * y) {
				count++;
			}else if(answer == 0) {
				break;
			}
		}
		System.out.println(count +" 문제를 맞추셧습니다.");
	}
}
