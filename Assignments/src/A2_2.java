/*
* Colin Murphy
* CS254
* 6-26-15
* Harden
* A2_2.Java
* 
* This program allows the user to input an amount in change
* and tells the user how many quarters, dimes, nickels, and pennies
* are in that amount.
*/

import java.util.Scanner;

public class A2_2 {

	public static final int QUARTER_AMOUNT = 25;
	public static final int DIME_AMOUNT = 10;
	public static final int NICKEL_AMOUNT = 5;
	
	public static void main(String[] args){
		
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		int reducedAmount;
		int inputAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of cents: ");
		inputAmount = input.nextInt();
		
		quarters = inputAmount / QUARTER_AMOUNT;
		reducedAmount = inputAmount % QUARTER_AMOUNT;
		dimes = reducedAmount / DIME_AMOUNT;
		reducedAmount = reducedAmount % DIME_AMOUNT;
		nickels = reducedAmount / NICKEL_AMOUNT;
		reducedAmount = reducedAmount % NICKEL_AMOUNT;
		pennies = reducedAmount;
		
		
		System.out.println("pennies: " + pennies);
        System.out.println("nickels: " + nickels);
        System.out.println("dimes: " + dimes);
        System.out.println("quarters: " + quarters);
        
        input.close();
	}
}

/*pennies: 4
nickels: 1
dimes: 1
quarters: 48
*/
