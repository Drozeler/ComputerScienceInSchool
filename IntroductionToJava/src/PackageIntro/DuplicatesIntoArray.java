package PackageIntro;

public class DuplicatesIntoArray {

	public static void main(String[] args) {
		int Given_array[] = {2, 3, 4, 5, 7, 1, 4, 5, 8, 9};
		int duplicate[] = new int[10];
		int index = -1;
		for (int i = 0; i <= 9; i++) {
			for(int o = i + 1; o <= 9; o++) {
				if (Given_array[i] == Given_array[o]) {
					index++;
					duplicate[index] = Given_array[i];
					index++;
					duplicate[index] = Given_array[o];
					break;
				}
			}
		}
		for (int p = 0; p <= index; p++) {
			System.out.println(duplicate[p]);
		}
		// TODO Auto-generated method stub

	}

}
