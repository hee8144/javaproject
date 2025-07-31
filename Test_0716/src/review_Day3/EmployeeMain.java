package review_Day3;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee kim = new Employee(1001, "김철수");
		Employee park = new Employee(2002, "박영희","인사부");
		kim.setDetails(3000000, "대리");
		System.out.println(kim.getSalary());
		park.empInfo();
		
		Book_Test b1 = new Book_Test();
		b1.bookInfo(); // 책 제목: 제목 없음, 저자: 저자 미상, 가격: 0원
		b1.setInfo("자바의 정석", "남궁성", 35000);
		b1.bookInfo(); // 책 제목: 자바의 정석, 저자: 남궁성, 가격: 35000원

		Book_Test b2 = new Book_Test("이것이 자바다", "신용권", 40000);
		b2.bookInfo(); // 책 제목: 이것이 자바다, 저자: 신용권, 가격: 40000원
		b2.discount(5000);
		System.out.println("현재 가격: " + b2.getPrice() + "원"); // 현재 가격: 35000원
		b2.discount(40000); // 할인 금액이 너무 큽니다. 가격은 0으로 설정됩니다.
		System.out.println("현재 가격: " + b2.getPrice() + "원"); // 현재 가격: 0원
		}
}
