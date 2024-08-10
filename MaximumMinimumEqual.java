package PackageIntro;
import java.util.Scanner;
public class MaximumMinimumEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int x=sc.nextInt(); 
		System.out.println("Enter 2nd number");
		int y=sc.nextInt(); 
		if (x>y) {
			System.out.println(x+" > "+y);
		}
		else if (y>x) {
			System.out.println(x+" < "+y);
		}
		else {
			System.out.println(x+" = "+y);
		}
		// TODO Auto-generated method stub

	}

}
