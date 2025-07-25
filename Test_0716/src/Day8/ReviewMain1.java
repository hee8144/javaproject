package Day8;

public class ReviewMain1 {

	static void varParameter(int age, String name) {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+age);
	}
	
	static void objParameter(Animal_Riview animal) {
		System.out.println("이름 : " + animal.getName());
	}
	public static void main(String[] args) {
//		
//		Animal_Riview cat = new Animal_Riview("고양이", 3);
//		cat.eat();
//		cat.speak();
////		cat.walk(); // 자식 클래스 메소드는 부모클래스가 호출 x
//		
//		Dog_Review dog = new Dog_Review("강아지", 5, "푸들");
//		dog.eat();
//		dog.speak();
//		dog.walk();
//		
		int a= 20;
		String b = new String("홍길동");
		
		varParameter(a, b);
		
		Animal_Riview cat = new Animal_Riview("고양이", 3);
		objParameter(cat);
		
		Dog_Review dog = new Dog_Review("강아지", 5, "푸들");
		objParameter(dog);
		
		
	}
}
