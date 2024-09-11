package PackageIntro;
import java.util.Scanner;
import java.util.Arrays;
public class OddEvenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[100];
		int odd_array[] = new int[50];
		int even_array[] = new int[50];
		int  e = 0;
		int o = 0;
		for (int i = 0; i < 100; i++) {
			array[i] = i+1;
			if (array[i] % 2 == 0) {
				even_array[e] = array[i];
				e++;
			}
			else {
				odd_array[o] = array[i];
				o++;
			}
		}
		System.out.println("Even Numbers in Array Format:");
		System.out.println(Arrays.toString(even_array));
		System.out.println("Odd Numbers in Array Format:");
		System.out.println(Arrays.toString(odd_array));
		// TODO Auto-generated method stub

	}

}
