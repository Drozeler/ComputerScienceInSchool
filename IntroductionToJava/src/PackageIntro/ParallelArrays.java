package PackageIntro;
import java.util.Scanner;
import java.util.Arrays;
public class ParallelArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = {"Nisarg", "Daniel", "Dylan", "Patrick", "Kayne"}; 
		int scores[] = {6, 5, 8, 7, 4};
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(scores));
		boolean restart = true;
		 do {
			System.out.println("Option 1: Finding a student's score");
			System.out.println("Option 2: Printing all students and their grades");
			System.out.println("Option 3: Calculating the average grade");
			System.out.println("Option 4: Display the highest score with their name");
			System.out.println("Write the number of the option you would like to :");
			int option = sc.nextInt();
			if (option == 1)  {
				restart = false;
				System.out.println("Whose score would you like to see?");
				String person = sc.next();	
				int pos = 0;
				for (int i = 0; i <= 4; i++) {
					if (person == name[i]) {
						pos = i;
						break;
					}
				}
				System.out.println("The score of " + person + " is " + scores[pos]);
				System.out.println("Would you like to restart? Type in Yes or No");
				String retry= sc.next();
				if (retry == "Yes") {
					restart = true;
				}
				else if (retry == "No") {
					restart = false;
				}
				
			}
			else if (option == 2)  {
				restart = false;
				System.out.println("Here is the full list of students and their grades:");
				for (int i = 0; i <= 4; i++) {
					System.out.println("The score of " + name[i] + " is " + scores[i] + ".");
				}System.out.println("Would you like to restart? Type in Yes or No");
				String retry= sc.next();
				if (retry == "Yes") {
					restart = true;
				}
				else if (retry == "No") {
					restart = false;
				}
			}
			else if (option == 3)  {
				restart = false;
				int total = 0;
				for (int i = 0; i <= 4; i++) {
					total = total + scores[i];
				}
				System.out.println("The average grade is " + total/5);
				System.out.println("Would you like to restart? Type in Yes or No");
				String retry= sc.next();
				if (retry == "Yes") {
					restart = true;
				}
				else if (retry == "No") {
					restart = false;
				}
			}
			else if (option == 4)  {
				restart = false;
				int biggest = 0;
				int highest = 0;
				for (int i = 0; i <= 4; i++) {
					if (scores[i] > biggest) {
						biggest = scores[i];
						highest = i;
					}
				}
				System.out.println("The student with the highest score is " + name[highest] + " with a score of " + biggest + ".");
				System.out.println("Would you like to restart? Type in Yes or No");
				String retry= sc.next();
				if (retry == "Yes") {
					restart = true;
				}
				else if (retry == "No") {
					restart = false;
				}
			}
			else {
				restart = true;
				System.out.println("Error, enter an existing option.");
			}
		}
		while (restart == true);
		System.out.println("Thank you for using the options");
		// TO Auto-generated method stub

	}

}
