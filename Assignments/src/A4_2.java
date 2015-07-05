/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to input either s or t for square and triangle
 * respectively. The program then asks for the dimensions of the shape and outputs 
 * its area.
 */

import java.util.Scanner;

public class A4_2 {
	public static void main(String[] args){
		
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the type of figure (s or t): ");
		
		String choice = input.nextLine();
		
		if (choice.equals("s")){
			
			System.out.println("Enter the length of a side: ");
			int side = input.nextInt();
			
			System.out.println("The area is " + (side*side));
		}
		
		else if( choice.equals("t")){
			
			System.out.println("Enter the base: ");
			double base = input.nextInt();
			System.out.println("Enter the height: ");
			double height = input.nextInt();
			
			System.out.println("The area is " + (base*height/2));
		}
		else
			System.out.print("I did not understand that.");
		
		
		input.close();
	}
}

/*
Enter the type of figure (s or t): 
t
Enter the base: 
100
Enter the height: 
5
The area is 250.0
*/

/*
Enter the type of figure (s or t): 
s
Enter the length of a side: 
9
The area is 81
*/