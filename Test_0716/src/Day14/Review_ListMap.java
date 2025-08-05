package Day14;

import java.util.ArrayList;
import java.util.HashMap;

public class Review_ListMap {
	public static void main(String[] args) {
		
		// map 하나만 가직 관리하게 되면
		// map 하나당 사람 한명관리가 가능
		
		HashMap<String ,Object> map = new HashMap<>();
		
		ArrayList<HashMap<String ,Object>> list = new ArrayList<>();
		HashMap<String ,Object> hong =  new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", "30");
		HashMap<String ,Object> kim =  new HashMap<>();
		hong.put("name", "김철수");
		hong.put("age", "20");
		HashMap<String ,Object> park =  new HashMap<>();
		hong.put("name", "박영희");
		hong.put("age", "25");
		
		list.add(park);
		list.add(hong);
		list.add(kim);
	}
}
