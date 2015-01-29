package main;

import java.util.Scanner;

public class VendingMachine {

	// offers 5 product
	// accepts coins, 1, 5 dollar bills
	private double credit;
	private int[] change;
	private double[] product;

	public VendingMachine() {
		credit = 0;

		// 25,10,5,1
		change = new int[4];
		product = new double[5];
		product[0] = 1.25;
		product[1] = 2.5;
		product[2] = 6;
		product[3] = 0.95;
		product[4] = 0.49;

	}

	private Boolean acceptableCash(double change) {
		if (change == 5 || change == 1 || change == 0.25 || change == 0.1
				|| change == 0.05 || change == 0.01)
			return true;
		else
			return false;

	}

	public void changeCalculation(double money) {
		int cash = (int) (money * 100);
		int i = 0;

		change[0] = cash / 25;
		cash = cash % 25;
		change[1] = cash / 10;
		cash = cash % 10;
		change[2] = cash / 5;
		cash = cash % 5;
		change[3] = cash / 1;
		cash = cash % 1;

	}

	public void EnterMoney() {
		System.out.println("Put cash in:...");
		Scanner in = new Scanner(System.in);
		double money = in.nextDouble();
		while (money != 0) {
			if (acceptableCash(money))
				credit += money;
			else
				System.out
						.println("You payment type is not Valid please try again:...");
			money = in.nextDouble();
		}
		credit = (double) Math.round(credit * 100) / 100;
	}

	public int[] Selection() {
		
		System.out
				.println("Please choose your desired product from the list(number/zero:out):... ");
		System.out.println("1)Snickers: 1.25$ \n" + "2)kit kat: 2.5$ \n"
				+ "3)Twix: 6$ \n" + "4)Reeses: 95c \n" + "5)chips: 49c");
		System.out.println("Your total credit is : "
				+ credit);
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		while (num != 0) {
			if (num >= 1 && num <= 5) {
				if (credit >= product[num - 1]) {
					credit -= product[num - 1];
					credit = (double) Math.round(credit * 100) / 100;
					System.out.println("Your total credit is: "
							+ credit);
				} else
					System.out.println("insufficient fund");

			} else
				System.out
						.println("There is no product with this number please try again:...");
			num = in.nextInt();
		}

		changeCalculation(credit);
		return change;
	}

	public void print() {
		
		System.out.print(change[0] + " 25c" + ", "); System.out.print(change[1] + " 10c" + ", "); 
		System.out.print(change[2] + " 5c" + ", "); System.out.print(change[3] + " 1c" + ", ");
		System.out.println();

	}
}
