package PackageIntro;
import java.util.Scanner;
public class NestedForLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many floors does your hotel have? ");
		int floors = sc.nextInt();
		System.out.println("How many rooms does each floor have? ");
		int rooms = sc.nextInt();
		for (int i = 1; i <= floors; i++) 
		{
			for (int x = 1; x <= rooms; x++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
