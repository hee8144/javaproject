package day2;

public class Day1_Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증강연산자 ( ++,--)
		int num1 = 5;
		num1++;// 6;
		++num1;// 7;
		System.out.println(num1);

		int num2 = 3;
		// 후위연산자 (++ ,-- 뒤에 붙었을떄)
		// 본인의값 (num2)을 먼저 num3 에 넣고 그다음 본인의 값(num2)을 1증가
		int num3 = num2++;// num2 =4;num3=3;
		System.out.println("num2 :" + num2);// 4
		System.out.println("num3 :" + num3);// 3
		
		//선위연산자(++, -- 앞에 붙었을 때)
		//본인의 값(num4_를 먼저 1증가시키, num5에 넣는다)
		int num4 = 3;
		int num5 = ++num4;//num4 = 4; num5 =4;
		System.out.println("num4 :" + num4);// 4
		System.out.println("num5 :" + num5);// 4
		
		
	}

}
