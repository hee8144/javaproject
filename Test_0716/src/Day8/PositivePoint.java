package Day8;

public class PositivePoint extends Point {
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int x, int y) {
		super(x,y);
		if(x < 0 || y <0 ) {
			super.move(0, 0);
		}
	}
	protected void move(int x, int y) {
		if(x >= 0 && y >=0 ) {			
			super.move(x, y);
		}
	}

	public String toString() {
		return "(" + getX() + "," + getY() + ",)";
	}

}
