package Day6;

public class Calc_Review {
	// 메소드 오버로딩
	// 동일한 이름의 메소드 여러개 만드는거
	// 매개변수의 개수나 타입이 달라야 한다.
	// 리턴타입으로는 구분할 수 없다.

	// 개발자 작성한 생성자가 1개도 없을경우
	// 기본 생산자가 자동으로 만들어진다.
	// 개발자가 작성한 생성자가 1개라도 있으면.
	// 기본 생성자는 만들어 지지않는다.

	int sum(int x, int y) {
		return x + y;
	}

	double sum(double x, int y) {
		return x + y;
	}

	double sum(double x, double y) {
		return x + y;
	}

	int sum(int x, int y, int z) {
		return x + y + z;
	}

}
