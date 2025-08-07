package Quiz2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz7 {
	
	public static int checkNumber(String msg) {
		Scanner s = new Scanner(System.in);
		int input;
		while (true) {
			System.out.print(msg + " : ");
			input = s.nextInt();
			// 숫자 0 혹은 음수인지 체크하는 조건문
			if (input <= 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}

		return input;
	}
	public static HashMap<String , Object> searchUser(ArrayList<HashMap<String, Object>> list  ,String User){
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> getUser = list.get(i);
			if (getUser.get("name").equals(User)) {
				return getUser;
			}
		}
		return null;}
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while (true) {
			System.out.println("======= 포인트 관리 프로그램 =======");
			System.out.print("[ (1) 사용자 등록 (2)포인트 적립 (3)포인트 차감 (4)포인트 확인 (5) 종료 ] :");
			int menu = s.nextInt();
			
			if(menu ==1) {
				System.out.print("이름 : ");
				String name = s.next();
				HashMap<String ,Object> map = searchUser(list, name);
				if(map ==null) {
					map=new HashMap<String , Object>();
					System.out.print("나이 : ");
					int age = s.nextInt();
					map.put("name", name);
					map.put("age", age);
					list.add(map);
					System.out.println(name + " 님이 등록되었습니다.");
				}else {
					System.out.println("이미 등록된 사용자입니다.");
					continue;
				}
				
			}else if(menu == 2) {
				System.out.print("포인트 적립할 사용자 이름 :");
				String name =s.next();
				HashMap<String ,Object> map = searchUser(list, name);
				if(map==null) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				}else {
					System.out.print("적립할 포인트 : ");
					int point = s.nextInt();
					map.put("point", point);
					System.out.println(name + "님의 포인트가 " + point +"만큼 적립되었습니다.");
				}
			}else if(menu==3) {
				System.out.print("포인트 차감할 사용자 이름 :");
				String name =s.next();
				HashMap<String ,Object> map = searchUser(list, name);
				if(map==null) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				}else {
					int reducePoint = checkNumber("차감할 포인트");
					int UserPoint =(int)map.get("point"); 
					if(UserPoint <reducePoint) {
						System.out.println("차감 할수 있는 포인트는 " + UserPoint);
						continue;
					}else {
						System.out.println(name + "님의 포인트가 " + reducePoint +"만큼 차감되었습니다.");
					}
					map.put("point", (int)UserPoint - reducePoint);
				}
			}else if(menu ==4) {
				System.out.print("포인트 확인할 사용자 이름 :");
				String name =s.next();
				HashMap<String ,Object> map = searchUser(list, name);
				if(map == null) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				}else {
					int UserPoint =(int)map.get("point");
					System.out.println(name + "님의 현재 포인트는 "+ UserPoint+"입니다.");
				}
			}else if(menu==5) {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}
	}
}