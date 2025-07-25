package Day8;

public class Point3D extends Point{
	private int z;
	Point3D(int x , int y ,int z){
		super(x,y);
		this.z=z;
	}
	
	void moveUp() {
		z++;
	}
	void moveDown() {
		z--;
	}
	@Override
	public String toString() {
		return "(" + getX() +","+getY()+","+ z+")";
	}
//	public void move(int x, int y,int z) {
//		move(x,y);
//		this.z=z;
//	}
	void move(int x, int y,int z) {
		super.move(x, y);
		this.z=z;
	}
}
