package Day5;

public class Day4_Review3 {
	public static void main(String[] args) {
		
		int arr[] = { 3, 5, 1, 4, 2 };
		
		//가장 작은값 찾기
		int min = arr[0];

		for(int i=1;i<arr.length;i++) {
			if(arr[i]< min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
