package Day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {
	public static void main(String[] args) {

		// List + Map
		// 사용자로 부터 이름 ,나이를 입력받아서
		// 3명의 정보를 Map의 형태로 만든후 list에 저장하는 코드 작성

		Scanner s = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {

			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름을 입력하세요 : ");
			String name = s.next();
			map.put("name",name );
			System.out.print("나이를 입력하세요 : ");
			int age = s.nextInt();
			map.put("age",age );
			
			list.add(map);
			System.out.println(list);
		}
		for(int i = 0; i<list.size();i++) {
			HashMap<String, Object> map = list.get(i);
			System.out.println(map.get("name"));

		}
	}
}
