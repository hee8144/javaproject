package Day6;

public class TJMemberMain {
	public static void main(String[] args) {
		TJMember hong = new TJMember("홍길동",30,"20251234",10000);
		hong.money +=50000; 
		hong.classMoney +=10000;
		
		TJMember kim = new TJMember("김철수",25,"20251334",20000);
		kim.money = kim.money-10000;
		kim.classMoney +=10000;
		
		TJMember park = new TJMember("박영희",20,"20251554",400000);
		park.classMoney +=10000;
		
		System.out.println(park.money);
		System.out.println(park.classMoney);
		TJMember.classMoney -=5000;
		System.out.println(TJMember.classMoney);
		TJMember.test();
		
		// ==========
		//Math 클래스는 모든 요소들을 static 으로 선언해놨음;
		// 따라서 클래스 명으로 PI, abs(),max() 등의 멤버 접근이가능하다;
		int a= Math.abs(-10);
	}
}
