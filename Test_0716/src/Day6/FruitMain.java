package Day6;

public class FruitMain {
	public static void main(String[] args) {
		
		Fruit banana = new Fruit("banana",1000);
		
		banana.setPrice(2000);
		int price = banana.getPrice();
		System.out.println(price);
		}
}
