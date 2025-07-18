package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤 구구단문제를 5문제 출제
		// 정답이면 " 정답" 출력 ,오답이면"오답"출력
		// 5문제를 다 푼후에 한문제당 20점으로 가정하고 체점
		// ex) 3문제를 맞추면 마지막에 "60점 입니다." 출력
		
//		Random ran = new Random();
//		Scanner s = new Scanner(System.in);
//
//		int num = 0;
//		for(int i =1; i<=5; i++) {
//			int x = ran.nextInt(8) + 2; //2~9
//			int y = ran.nextInt(9) + 1; //1~9
//			System.out.println(i+" 번 : "+ x + " * " + y + " = ");
//			int answer = s.nextInt();
//			if(answer == (x * y)) {
//				System.out.println("정답");
//				num+=20;
//			}else {
//				System.out.println("오답");
//			}
//		}
//		System.out.println(num+"점 입니다");
		
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int score=0; // 맞춘 문제수
		System.out.println("원하는 문제수를 입력해주세여: ");
		int num = s.nextInt(); // 총 문제수
		System.out.println(num +"문제 풀이 시작됩니다. 정답에 0을 입력하면 종료됩니다.");
		// 문제 시작//
		for(int i =1; i<=num; i++) {

			int x = ran.nextInt(8) + 2; //2~9
			int y = ran.nextInt(9) + 1; //1~9
			
			System.out.println(i+" 번 : "+ x + " * " + y + " = "); 
			
			int answer = s.nextInt(); // 문제 정답;
			
			if(answer == (x * y)) {
				System.out.println("정답 입니다");
				score++; //정답 일떄 맞춘 문제수 증가
			}else if(answer == 0) {
				System.out.println("0을 입력하여 종료됩니다..");
				num=i-1; // ex) 3번에서 0을 입력하면 2번까지 푼거이기떄문에 -1
				break;
			}else {
				System.out.println("오답입니다");
		}
	}
		
		System.out.println("총 "+num+"문제 중" +score + "문제를 맞추셧습니다");}
}
