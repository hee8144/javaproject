package Day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();	

		
		while(true) {
			System.out.print("[ (1) 추가 (2)확인 (3)삭제 (4) 종료 ] : ");
			int num = s.nextInt();
			
			if(num ==1) {
				HashMap<String, Object> human = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				human.put("name", name);
				System.out.print("나이 : ");
				int age = s.nextInt();
				human.put("age", age);
				System.out.print("주소 : ");
				String addr = s.next();
				human.put("addr", addr);
				
				list.add(human);
				
			} else if(num == 2) {
				for(int i =0; i<list.size();i++) {
					System.out.println((i+1)+". 이름 : " + list.get(i).get("name") + ", 나이 : " + list.get(i).get("age") + " , 주소 : " + list.get(i).get("addr"));
				}
			}else if(num==3) {
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String rmName = s.next();
				boolean searchflg = false;
				for(int i =0; i<list.size();i++) {
					if(rmName.equals(list.get(i).get("name"))){
						searchflg=true;
						list.remove(i);
						i--;
						System.out.println("삭제되었습니다.");
					}
					}
				if(!searchflg) {
					System.out.println("해당 이름을 가진 사용자가 존재하지않습니다.");
				}
			}else if (num==4) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("1~4중에 선택해 주세요.");
			}
			System.out.println("----------------------------------");
		}
	}
}
