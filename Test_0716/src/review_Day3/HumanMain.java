package review_Day3;

public class HumanMain {
	public static void main(String[] args) {
		
		
//		Human hong;
//		hong = new Human();
		
		
//		Human hong = new Human("");
//		hong.name = "홍길동";
//		hong.eat();
//		hong.money=10000;
//		
//		Human kim = new Human();
//		kim.name = "김철수";
//		System.out.println(kim.money);
		
		Human hong = new Human("홍길동",30,"인천",10000);
		System.out.println(hong.name);
		Human kim = new Human("김철수",25,"서울",5000);
		System.out.println(kim.name);
		
		Human park  = new Human("박영희", 20000);
		Human yu = new Human("유재석", 40 , " 제주도");
				
	}
}
