package review_Final;

public class Student extends Person{

	int stuNo;
	
	public Student(String name , int age, double height, int stuNo) {
		super(name ,age ,height);
		this.stuNo = stuNo;
	}
	
	public void study() {
		System.out.println("공부 중");
	}
	
	public void eat() {
		System.out.println("학식을 먹는다.");
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student student = (Student) obj;
		if(student.getName()==this.getName() && student.getAge() == this.getAge()&& student.getHeight()==this.getHeight()) {
			return true;
		}
		
		return false;
	}
}
