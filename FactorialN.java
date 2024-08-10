package PackageIntro;

import java.util.Scanner;

public class FactorialN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number to calculate the factorial N: ");
		int x=sc.nextInt();
		int y = x;
		for (int i = x-1; i >= 1 ; i--) {
			x = x * i;
		}
		System.out.println("The factorial N of " + y + " is " + x);
		// TODO Auto-generated method stub

	}

}
