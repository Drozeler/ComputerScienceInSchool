package PackageIntro;
import java.util.Scanner;
public class Scenario1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean check = true;
		do {
			System.out.println("Please enter a number between 1-100: ");
			number = sc.nextInt();
			if (number > 0 && number <= 100) {
				check = false;
			}
			else {
				System.out.println("Please input the correct number in its range.");
				check = true;
			}
		}
		while (check);
		if (number%2 == 0) {
			System.out.println("This number is even.");
		}
		else {
			System.out.println("This number is odd.");
		}
		// TODO Auto-generated method stub

	}

}
