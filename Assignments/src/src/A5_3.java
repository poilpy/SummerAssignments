/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to input a number in pounds and converts the
 * number to ounces. Entering a non-positive number for pounds terminates the program.
 */

import java.util.Scanner;

public class A5_3 {
	
	public static int convert = 16;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int pounds;
		int ounces;
		
		System.out.print("Enter pounds (Enter a negative amount to exit) : ");
		pounds = input.nextInt();
		
		while(pounds >= 0){
		
			ounces = pounds * convert;
		
			System.out.println(pounds + " pounds is " + ounces + " ounces.");
			
			System.out.print("Enter pounds (Enter a negative amount to exit) : ");
			pounds = input.nextInt();
		}
		
		input.close();
	}
}

/*
Enter pounds (Enter a negative amount to exit) : 1
1 pounds is 16 ounces.
Enter pounds (Enter a negative amount to exit) : 3
3 pounds is 48 ounces.
Enter pounds (Enter a negative amount to exit) : 1
1 pounds is 16 ounces.
Enter pounds (Enter a negative amount to exit) : 5
5 pounds is 80 ounces.
Enter pounds (Enter a negative amount to exit) : 13
13 pounds is 208 ounces.
Enter pounds (Enter a negative amount to exit) : -4
*/