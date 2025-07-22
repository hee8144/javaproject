package Quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int num = s.nextInt();
		if(num <= 0 || num >11 ) {
			System.out.println("계산할 수 없습니다.");
		}else if(num % 2==0){			
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

}
