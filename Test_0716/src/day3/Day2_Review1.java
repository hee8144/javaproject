package day3;

public class Day2_Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // 연산자
		int num1 = 10;
		// num1에 3을 더해서 다시 저장해라
		num1 = num1 +3 ; 
		num1 += 3;
		
		int num2= 5;
		int num3 = 10;
		
		// 비교 연산자
		System.out.println(num2 > num3);//f
		System.out.println(num2 < 10); //t
		System.out.println(num2 >= 5);//t
		System.out.println(num3 <=10);//t
		System.out.println(num2 == num3);//f
		System.out.println(num2 != num3);//t
		
		//물리연산자
		// or (||)=> 둘 중 하나라도 참여만 결과가 참(true)
		// and(&&) => 둘 다 참이여야 결과가 참(true)
		System.out.println(num2 > num3 || num2 > num3) ;// t		
		System.out.println(num2 > num3 && num2 > num3) ;// f
	
		
		
	}

}
