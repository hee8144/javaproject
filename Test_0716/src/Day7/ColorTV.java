package Day7;

public class ColorTV extends TV {
	private int color;
	
	ColorTV(int size, int color) {
		super(size);
		this.color=color;
		// TODO Auto-generated constructor stub
	}
	
	public void printProperty(){
		System.out.println("결과 : "+getSize() +  "인치 " + color +"컬러");
	}
	
}
