package Day13;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(4);
		list.add(100);
		list.add(1,20);
//		[3,20,4,100]
		list.remove(0);
//		[20,4,100]
		
		for(int i =0;i<list.size();i++) {
			int num = list.get(i);
			System.out.println(num);
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("홍길동");
		strList.add("김철수");
		strList.add("박영희");
		
		ArrayList<Object> objList	= new ArrayList<Object>();
		objList.add(1);
		objList.add("자바");
		objList.add(false);
		objList.add(list);
		objList.add(strList);
		
	}
}
