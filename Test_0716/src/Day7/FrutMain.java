package Day7;

public class FrutMain {

	public static void fruitBoxing(Fruit f, int num) {
		System.out.println(f.name +"를"+num +"개 포장했습니다. ");
	}
	
		
	public static void main(String[] args) {
		Apple apple = new Apple("사과", 1000);
		fruitBoxing(apple, 3);
		Orange orange = new Orange("오렌지", 1500);
		fruitBoxing(orange, 5);
		Banana banana = new Banana("바나나", 500);
		fruitBoxing(banana, 6);
		
		
		Fruit goldApple = new Apple("황금사과",40000);
		Fruit jejuOrange = new Fruit("제주오렌지", 5000);
		Fruit goldBababa = banana;
	}
}
