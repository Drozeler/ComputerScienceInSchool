package PackageIntro;
import java.util.Scanner;
public class AverageTotalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of your number array:");
		int size = sc.nextInt();
		int array[] = new int[size];
		int x = 0;
		for (int i = 0; i < size; i++) {
			x = i+1;
			String ntax = "";
			if (x == 1) {
				ntax = "st";
			}
			else if (x == 2) {
				ntax = "nd";
			}
			else if (x == 3) {
				ntax = "rd";
			}
			else {
				ntax = "th";
			}
			System.out.println("Please input the " + x + ntax + " number");
			int no = sc.nextInt();
			array[i] = no;
		}
		int total = array[0];
		for (int i = 0; i < size; i++) {
			total = total + array[i];
		}
		int average = total/size;
		System.out.println("The total value of the array is " + total);
		System.out.println("The average value of the array is " + average);
		// TODO Auto-generated method stub

	}

}
