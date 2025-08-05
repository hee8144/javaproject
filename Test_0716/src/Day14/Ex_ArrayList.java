package Day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex_ArrayList {
	
	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		

		while (true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 점수수정 (4) 종료 ] : ");
			int num = s.nextInt();
			HashMap<String, Object> map = new HashMap<>();
			if (num == 1) {
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);
				
				System.out.print("국어점수 : ");
				int Kscore = s.nextInt();
				map.put("국어점수", Kscore);
				System.out.print("영어점수 : ");
				int Escore = s.nextInt();
				map.put("영어점수", Escore);
				System.out.print("수학점수 : ");
				int Mscore = s.nextInt();
				map.put("수학점수", Mscore);
				list.add(map);
				
			} else if (num == 2) {
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					double avg = (((Integer) user.get("국어점수") + (Integer) user.get("수학점수") + (Integer) user.get("영어점수"))
							/ 3);
					System.out.println((i + 1) + ". 이름 : " + user.get("name"));
					System.out.println("    국어 : " + user.get("국어점수") + ", 영어 : " + user.get("영어점수") + ", 수학 : "
							+ user.get("수학점수") + "평균 : " + avg);
				}
			} else if (num == 3) {
				System.out.print(" 점수를 수정할 학생의 이름을 입력해주세요 : ");
				String name = s.next();
				boolean searchFlg = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("name").equals(name)) {
						searchFlg =true;
						System.out.print(" 수정할 과목을 선택하세요 ( 1. 국어 2. 영어 3. 수학 ) : ");
						int subject = s.nextInt();
						if (subject == 1) {
							System.out.print("새로운 점수를 입력하세요: ");
							int newScore = s.nextInt();
							list.get(i).put("국어점수", newScore);
							break;
						} else if (subject == 2) {
							map.remove("수학점수");
							System.out.print("새로운 점수를 입력하세요: ");
							int newScore = s.nextInt();
							list.get(i).put("수학점수", newScore);
							break;
						} else if (subject == 3) {
							map.remove("영어점수");
							System.out.print("새로운 점수를 입력하세요: ");
							int newScore = s.nextInt();
							list.get(i).put("영어점수", newScore);
							list.add(map);
							break;
						} else {
							System.out.println("학생이 없습니다.");
							continue;
						}
					}if(searchFlg  == false) {
						System.out.println("해당 이름을 가진 사람이 없습니다.");
					}
				}

			}else if(num==4) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("없는 메뉴 번호 입니다. ");
			}
		}

	}
}
