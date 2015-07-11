/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to input two numbers and select one of four
 * operations, addition, subtraction, multiplication and division. The operation is
 * performed on the two numbers with the result being outputted to the console.
 */
import java.util.Scanner;


public class A4_4 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double num1;
		double num2;
		String operation;
		
		System.out.print("Please enter a number: ");
		num1 = input.nextDouble();
		System.out.print("Please enter an operation (+, -, *, /): ");
		operation = input.next();
		System.out.print("Please enter a number: ");
		num2 = input.nextDouble();
		
		switch (operation){
		
			case "+":
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
		}
		
		input.close();
	}
}
/*
Please enter a number: 4.9
Please enter an operation (+, -, *, /): /
Please enter a number: 53
0.09245283018867925
*/
