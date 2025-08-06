package Day15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		//문자열을 입력받아서
		//문자열 빈도 찾기
		// ex) Show me the money
		// s:1,h:2,o:2,w:1,...y:1
		// 대소문자 구분없이 같이 카운팅
		Scanner s = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<>();
		System.out.print("문자를 입력해주세요");
		String str = s.nextLine();
		
		for(int i = 0; i < str.length();i++) {
			String word = Character.toString(str.charAt(i)).toLowerCase();
			if(word.equals(" ")) {
				continue;
			}
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				
				map.put(word, 1);
			}
		}
		int max=0;
		for(String key : map.keySet()) {
			int numberCount = map.get(key);
			if(numberCount > max) {
				max=numberCount;
			}
		}
		for(String key : map.keySet()) {
			if(max == map.get(key)) {
				System.out.println("가장 많은 수 : " + key +", 개수 : " + max);
			}
		}
	}
}
