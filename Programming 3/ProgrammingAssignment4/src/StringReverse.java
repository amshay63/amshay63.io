import java.util.Scanner;

public class StringReverse {

	public static void main(String[]args) {
		/**Initialize Variable**/
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String stringReverse = stringReverser(string);
		System.out.println(stringReverse);
	}
	/**
	 * Recursive Method that 
	 * @param string
	 * @return
	 */
	public static String stringReverser(String string) {
		if (string.isEmpty()){	
			 return string;
		}
		return stringReverser(string.substring(1)) + string.charAt(0);
	}
}
