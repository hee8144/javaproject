package review_Final;

import review_Day3.Person;
import review_Day3.Student;

public class review4 {
	public static void main(String[] args) {
		String arr[] = {"java", "oracle", "html","javascript","jsp"};
		//가장 길이가 긴 문자 출력
		String max = "";
		for(int i = 0; i<arr.length;i++) {
				if(max.length() < arr[i].length()) {
					max = arr[i];
				}
		}
		System.out.println(max);
		
//		Student sutArr[] = new Student[5];
//		sutArr[0] = new Student("홍길동", 30, "인천", 1234);
		Person sutArr[] = new Person[5];
		sutArr[0] = new Student("홍길동", 30, "인천", 1234);
	}
}
