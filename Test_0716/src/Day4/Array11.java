package Day4;

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열에 있는 값들을 절대 값을 기준으로
		// 가장큰 숫자 찾기
		// 정답은 15
		int arr[] = { 3, 5, -15, 10, -8 };
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) > max) {
				max = Math.abs(arr[i]); 
			}
		}
		System.out.println("가장큰수는 : " + max);
	}

}
