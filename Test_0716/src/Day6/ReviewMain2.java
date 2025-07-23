package Day6;

import java.util.Scanner;

public class ReviewMain2 {
	public static void main(String[] args) {

		Calc_Review Calc = new Calc_Review();
		
		//오버로딩은 호출할 때 데이터 타입이나 개수로 구분된다
		
		
		int a = Calc.sum(10,5);
		double b = Calc.sum(10.5,3);
		double c = Calc.sum(5.8, 9.2);
		int d = Calc.sum(3, 5, 12);
		
		Scanner s = new Scanner(System.in);
		String subject = "자바";
		
		System.out.println("현재 우리가 배우는 과목명은 : ");
		String answer =s.next();
		
		if(subject.equals(answer)) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	}
}
