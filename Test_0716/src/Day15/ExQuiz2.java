package Day15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class ExQuiz2 {
	public static void main(String[] args) {
		Random ran = new Random();
		HashMap<Integer,Integer> keyTable = new HashMap<>();
		int arr[] = new int[20];
		for(int i = 0; i<arr.length;i++) {
			int random = ran.nextInt(10)+1;
			arr[i] = random;
			int num =1;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					num++;
				}
				keyTable.put(random, num);
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println(keyTable);
		int max=0;
		for(int key : keyTable.keySet()) {
			int numberCount = keyTable.get(key);
			if(numberCount > max) {
				max=numberCount;
			}
		}
		for(int key : keyTable.keySet()) {
			if(max == keyTable.get(key)) {
				System.out.println("가장 많은 수 : " + key +", 개수 : " + max);
				
			}
		}
	}
}
