package day3;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Up & Down Game Start");
		int random = ran.nextInt(100)+1;
		int count = 0;
		int num= 0;
		while(true) {
			System.out.println("숫자 입력: ");
			int answer = s.nextInt();
			if(!(answer >=1 && answer <=100)) {
				System.out.println("1부터 100사이 값을 입력해주세요");
				continue;
			}
			
			if(num==1) {
				System.out.println("이전 숫자보다 낮은값입니다 다시입력해주세요");
				num = 0;
				
			}else if(num==2) {
				System.out.println("이전 숫자보다 높은값입니다 다시입력해주세요");
				num = 0;
				
			}
			count++;
			if(random > answer ) {
				System.out.println("UP");
				num = 1;
			}else if(random < answer) {
				System.out.println("Down");
				num = 2;
			}else {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println(count + "번만에 맞추셧습니다!");
	}

}
