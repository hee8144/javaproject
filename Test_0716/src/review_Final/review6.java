package review_Final;

import java.util.ArrayList;
import java.util.HashMap;

public class review6 {
	public static void main(String[] args) {
//		Json => ArrayList => HashMap
		
		ArrayList<Integer> list =  new ArrayList<>();
		list.add(100);
		list.add(3333);
		HashMap<String , Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 30);
		
		ArrayList<HashMap<String , Object>> user =  new ArrayList<>();
		user.add(map);
		System.out.println(user);
	}
}
