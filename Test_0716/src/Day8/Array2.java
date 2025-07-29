package Day8;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int arr[][] = new int [3][3];
		/*{
			{1,2,3,},{4,5,6,}{7,8,9}
			arr[0][0] arr[0][1]arr[0][2]
			arr[1][0] arr[1][1]arr[2][2]
			arr[2][0] arr[2][1]arr[2][2]
			
		}*/
		for(int i = 0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = (i * 3) + (j+1) ;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}

