package PackageIntro;
import java.util.Scanner;
public class NestedLogExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our online shop, please input the current month in number: ");
		int month=sc.nextInt();
		System.out.println("Nice, now please input the current date: ");
		int date=sc.nextInt();
		if (month != 8) {
			System.out.println("Apologies, this shop only runs in August in commemoration of independence day.");
			System.out.println("Have a nice day!");
			System.exit(0);
		}
		System.out.println("Welcome, please input the total purchase you have made: ");
		int totalpurchase=sc.nextInt();
		int endpurchase = totalpurchase;
		if (totalpurchase >= 4500000) {
			System.out.println("You have been given a 45% discount");
			int fortyfivediscount = (int) (0.45*totalpurchase);
			endpurchase = totalpurchase - fortyfivediscount;
		}
		else if (totalpurchase >= 2000000) {
			System.out.println("You have been given a 20% discount");
			int twentydiscount = (int) (0.2*totalpurchase);
			endpurchase = totalpurchase - twentydiscount;
		}
		else if (totalpurchase >= 1700000) {
			System.out.println("You have been given a 17% discount");
			int seventeendiscount = (int) (0.17*totalpurchase);
			endpurchase = totalpurchase - seventeendiscount;
		}
		else if (totalpurchase >= 800000) {
			System.out.println("You have been given a 8% discount");
			int eightdiscount = (int) (0.08*totalpurchase);
			endpurchase = totalpurchase - eightdiscount;
		}
		else {
			System.out.println("You did not get any discount");
		}
		System.out.println("The price now is " + endpurchase);
		if (date == 17) {
			System.out.println("Since you are purchasing in the independence day, you have gotten an extra 100k coupon");
			endpurchase -= 100000;
			System.out.println("After applying the coupon, the price is " + endpurchase);
			}
		}
		// TODO Auto-generated method stub

	}
