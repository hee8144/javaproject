package day2;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 3;
		int num2 = 5;
		num1 += 5;
		System.out.println(num1); //8
		num2 -= 2;
		System.out.println(num2); // 3

		int num3 = 5; 
		int num4 = 10;
		System.out.println(num3 > 3); //t
		System.out.println(num4 < num4); // f
		System.out.println(num3 <= 5); // t
		System.out.println(num4 == 10); //t
		System.out.println(num3 != 8);//t

		System.out.println(num3 > 5 || num4 > 8); //t
		System.out.println(num3 > 3 && num4 > num3); // t
		System.out.println(!(num3 > 3) && num4 > num3); //f		
		
	}
}


