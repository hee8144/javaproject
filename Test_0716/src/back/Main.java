package back;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y =s.nextInt();
		if(y-45 < 0 ) {
			x--;
		}
	}
}
