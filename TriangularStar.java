package PackageIntro;
import java.util.Scanner;
public class TriangularStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many floors does your hotel have? ");
		int floors = sc.nextInt();
		String first = "*";
		String stars = "";
		for (int i = 1; i <= floors; i++) {
			stars = first + stars;
			System.out.println(stars);
		}
		// TODO Auto-generated method stub

	}

		// TODO Auto-generated method stub

}


