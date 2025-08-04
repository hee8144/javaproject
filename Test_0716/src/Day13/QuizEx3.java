package Day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizEx3 {
	
	public static int scoreFunc(String subject , int max) {
		Scanner s = new Scanner(System.in);
		int score =0;
		
		while(true) {
			System.out.println(subject + " >> " );
			score=s.nextInt();
			if(score < 0 || score >max) {
				System.out.println(subject+"의 범위는 0 부터 "+ max + "까지 입나다." );
			}else {
				break;
			}
			
		}
		
		
		return score;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		System.out.println("====== 성적관리 시스템 ======");
		System.out.print("인원수 입력");
		int num = s.nextInt();
		for (int i = 0; i < num; i++) {
//			int sum =0;
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 >> ");
			String name = s.next();
			map.put("name", name);
			
			map.put("java", scoreFunc("자바", 40));
			map.put("oracle", scoreFunc("오라클", 35));
			map.put("html", scoreFunc("html", 20));
//			while (true) {
//				System.out.print("자바 >> ");
//				int java = s.nextInt();
//				if (java < 0 || java > 40) {
//					System.out.println("자바의 범위는 0 부터 40까지 입니다.");
//				} else {
//					map.put("java", java);
//					sum+=java;
//					break;
//				}
//			}
//			while(true) {
//				System.out.print("오라클 >> ");
//				int oracle = s.nextInt();
//				if (oracle < 0 || oracle > 35) {
//					System.out.println("오라클의 범위는 0 부터 35까지 입니다.");
//				} else {
//					map.put("oracle", oracle);
//					sum+=oracle;
//					break;
//				}
//			}
//			while(true) {
//				System.out.print("html >> ");
//				int html = s.nextInt();
//				if (html < 0 || html > 25) {
//					System.out.println("html의 범위는 0 부터 25까지 입니다.");
//				} else {
//					map.put("html", html);
//					sum+=html;
//					break;
//				}
//			}
//			map.put("sum", sum);
			list.add(map);
			System.out.println("--------------------");
		}
		for (int i = 0; i < num; i++) {
			int sum = (int) list.get(i).get("java") + (int) list.get(i).get("oracle") + (int) list.get(i).get("html");
//			System.out.println("이름 : " + list.get(i).get("name") + ", 총점 : " + list.get(i).get("sum"));
			System.out.println("이름 : " + list.get(i).get("name") + ", 총점 : " + sum);
		}
	}
}
