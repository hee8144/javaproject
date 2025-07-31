package review_Day3;

public class Human {

	
	String name;
	int age;
	String addr;
	int money;
	
	
	public Human(String name , int age, String addr , int money) {
		this.name= name;
		this.age=age;
		this.addr=addr;
		this.money=money;
		System.out.println(name+"객체 생성");
	}
	
	public Human(String name , int age, String addr ) {
		this.name= name;
		this.age=age;
		this.addr=addr;
		System.out.println(name+"객체 생성");
	}
	
	public Human(String name ,  int money) {
		this.name= name;
		this.money=money;
		System.out.println(name+"객체 생성");
	}
	
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다");
	}
}
