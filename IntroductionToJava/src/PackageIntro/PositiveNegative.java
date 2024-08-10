package PackageIntro;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt(); 
		if (x>0) {
			System.out.println("This number is positive.");
		}
		else if(x<0) {
			System.out.println("This number is negative.");
		}
		else {
			System.out.println("This number is equal to 0.");
		}
		// TODO Auto-generated method stub

	}

}
