package PackageIntro;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int array[] = {3, 7, 6, 9, 1, 5, 4, 2, 8, 10};
		int swap  = 0;
		boolean cond = false;
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < 9; i++) {
			cond = false;
			for (int p = 0; p < 9 - i; p++) {
				if (array[p] > array[p+1]) {
					swap = array[p];
					array[p] = array[p+1];
					array[p+1] = swap;
					cond = true;
				}
			}
			if (!cond) {
				break;
		}
				
	}
		System.out.println(Arrays.toString(array));
		// TODO Auto-generated method stub

	}

}
