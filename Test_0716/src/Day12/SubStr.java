package Day12;

import java.util.Scanner;

public class SubStr {
	public static void main(String[] args) {
		String word = "Java Programmng";
		
		System.out.println(word.substring(1));
		System.out.println(word.substring(3, 8));
		
		Scanner s = new Scanner(System.in);
		System.out.print(" 문자열을 입력하세요 : ");
		String word2 =s.next();
		for(int i =1;i<=word2.length();i++) {
			String temp =word2.substring(0,i);
			System.out.println(word2.substring(i)+temp);
		}
	}
}
