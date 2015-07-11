/*
 * Colin Murphy
 * CS254
 * 6-26-15
 * Harden
 * 
 * This program allows the user to input degrees in Celsius
 * and convert those degrees into Fahrenheit then outputting the value.
 */

import java.util.Scanner;

public class A2_3 {
	
	public static void main(String[] args){
		
		double F;
		int C;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter degrees Celsius: ");
		C = input.nextInt();
		
		F = 1.8 * C + 32;
		System.out.print(C + " degrees Celsius is " + F + " degrees Fahrenheit");
		
		input.close();
	}
}
/*
enter degrees Celsius: 1
1 degrees Celsius is 33.8 degrees Fahrenheit
*/