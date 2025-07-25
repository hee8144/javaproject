package Day8;

public class Car {
	 String brand;
	 String model;
	int year;
	
	Car(String brand , String model , int year){
		this.brand = brand;
		this.model= model;
		this.year=year;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void startEngine() {
		System.out.println("결과 : "+brand + model +"의 엔진을 시동합니다");
	}
	public void showInfo() {
		System.out.println("결과 : 차량정보 : "+year+"년식" + brand + model );
	}
}
