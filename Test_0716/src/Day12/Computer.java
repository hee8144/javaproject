package Day12;

public class Computer implements PowerControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Computer 전원 켜짐");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Computer 전원 꺼짐");
	}
	public static void main(String[] args) {
		Computer Computer = new Computer();
		Computer.turnOff();
		Computer.turnOn();
	}
}
