package PackageIntro;
import java.util.Scanner;
public class Functionss {
	public static int addition(int a, int b) {
		int additionals = a + b;
		return additionals;
	}
	public static int subtraction(int a, int b) {
		int subtractions = a - b;
		return subtractions;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number:");
		int one = sc.nextInt();
		System.out.println("Input the second number: ");
		int two = sc.nextInt();
		int x = addition(one, two);
		System.out.println("The addition result of the two nhmbers is " + x);
		int y = subtraction(one, two);
		System.out.println("The subtraction result of the two numbers is " + y);
		// TODO Auto-generated method stub

	}

}
