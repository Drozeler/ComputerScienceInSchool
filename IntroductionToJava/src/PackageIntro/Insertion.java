package PackageIntro;
import java.util.Scanner;
import java.util.Arrays;
public class Insertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = {1, 2, 3, 4, 6, 7, 8, 9, 10, -1};
		System.out.println(Arrays.toString(array));
		System.out.println("What number would you like to input inside the array?");
		int no = sc.nextInt();
		int pos = 0;
		for (int i = 0; i <= 9; i++) {
			if (no < array[i]) {
				pos = i;
				break;
			}
		}
		for (int p = 8; p >= pos; p--) {
			array[p+1] = array[p];
		}
		array[pos] = no;
		System.out.println(Arrays.toString(array));
		// TODO Auto-generated method stub

	}

}
