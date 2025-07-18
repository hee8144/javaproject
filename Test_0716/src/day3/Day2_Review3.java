package day3;

import java.util.Scanner;

public class Day2_Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력 해주세요 : ");
		int num1 = s.nextInt();
		//if ~ else if
		// 90점 이상이면 'A학점'
		// 80점 이상이면 'B학점'
		// ...
		// 60점이상이면 ' F학점'
		
		//0~100 사이 값이 아닌 숫자를 입력했을경우
		// '잘못된 점수 입니다'라고 출력
		
		//0~100 사이 값을 입력할 경우 'A출력
		//아닐경우 'B' 를 출력
		
		if(num1 >= 0 && num1 <=100) {
			if(num1 >=90){
				System.out.println("A학점");
			}else if(num1>=80) {
				System.out.println("B학점");
			}else if (num1>=70) {
				System.out.println("C학점");
			}else if (num1 >=60) {
				System.out.println("D학점");
			}else {
				System.out.println("F학점");
			}		
		}else {
			System.out.println("잘못된 점수 입니다.");
		}
	}

}
