package Day4;

import java.util.Scanner;

public class Day3_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for , while , do-while
		
//		for(int i=1 ; i<=10;i++) {
//			System.out.println(i);
//		}
		
//		int i= 10;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		//사용자로부터 양수 5개를 입력받으세여.
		// 0 이하의 숫자를 입력할 경우 다시 입력하도록 유도
		
		Scanner s = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.println("양의 정수를 입력해주세요: ");
			int num = s.nextInt();
			if(num >= 1) {
				count ++;
				if(count >=5) {
					System.out.println("5개 모두 입력했습니다.");
					break;
				}
			}else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}
		
	}

}
