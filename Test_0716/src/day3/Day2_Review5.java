package day3;

import java.util.Scanner;

public class Day2_Review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.숫자를 하나 입력받아서 홀수면 홀수 짝수면 짝수 출력
		// 2.숫자를 5번 입력받아서 해당 숫자들의 합을 출력
		// 3.숫자를 5번 입력받아서 입력받은 수 중에서 가장 큰수만 출력
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요: ");
//		int number = s.nextInt();
//		
//		if(number % 2==0) {
//			System.out.println("짝수입니다");
//		}else {
//			System.out.println("홀수입니다");
//		}
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력해주세요");
//		int number1 = s.nextInt();
//		System.out.print("두번째 숫자를 입력해주세요");
//		int number2 = s.nextInt();
//		System.out.print("세번째 숫자를 입력해주세요");
//		int number3 = s.nextInt();
//		System.out.print("네번째 숫자를 입력해주세요");
//		int number4 = s.nextInt();
//		System.out.print("다섯번째 숫자를 입력해주세요");
//		int number5 = s.nextInt();
//		
//		int sum = number1 + number2 + number3 + number4 + number5;
//		System.out.println(sum);
		
		
//		Scanner s = new Scanner(System.in);
//		int sum = 0;		
//		for(int i = 1; i<=5; i++) {
//			System.out.println(i+"번쨰 숫자 입력:");
//			int num = s.nextInt();
//			sum += num;
//		}
//		System.out.println("총 합: "+sum);
		
		//무조건 양수만 입력 가정
		Scanner s = new Scanner(System.in);
		int max = 0;		
		for(int i = 1; i<=5; i++) {
			System.out.print(i+"번쨰 숫자 입력:");
			int num = s.nextInt();
			//모두 음수 입력했을때 정상작동;
			// if(num == 1){
			//max= num;}
		
			if(num > max) {
				max=num;
				System.out.println(num);
			}
		}
		System.out.println("입력한 숫자중 가장 큰수:"+max);
	}
}
