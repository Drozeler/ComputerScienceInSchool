package PackageIntro;
import java.util.Scanner;
public class TriangularStarsNestedForLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many floors does your hotel have? ");
		int floors = sc.nextInt();
		for (int i = 1; i <= floors; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub
		
	}

}
