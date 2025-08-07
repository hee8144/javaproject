package Quiz2;

import java.util.HashMap;
import java.util.Random;

public class Quiz6 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int [20];
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i <arr.length;i++) {
			arr[i] = ran.nextInt(10)+1;
			int num = 1;
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					num++;
				}
				map.put(arr[i], num);
			}
		}
		for(Integer key : map.keySet()) {
			System.out.println(key + " => " + map.get(key)+"개");
		}
	}
}
