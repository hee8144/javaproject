package Day4;

public class Loop_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while , do-while 차이
		// while은 조건을 맞고하지 않으면 한번도 실행 안할수 있다.
		
		int i = 10;
		while(i<5) {// 조건만족안해서 실행안됨;
			System.out.println("while 실행!");
		}
		
		// do-while 은 조건의 상관없이 무조건 한번은 실행하고 조건비교를 한다.
		
		do {
			System.out.println("do-while 실행!");
		}
		while(i<5);
		
	}

}
