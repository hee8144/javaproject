package Day5;

public class calcMain {
	
	public static void main(String[] args) {
		//calculator 클래스를 이용해서
		//calc라는 이름의 객체를 생성
		
		Calculator calc = new Calculator();
		calc.intro();
		calc.returnNumber();
		int number1 = calc.returnNumber();
		
		int number2 = calc.sum(10,10);
		
		
		int max = calc.max(5,8); // 더 큰 숫자를 리턴하는 max 함수 만들기
		System.out.println(max);
		
		int arr[] = {3,5,2,4,1};
		int arrSum = calc.arrSum(arr);
		System.out.println(arrSum);
		
		calc.intro2("홍길동",30,170.9);
	}
	
}
