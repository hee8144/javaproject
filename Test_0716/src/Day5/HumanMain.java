package Day5;

public class HumanMain {
	public static void main(String[] args) {
		Human hong = new Human("홍길동",30,"인천");
//		hong.name= "홍길동";
		hong.eat();
		System.out.println(hong.name);
		
		Human kim = new Human("김철수",25,"서울");
//		kim.name = "김철수";
		kim.study();
		System.out.println(kim.name);
		
		Human park = new Human("박영희",20);
		park.eat();
	}
}
