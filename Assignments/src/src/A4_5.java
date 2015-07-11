/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to input the start time for a phone call and
 * the length of the call. The gross cost is then calculated based on a 40 cents per
 * minute rate. Finally, the net cost is calculated factoring in a night-time discount,
 * an hour long call discount and tax.
 */

import java.util.Scanner;

public class A4_5 {
	
	public static final double TAX = 1.04;
	public static final double RATE = .4;
	public static final double TIME_DISCOUNT = .85;
	public static final double NIGHT_DISCOUNT = .5;
	
	public static void main(String[] args){
		
		double grossCost;
		double netCost;
		int startTime;
		int callLength;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter start time: ");
		startTime = input.nextInt();
		System.out.print("Enter length of call in minutes: ");
		callLength = input.nextInt();
		
		grossCost = RATE * callLength;
		
		System.out.println("Gross cost: $" + grossCost);
		
		if ( startTime >= 1800 && startTime < 2400 || startTime >= 0 && startTime <= 800){
			if ( callLength > 60){
				netCost = grossCost * NIGHT_DISCOUNT * TIME_DISCOUNT * TAX;
				
			}
			else {
				netCost = grossCost * NIGHT_DISCOUNT * TAX;
			}
		}
		else {
			if ( callLength > 60){
				netCost = grossCost * TIME_DISCOUNT * TAX;
			}
			else {
				netCost = grossCost * TAX;
			}
		}
		
		System.out.println("net cost: $" + netCost);
		
		input.close();
	}
}

/*
 * output1
 * 
 * Enter start time: 2322
 * Enter length of call in minutes: 67
 * Gross cost: $26.8
 * net cost: $11.845600000000001
 */

/*
 * output2
 * Enter start time: 759
 * Enter length of call in minutes: 10
 * Gross cost: $4.0
 * net cost: $2.08
 */

/*
 * output3
 * 
 * Enter start time: 1300
 * Enter length of call in minutes: 100
 * Gross cost: $40.0
 * net cost: $35.36
 */

/*
 * output4
 * 
 * Enter start time: 1300
 * Enter length of call in minutes: 10
 * Gross cost: $4.0
 * net cost: $4.16
 */