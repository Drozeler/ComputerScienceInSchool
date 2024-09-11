package PackageIntro;
import java.util.Arrays;
import java.util.Scanner;
public class Deletion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(array));
		System.out.println("What number would you like to delete inside the array?");
		int no = sc.nextInt();
		int pos = 0;
		for (int i = 0; i <= 9; i++) {
			if (no == array[i]) {
				pos = i;
				break;
			}
		}
		for (int p = pos+1; p <= 9; p++) {
			array[p-1] = array[p];
		}
		array[9] = -1;
		System.out.println(Arrays.toString(array));
		// TODO Auto-generated method stub

	}

}
