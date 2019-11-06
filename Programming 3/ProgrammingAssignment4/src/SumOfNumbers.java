import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		/**Initialize Variables and Accept Input**/
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Input a Number: ");
		n = sc.nextInt();
		System.out.printf("The Sum Of The Numbers Leading Up To %d Is %d", n, sumNum(n));
		
		/**Restart the Program**/
		main(args);
	}
	public static int sumNum(int n) {
		if (n > 0)
			return n + sumNum(n-1);
		else
			return n;
	}
}
