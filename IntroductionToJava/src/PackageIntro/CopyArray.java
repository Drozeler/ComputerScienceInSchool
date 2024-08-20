package PackageIntro;
import java.util.Arrays;
import java.util.Scanner;
public class CopyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Student_Name[] = new String[10];
		String Backup_Name[] = new String[10];
		int x = 0;
		for (int i = 0; i < 10; i++) {
			String name = "";
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
			System.out.println("Please input the " + x + ntax + " name:");
			name = sc.next();
			Student_Name[i] = name;
		}
		for (int i = 0; i < 10; i++) {
			Backup_Name[i] = Student_Name[i];
		}
		System.out.println("Backup_Name Array:");
		System.out.println(Arrays.toString(Backup_Name));
		// TODO Auto-generated method stub

	}

}
