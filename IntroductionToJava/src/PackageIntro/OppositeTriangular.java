package PackageIntro;
import java.util.Scanner;
public class OppositeTriangular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many floors does your hotel have? ");
		int floors = sc.nextInt();
		String stars = "";
		for (int i = 1; i <= floors; i++) {
			for (int j = 1; j <= floors-i; j++) {
				System.out.print(" ");
			}
			for(int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub
		
	}

}