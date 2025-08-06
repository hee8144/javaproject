package Day15;

public class StringEx {
	public static void main(String[] args) {
		String str = "Show Me The Money";
		for(int i=0; i<str.length();i++) {
			String word =Character.toString(str.charAt(i)) ;
			System.out.print(word.toLowerCase());
		}
	}
}
