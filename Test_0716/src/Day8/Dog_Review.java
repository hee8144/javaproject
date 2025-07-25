package Day8;

public class Dog_Review extends Animal_Riview{

	String dogBreed;
	
	Dog_Review(String name, int age,String dogreed) {
		
		super(name, age);
		this.dogBreed=dogreed;
	}
	
	void walk() {
		System.out.println(dogBreed + "가 산책한다.");
	}
	
	@Override
	void speak() {
		System.out.println(dogBreed + "가 멍멍 짓는다.");
	}
}
