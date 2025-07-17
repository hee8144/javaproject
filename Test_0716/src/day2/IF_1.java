package day2;

public class IF_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문(if)
		int age = 20;
		// 단순if문

//		if (age >= 19) {
//			System.out.println("성인입니다.");
//		}

		// if - else
		if (age >= 19) {
			//괄호안의 조건이 true 일떄 실행
			System.out.println("성인입니다.");
		}else {
			//괄호안의 조건이 false일떄 실행
			System.out.println("청소년입니다.");
		}

		System.out.println("종료!");
	}

}
