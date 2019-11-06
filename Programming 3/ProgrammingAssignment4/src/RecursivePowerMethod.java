import java.util.Scanner;

public class RecursivePowerMethod {

	public static void main(String[] args) {
		/**Initialize Variables and Accept Input**/
		Scanner sc = new Scanner(System.in);
		int b, e = 0;

		System.out.println("Enter A Base: ");
		b = sc.nextInt();
		System.out.println("Now Enter An Exponent For The Base: ");
		e = sc.nextInt();
		
		/**Call Method**/
		System.out.println(raisePower(b, e));
		
		/**Restart Program**/
		main(args);
	}
	public static int raisePower(int b, int e) {
		/**Anything to the power of 0 is 1**/
		if (e == 0) 
			return 1;
		/**Multiply b for every e**/
		return (b * raisePower(b, e-1));
	}
}
	
