package review_Day3;

public class GamingLaptop extends Laptop{
	String graphic;
	
	public GamingLaptop(String brand ,double weight , String graphic) {
		super(brand,weight);
		this.graphic=graphic;
		
	}
	
	public void printSpecs() {
		System.out.println(getBrand() + "브랜드의 " +getWeight()+" kg ");
		System.out.println("grapci + 게이밍 노트북");
	}
}
