package main;

import java.util.Scanner;
//
public class Program {

	public static void main(String [] args)
	{
		
		
		
		Scanner in = new Scanner(System.in);
		String ans = "y" ;
		while(ans.equals("y"))
		{
			VendingMachine v = new VendingMachine();
			
			v.EnterMoney();
			
			v.Selection();
			
			v.print();
			
			System.out.println("Thanks for shoping with us do you want to continue(y/n)?");
			ans = in.next();
		}
		
		
	}
}
