package changeMaker;

import java.util.Scanner;

public class Project1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner changeRequest = new Scanner(System.in);
		System.out.println("Please enter desired amount of change below 99 cents:");
		int change = changeRequest.nextInt();
		int quarter = change / 25;
			if (change < 25) 
			System.out.println();
			if (change > 25)
			System.out.println("Total quarters are: " + quarter);
		
		change = change % 25;
		
		int dime = change / 10;

			if (change < 10)
				System.out.println();
			if (change >= 10)
				System.out.println("Total dimes is: " + dime);
			
		change = change % 10;
		
		int nickel = change / 5;
			if (change < 5)
				System.out.println();
			if (change >= 5)
				System.out.println("Total nickels is: " + nickel);
			
		change = change % 5;
		
		int penny = change / 1;
			if (change < 1)
				System.out.println();
			if (change >= 1)
				System.out.println("Total pennies are: " + penny);
	}
}
