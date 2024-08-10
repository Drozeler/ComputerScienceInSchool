package PackageIntro;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();  
		if (x%2 == 0) {
			System.out.println("This number is even.");
		}
		else {
			System.out.println("This number is odd.");
		}
		// TODO Auto-generated method stub

	}

}
