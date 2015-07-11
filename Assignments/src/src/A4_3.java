/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to input how many years they have spent in school
 * and outputs the corresponding education level. 
 * 
 * less than or equal to 0 = none, 
 * 1 - 6 = elementary school, 
 * 7 - 8 = middle school, 
 * 9 - 12 = high school , 
 * > 12 = college
 */

import java.util.Scanner;

public class A4_3 {
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your years of schooling: ");
		int years = input.nextInt();
		
		if ( years <= 0)
			System.out.println("none");
		else if ( years > 0 && years <= 6)
			System.out.println("elementary school");
		else if ( years > 6 && years <= 8)
			System.out.println("middle school");
		else if ( years > 8 && years <= 12)
			System.out.println("high school");
		else if ( years > 12)
			System.out.println("college");
		else
			System.out.println("I do not understand");
		
		input.close();
	}
}

/*
Enter your years of schooling: 
11
high school
*/