package Day13;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<>();	

		
		while(true) {
			System.out.print("[ (1) 추가 (2)확인 (3)삭제 (4) 종료 ] : ");
			int num = s.nextInt();
			
			if(num ==1) {
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("나이 : ");
				int age = s.nextInt();
				System.out.print("주소 : ");
				String addr = s.next();
				
				Human human = new Human(name,age,addr);
				list.add(human);
				
			} else if(num == 2) {
				for(int i =0; i<list.size();i++) {
					System.out.println((i+1)+". 이름 : " + list.get(i).getName() + ", 나이 : " + list.get(i).getAge() + " , 주소 : " + list.get(i).getAddr());
				}
			}else if(num==3) {
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String rmName = s.next();
				boolean searchflg = false;
				for(int i =0; i<list.size();i++) {
					if(rmName.equals(list.get(i).getName())){
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
