package Day8;

public class ColorPoint extends Point{
	private String color;
	int x;
	int y;
	ColorPoint(){
		this(0,0,"Black");
	}
	public ColorPoint(int x , int y) {
		super(x,y);
		this.color = "Black"; 
	}
	

	public ColorPoint(int x, int y,String color) {
		super(x, y);
		this.color = color;
	}
	public String setColor(String color) {
		this.color = color;
		return color;
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public String toString() {
		return color + "색의"+ "(" + getX() +","+getY()+")";
	}
	
}
