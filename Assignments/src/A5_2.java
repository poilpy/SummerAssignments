/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to input a number in pounds and converts the
 * number to ounces.
 */

import java.util.Scanner;

public class A5_2 {
	
	public static int convert = 16;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int pounds;
		int ounces;
		String pass;
		
		System.out.print("Run program? (Enter Y to run, anything else to cancel) : ");
		pass = input.next();
		
		while(pass.equals("Y")){
		
			System.out.print("Enter pounds: ");
			pounds = input.nextInt();
		
			ounces = pounds * convert;
		
			System.out.println(pounds + " pounds is " + ounces + " ounces.");
			
			System.out.print("Run program again? (Enter Y to run, anything else to cancel) : ");
			pass = input.next();
		}
		
		input.close();
	}
}

/*
Run program? (Enter Y to run, anything else to cancel) : Y
Enter pounds: 16
16 pounds is 256 ounces.
Run program again? (Enter Y to run, anything else to cancel) : Y
Enter pounds: 52
52 pounds is 832 ounces.
Run program again? (Enter Y to run, anything else to cancel) : No
*/
