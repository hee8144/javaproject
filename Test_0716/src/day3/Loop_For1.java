package day3;

import java.util.Scanner;

public class Loop_For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.숫자를 5번 입력받아서 해당 숫자들의 합을 출력
		//조건1. 음수가 들어오면 숫자를 다시 입력하도록
		//조건2. 0을입력하면 더이상 입력하지 않고종료.
		Scanner s = new Scanner(System.in);
		int sum = 0;		
		for(int i = 1; i<=5; i++) {
			System.out.println(i+"번쨰 숫자 입력:");
			int num = s.nextInt();
			if(num<0) {
				System.out.println("음수는 불가능합니다. 다시 입력해주세요.");
				i--;
				continue;
			}else if(num ==0) {
				System.out.println("0을 입력하셧으므로 더이상 진행하지 않습니다.");
				break;
			}
			sum += num;
			
		}
		System.out.println("총 합: "+sum);
	}
}
