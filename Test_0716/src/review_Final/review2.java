package review_Final;

public class review2 {
	public static void main(String[] args) {
		// % 나머지 연산 많이쓰임
		// and , or 
		int a = 10;
		int b= 3;
		String str= "홍길동"; //pdf 리터널 메모리 참고
		String str2= new String("홍길동");
		
		//and(&&)는 둘다 true 일떄만 true , 나머지는 false;
		System.out.println(a>b && str.equals("홍길동"));
		//or(||)는 하나라도 true라면 결과가 true
		System.out.println(a<b || str.equals("홍길동"));
		
		System.out.println((double)a/b);
	}
}
