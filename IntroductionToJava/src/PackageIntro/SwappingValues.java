package PackageIntro;
import java.util.Scanner;
public class SwappingValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int p=sc.nextInt(); 
		System.out.println("Enter 2nd number");
		int q=sc.nextInt();
		int x;
		x=p;
		p=q;
		q=x;
		System.out.println("Your 1st number has been swapped, it is "+p);
		System.out.println("Your 2nd number has been swapped, it is "+q);
		// TODO Auto-generated method stub

	}

}
