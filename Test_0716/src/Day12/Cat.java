package Day12;

public class Cat extends Animal{

	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();
	}
}
