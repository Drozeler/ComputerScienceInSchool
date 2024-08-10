package PackageIntro;
import java.util.Scanner;
public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number where you want the Fibonacci sequence to be displayed (only input numbers equal or below 46): ");
		int x = sc.nextInt();
		int y = 1;
		int z = 0;
		int v = 1;
		if (x<1) {
			System.out.println("The number you input should be above 0");
		}
		else if (x == 1 || x == 2) {
			System.out.println("The "+ x +"th number in the Fibonacci Sequence is 1");
		}
		else {
			for (int i = 2; i < x ; i++) {
				v = z + y;
				z = y;
				y = v;
			}
			System.out.println("The " + x + "th number in the Fibonacci Sequence is " + y);
		}
		// TODO Auto-generated method stub

	}

}
