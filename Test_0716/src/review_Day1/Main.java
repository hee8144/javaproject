package review_Day1;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	static Random ran = new Random();
	
	public static int[] randomGuGuDan(int num){
		int count = 0;
		System.out.println(num + "문제 풀이를 시작합니다.");
		for(int i = 1; i<=num;i++) {
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			System.out.println(x+" * " + y +" = ");
			int answer = s.nextInt();
			if(answer == x*y) {
				System.out.println("정답입니다.");
				count++;
			}else {
				System.out.println("오답입니다. 정답은 "+( x* y)+"입니다.");
			}
	}
		int arr[] = {count,3-count,num};
		return arr;
}
	
	public static void gamgUpAndDown() {
		//1부터 30사이의 랜덤한 숫자 생성후
		// 값을 입력받아서 몇번안에 맞추는지 출력해준 후 종료
		// 랜덤숫자가 입력값보다 더  클경우 => "UP"
		// 작을 경우 => "DOWN"출력
		// 정답을 맞추면 "OO번만에 맞추셧습니다."출력
		int count =1;
		int number = ran.nextInt(30)+1;
		System.out.println("Up&Down 게임 시작!");
		while(true) {
			System.out.println(count + " 번째 정답을 입력해주세요. : ");
			int answer = s.nextInt();
			count++;
			if(answer < number ) {
				System.out.println("UP");
				
			}else if(answer > number){
				System.out.println("DOWN");
			}else {
				System.out.println(count +"번만에 맞추셧습니다.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int correctCount = 0;
		int inCorrectCount = 0;
		int count = 0;
		while(true) {
			System.out.println("=== 메뉴를 선택해주세요. ===");
			System.out.println("[ (1)랜덤구구단 (2)Up&Down (3)구구단 성적 조회 (그외)종료 ] :");
			
			int menu = s.nextInt();
			if(menu == 1) {
				System.out.print("풀이하고자 하는 문제수를 입력해주세요 : ");
				int arr[] = randomGuGuDan(s.nextInt());//랜덤구구단
				correctCount += arr[0];
				inCorrectCount +=arr[1];
				count += arr[2];
				}else if(menu==2) {
					gamgUpAndDown();
			}else if(menu==3) {
				System.out.println(count + "문제 중" + correctCount + "개 맞추셧습니다.");
			}else {
				break;
			}
		}
	}
}