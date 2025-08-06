package Day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class WordQuiz {
	
	public static ArrayList<HashMap<String, String>> quizList(){
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		String[] keys = {
			    "멕시코", "스페인", "프랑스", "영국", "그리스", 
			    "독일", "중국", "러시아", 
			    "일본", "대한민국", "이탈리아", "캐나다", "브라질", 
			    "인도", "이집트", "호주", "터키", "노르웨이"
		};
		String[] values = {
			    "멕시코시티", "마드리드", "파리", "런던", "아테네", 
			    "베를린", "베이징", "모스크바", 
			    "도쿄", "서울", "로마", "오타와", "브라질리아", 
			    "뉴델리", "카이로", "캔버라", "앙카라", "오슬로"
		};
		
		for(int i=0; i<keys.length; i++) {
			HashMap<String, String> map = new HashMap<>();
			map.put(keys[i], values[i]);
			list.add(map);
		}
		return list;
	}
	
	public static void main(String[] args) {
		//문제는 중간에 종료하지 않으면 최대 10문제까지 출력
		//중복은 있으면 안됨
		//한문제당 10점
		//최종 몇점인지 출력(중간에 종료하지않을경우)
		
		
		Random ran =new Random();
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, String>> quizList = quizList();
		
		System.out.println("수도 문제 풀이 ! [-1을 입력하면 종료됩니다.]");
		System.out.println("현재 총 " + quizList.size() + "문제가 있습니다!");
		System.out.println(quizList);
		boolean ox = true;
		HashMap<Integer,Integer> keyTable = new HashMap<>();
		int num=0;
		int sum=0;
		while(ox) {
			
			int ranNum = ran.nextInt(quizList.size());
			
			if(keyTable.containsKey(ranNum)) {
				continue;
			}
			keyTable.put(ranNum,0);
			if(num==10) {
				System.out.println("총점 : " + sum);
				break;
			}
			HashMap<String , String> quiz = quizList.get(ranNum);
			String country = "";
			String capital="";
			for(String key : quiz.keySet()) {
				country=key;
				capital=quiz.get(key);
				}
				System.out.print("["+country +"] 의 수도는");
				String answer = s.next();
				if(answer.equals("-1")) {
					System.out.print("게임을 종료합니다.");
					ox=false;
				}else if(answer.equals(capital)) {
					sum+=10;
					System.out.println("정답!");
				}else {
					System.out.print("오답!");
					System.out.println("정답 : " + capital);
				}
				num++;
		}
	}
}