package PackageIntro;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {

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
		int u = 0;
		for (int o = 0; o < size/2; o++) {
			u = array[o];
			array[o] = array[size - o - 1];
			array[size - o - 1] = u;
		}
		String coma = ", ";
		
		System.out.println(Arrays.toString(array));
		for (int n = 0; n < size; n++) {
			if (n == 0) {
				System.out.print("[");
			}
			if (n == size-1) {
				coma = "";
			}
			System.out.print(array[n] + coma);
			if (n == size - 1) {
				System.out.print("]");
			}
		}
		// TODO Auto-generated method stub

	}

}
