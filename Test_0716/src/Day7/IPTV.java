package Day7;

public class IPTV extends ColorTV {
	private String addr;
	
	IPTV(String addr ,int size, int color) {
		super(size, color);
		this.addr = addr;
		// TODO Auto-generated constructor stub
	}
	
	public void printProperty() {
		System.out.print("나의 IPVT는 " + addr +"주소의");
		super.printProperty();
		
	}

	
	
}
