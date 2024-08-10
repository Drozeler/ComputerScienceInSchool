package PackageIntro;

import java.util.Scanner;

public class ForLoopPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number to check if it's prime or not: ");
		int x=sc.nextInt();
		boolean y = false;
		if (x > 1) {
			for (int i = 2; i < x; i++) {
				if (x%i == 0) {
					y = true;
					break;
				}
			}
		}
		else {
			y = true;
		}
		if (y == true) {
			System.out.println(x + " is not a Prime Number");
		}
		else {
				System.out.println(x + " is a Prime Number");
			}
		// TODO Auto-generated method stub

	}

}
