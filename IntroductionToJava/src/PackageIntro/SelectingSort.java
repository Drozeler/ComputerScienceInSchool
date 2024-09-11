package PackageIntro;
import java.util.Arrays;
public class SelectingSort {

	public static void main(String[] args) {
		int array[] = {3, 7, 6, 9, 1, 5, 4, 2, 8, 10};
		int swap  = 0;
		System.out.println(Arrays.toString(array));
		for (int i = 0; i <= 9; i++) {
			if (i == 9) {
				break;
			}
			for (int p = i; p <= 9; p++) {
				if (array[i] > array[p]) {
					swap = array[i];
					array[i] = array[p];
					array[p] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		// TODO Auto-generated method stub

	}

}
