package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int o = 0;
		int x = 0;
		while (true) {
			System.out.println("******* 랜덤 구구단 문제 ******* ");
			System.out.println("====== 메뉴 선택 ======");
			System.out.print("[ (1)문제풀이 (2)현재스코어 (3)종료 ]");
			int num = s.nextInt();
			if (num == 1) {
				System.out.println("문제풀이를 선택하셧습니다. 정답에 0을 입력하면 메뉴로 이동합니다.");
				for (;;) {
					int a = ran.nextInt(8) + 2;
					int b = ran.nextInt(9) + 1;
					System.out.print(a + " * " + b + " = ");
					int answer = s.nextInt();
					if (answer == a * b) {
						System.out.println("정답입니다");
						o++;
					} else if (answer == 0) {
						System.out.println("0을 입력하셧으므로 메뉴로 이동합니다.");
						break;
					} else {
						System.out.println("오답입니다  !  정답은 " + (a * b) + "입니다.");
						x++;
					}
				}
			} else if (num == 2) {
				System.out.println("현재까지 맞춘 정답 개수: " + o);
				System.out.println("현재까지 틀린 정답 개수: " + x);
			} else if (num == 3) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("1~3중 선택해 주세요");
			}
		}
	}
}
