package PackageIntro;
import java.util.Scanner;
public class Scenario2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 333;
		int attempt = 0;
		boolean check = true;
		do {
			for (int i = 1; i <=3; i++) {
				System.out.println("Please enter the PIN:");
				attempt = sc.nextInt();
				if (attempt == pin) {
					check = false;
				}
				else if (i == 3) {
					System.out.println("You have already tried 3 attempts, you will be locked out.");
					System. exit(0);
				}
				else {
					System.out.println("Incorrect PIN");
					check = true;
				}
			}
		}
		while (check);
		System.out.println("You have successfully entered the PIN, welcome!");
		// TODO Auto-generated method stub

	}

}
