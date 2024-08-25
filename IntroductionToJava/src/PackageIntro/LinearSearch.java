package PackageIntro;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Please input a number between 1-10: ");
		int n = sc.nextInt();
		int pos = 0;
		for (int i = 0; i < 10; i++) {
			if (array[i] == n) {
				pos = i;
				break;
			}
			else if(i == 9) {
				System.out.println("Number is not on the array.");
			}
	}
		System.out.println("The index position of the number is " + pos);

}
}
