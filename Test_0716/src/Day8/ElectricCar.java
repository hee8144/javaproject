package Day8;

public class ElectricCar extends Car {
	int batteryCapacity;
	
	ElectricCar(String brand , String model,int year , int batteryCapacity){
		super(brand , model , year);
		this.batteryCapacity=batteryCapacity;
	}
	
	public void startEngine() {
		System.out.println("결과 : 차량정보 : "+getBrand() + getModel()+"의 전기 모터를 시동합니다" );
	}
	public void showInfo() {
		System.out.println("결과 : 차량정보 : "+year+"년식" + getBrand() + getModel() +"(배터리 용량 : "+batteryCapacity + ")" );
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
		
	}
	
}
