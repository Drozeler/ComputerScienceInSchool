package PackageIntro;
import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many floors does your hotel have? ");
        int floors = sc.nextInt();
        for (int i = 1; i <= floors; i++) {
            for (int j = 1; j <= floors - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= (2 * i - 1); x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = floors - 1; i >= 1; i--) {
            for (int j = 1; j <= floors - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= (2 * i - 1); x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
