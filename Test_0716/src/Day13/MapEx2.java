
package Day13;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx2 {
	
	public static void main(String[] args) {

		HashMap<String , Object> user1 = new HashMap<>();
		user1.put("name", "홍길동");
		user1.put("age", 30);
		user1.put("height", 170.5);
		user1.put("isMarried", true);
		
		System.out.println(user1);
		
		HashMap<String , Object> user2 = new HashMap<>();
		user2.put("name", "김철수");
		user2.put("age", 20);
		user2.put("height", 176.5);
		user2.put("isMarried", true);
		
		System.out.println(user2);
		
		HashMap<String , Object> user3 = new HashMap<>();
		user3.put("name", "박영희");
		user3.put("age", 25);
		user3.put("height", 163.5);
		user3.put("isMarried", false);
		
		System.out.println(user3);
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		System.out.println(list);
	}
}
