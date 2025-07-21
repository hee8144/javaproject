package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		//사용자로부터 배열의 크기를 입력받아서
		//해당크기의 배열생성
		//배열 내의 값은 1부터 배열크기까지 순차적으로 넣기
		//ex) 3을입력하면 {1,2,3}
		//ex) 7을 입력하면 {1,2,3,4,5,6,7}
		
		//size가 0이하의 숫자가 들어오면 다시 입력하도록
		Scanner s= new Scanner(System.in);
		
		int num = 0;
//		System.out.println("사이즈 크기를 입력하세요 : ");
//		int size;
//		while(true) {
//			size=s.nextInt();
//			if(size <=0) {
//				System.out.println("1이상의 숫자를 입력 : ");
//			}else {
//				break;
//			}
//		}
//		int Arr[]=new int[size];
//		for(int i=0;i<Arr.length;i++) {
//			Arr[num]=num+1;
//			num++;
//			
//		}		
		
		int size=0;
		do {
			System.out.println("배열 크기입력(1이상): ");
			size= s.nextInt();
		}while(size<=0);
		
		int Arr[]=new int[size];
		for(int i=0;i<Arr.length;i++) {
			Arr[num]=num+1;
			num++;
			
		}	
		System.out.println(Arrays.toString(Arr));
		
}
}
