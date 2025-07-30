package review_Day2;

public class MethodEx {
	public static void main(String[] args) {
		// 0.클래스 이름으로 접근 가능하도록 다 static을 넣을거임 일단.
		// 1. 리턴 타입이 있나 없나
		// 1-1. 리턴 값이 있으면 해당 값의 데이터 메소드명 앞에 넣기.
		// 1-2. 리턴 값이 없으면 메소드명 앞에 void 를 붙인다.

		// ex1) 문자열을 리턴하는 testA라는 이름의 메소드 생성

	}

	public static String testA() {
		String name = "홍길동";
		return name;
	}

	// ex2) 리턴 타입이 없는 testB 라는 이름의 메소드 생성

	public static void testB() {
		System.out.println("void라서 리턴 안됨 출력하고 끝.");
	}

	// 2. 매개변수 ( 파라미터 ) 에 대한 처리 가 중요
	// 2-1. 매개변수의 타입 및 개수가 중요하다.

	public static int testC(int num) {
		return num * 2;
	}
	
	public static double testD(int num1, double num2) {
		return (double) num1 * num2;
	}
	
	//3.배개변수로는 일반데이터 타입뿐만아니라.
	//객체를 받는것도 가능하다.
	
	public static int testE(int[] arr) {
		System.out.println(" 배열의 0 번쨰 인덱스 값 리턴합니다.");
		return arr[0];
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
