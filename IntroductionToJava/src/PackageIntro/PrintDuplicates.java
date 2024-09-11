package PackageIntro;

public class PrintDuplicates {

	public static void main(String[] args) {
		int array[] = {50, 20, 10, 100, 30, 100};
		for (int i = 0; i <= 5; i++) {
			for (int o = i+1; o <= 5; o++) {
				if (array[i] == array[o]) {
					System.out.println("There are duplicates of " + array[i] + " in index " + i + " and " + o + ".");
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
