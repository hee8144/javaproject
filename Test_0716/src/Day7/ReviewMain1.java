package Day7;

public class ReviewMain1 {

	public static void main(String[] args) {
		Fruit_Review1 apple = new Fruit_Review1("사과", 1000);
		//apple.price = 99999999; private이라서 접근불가능
		
		apple.setPrice(2000);
	}
}
