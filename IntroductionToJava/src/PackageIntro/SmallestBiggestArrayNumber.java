package PackageIntro;
import java.util.Scanner;
public class SmallestBiggestArrayNumber {

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
		int biggest = array[0];
		for (int i = 0; i < size; i++) {
			if (array[i] > biggest) {
				biggest = array[i];
			}
		}
		System.out.println("The biggest number is " + biggest);
		int smallest = array[0];
		for (int i = 0; i < size; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		System.out.println("The smallest number is " + smallest);
		// TODO Auto-generated method stub

	}

}
