package Quiz2;

import java.util.Random;
import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		while (true) {
			int CorNum = 0;
			int inCorNum = 0;
			System.out.print("풀이할 문제수 : ");
			int num = s.nextInt();
			if (num > 2 && num <= 10) {
				for (int i = 0; i < num; i++) {
					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;
					System.out.print(x + " * " + y + " : ");
					int answer = s.nextInt();
					if (answer == x * y) {
						CorNum++;
						System.out.println("정답입니다.");
					} else {
						inCorNum++;
						System.out.println("오답입니다.");
					}
				}
				if (CorNum > inCorNum) {
					System.out.println("통과입니다.");
					break;
				}else {
					System.out.print("재도전 하시겠습니까? : ");
					String answer = s.next();
					if(answer .equals("네")) {
						continue;
					}else {
						System.out.println("종료합니다.");
						break;
					}
				}
			} else {
				System.out.println("문제풀이는 최소3개 , 최대10개입니다.");
				continue;
			}
		}
	}
}
