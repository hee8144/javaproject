package Day14;

import java.util.ArrayList;
import java.util.Random;

public class Review1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
//		
//		list.add(1);
//		list.add(30);
//		list.add(50);
//		list.add(1,100);
		
		//list에 랜덤한 숫자 5개를 넣기
		// 랜덤 숫자의 범위는 1~30, 중복은 일단 상관x
		
		Random ran = new Random();
		for(int i = 0; i<5;i++) {
			int ranNum = ran.nextInt(30)+1;
			list.add(ranNum);
			
		}
		
		
	}
}
