package day2;

import java.util.Scanner;

public class IF_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학년과 점수는 사용자로 부터 입력을 받는
		// 1~3학년은 점수가 60점 이상이면 합격
		// 4~6학년은 점수가 80점 이상이면 합격
		Scanner s = new Scanner(System.in);
		System.out.print("학년 입력: ");
		int grade = s.nextInt();
		System.out.print("점수 입력: ");
		int score = s.nextInt();
		// grade는 1부터 6까지 입력한다고 가정
		if (grade>= 1 &&grade <= 3) {
			// 1~3학년
			if (score >= 60) {
				System.out.println("합격");
			}
		} else if(grade >=4 && grade <= 6){
			// 4~6학년
			if (score >= 80) {
				System.out.println("합격");
			}
		}else {
			// 1~6 이외의 숫자를 입력했을떄
			System.out.println("학년을 잘못 입력하셧습니다.");
		}

	}

}
