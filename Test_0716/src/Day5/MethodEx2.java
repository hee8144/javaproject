package Day5;

public class MethodEx2 {
	//오버로딩;  똑같은 이름의 메소드를 만들수있다
	// 매개변수 데이터 타입 다르거나 매개변수 갯수가 다르거나;
	
	int sum(int x ,int y) {
		return x+y;
	}
	
	double sum(double x , double y) {
		return x+y;
	}
	
	double sum(double x , int y) {
		return x+y;
	}
	
	int sum(int x, int y, int z) {
		return x+y+z;
	}
}
