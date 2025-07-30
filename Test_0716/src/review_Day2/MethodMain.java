package review_Day2;

public class MethodMain {
	
	public static void main(String[] args) {
		String qqq =MethodEx.testA();
		
		System.out.println(qqq);
		
		MethodEx.testB();
		
		int a=10;
		int b = MethodEx.testC(a);
		
		double c = MethodEx.testD(a,1.5);
		
		int testArr[] = {1,2,3,4,5};
		int d = MethodEx.testE(testArr);
		System.out.println(d);
	}
}
