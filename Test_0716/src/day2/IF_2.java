package day2;

public class IF_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if - else if
		// 점수 85
		
		int score = 75;
		
		if(score >=90) {
			System.out.println("A학점!");
		}else if(score >=80) {
			System.out.println("B학점!");
		}else if(score >=70) {
			System.out.println("C학점!");
		}else if(score >=60) {
			System.out.println("D학점!");
		}else {
			System.out.println("공부좀 하셈!");
		};	
		System.out.println("종료");
	}
}
