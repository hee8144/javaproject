package review_Day3;

public class Fruit {
	private String name;
	private String color;
	private int price;
	
	public Fruit(){}
	public Fruit(String name) {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		String status = "M";
		if(status.equals("M")) {
			System.out.println("수정권한이 없습니다.");
			return;
		}
		
		if(price <=0) {
			System.out.println("가격을 다시 확인해주세요.");
		}
		this.price = price;
	}
	public void sell() {
		System.out.println(name + "를 판매하셧습니다.");
	}
}
