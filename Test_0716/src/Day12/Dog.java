package Day12;

public class Dog extends Animal{

	public void makeSound() {
		System.out.println("멍멍");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
	}
}
