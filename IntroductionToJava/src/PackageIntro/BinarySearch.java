package PackageIntro;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		System.out.println("Please input a number between 1-20: ");
		int check = sc.nextInt();
		int start = 0;
		int stop = 19;
		int mid = (start + stop)/2;
		boolean cond = false;
		while (start<=stop){
			mid = (start + stop)/2;
			if (array[mid] == check) {
				System.out.println("The index position is " + mid);
				cond = true;
				break;
			}
			else if (check > array[mid]) {
				start = mid + 1;
			}
			else if (check < array[mid]) {
				stop = mid - 1;
			}
		}
		if (cond == false) {
			System.out.println("Number is not on the array");
		}
		// TODO Auto-generated method stub

	}

}
