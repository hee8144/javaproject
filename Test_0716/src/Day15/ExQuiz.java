package Day15;

import java.util.Random;
import java.util.Scanner;

public class ExQuiz {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int answerNumber=0;
		while(true) {
			if(answerNumber > 3) {
				break;
			}
			System.out.println("구구단 문제 시작");
			for (int i = 0; i < 5; i++) {
				int x = ran.nextInt(8) + 2;
				int y = ran.nextInt(9) + 1;
				System.out.print(x + " * " + y + " : ");
				int answer = s.nextInt();
				if(answer == x * y ) {
					System.out.println("정답!");
					answerNumber++;
				}else {
					System.out.println("오답!");
				}
			}
			
		}
	}
}
