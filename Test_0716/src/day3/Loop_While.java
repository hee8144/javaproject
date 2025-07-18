package day3;


public class Loop_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while for문과차이점:  조건 선언 증강식 떨어져있다;
//		int i=0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		
		
		//1부터 사용자가 입력한 숫자까지 합을 구하기
		//while 문으로 하기
		
		//2.구구단짜기
		//while 문 이용하기
//		System.out.println("숫자를 입력하세요: ");
//		Scanner s= new Scanner(System.in);
//		int num = s.nextInt();
//		int sum=0;
//		int i=0;
//		while(i<=num) {
//			sum+=i;
//			i++;
//		}
//		System.out.println("총 숫자의 합은: " + sum);
//	
		int i=2;
		while(i<10) {
			int j=1;//밖에다 j를 만들면 9되는순간 반복안됨;
			System.out.println("====="+i+"단=====");
			while(j<10) {
				System.out.println(i+" * "+ j + " = " + (i*j));
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
