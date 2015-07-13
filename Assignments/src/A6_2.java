/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to enter a number greater than 1
 * then computes the squares of all numbers from 1 to the entered number and
 * adds them together.
 */

import java.util.Scanner;


public class A6_2 {
	
	
	public static void main(String[] args){
		
		int upTo;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number greater than 0 (less than 1 to quit) : ");
		upTo = input.nextInt();
		
		while (upTo > 0){
			for ( int current = 1; current <= upTo; current++){
				sum += current * current;
			}
			
			System.out.println("The sum of the squares from 1 to " + upTo + " is " + sum);
			
			sum = 0;
			
			System.out.print("Enter a number greater than 0 (less than 1 to quit) : ");
			upTo = input.nextInt();
		}
		
		input.close();
	}
}

/*
Enter a number greater than 0 (less than 1 to quit) : 4
The sum of the squares from 1 to 4 is 30
Enter a number greater than 0 (less than 1 to quit) : 1
The sum of the squares from 1 to 1 is 1
Enter a number greater than 0 (less than 1 to quit) : 0
*/