/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user whether they want to output the prime numbers
 * from 1 to 1000 or the perfect numbers from 1 to 10,000 then outputs the decision.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;


public class MyMathTest {
	
	public static final int PRIME_MAX = 1000;
	public static final int PERFECT_MAX = 10000;
	public static final int LINE_LENGTH = 10;
	
	public static void main(String[] args){
		
		int lineCount = 0;
		
		Scanner input = new Scanner(System.in);
		
		String choice =
			JOptionPane.showInputDialog("Enter choice,\n "
					+ "a for prime numbers up to 1000,\n "
					+ "b for perfect numbers up to 10,000,\n "
					+ "q to quit "
					+ " : ");
		
		String print = "";
		
		if (choice.equals("a")){
			
			for (int count = 2; count < PRIME_MAX; count++){
				
				if (MyMath.isPrime(count) != 0){
					
					print += Integer.toString(count) + " ";
					lineCount++;
					
					if (lineCount == LINE_LENGTH){
						
						print += "\n";
						lineCount = 0;
					}
				}
			}
		}
		
		if (choice.equals("b")){
			
			for (int count = 2; count < PERFECT_MAX; count++){
				
				if (MyMath.isPerfect(count) != 0){
					
					print += Integer.toString(count) + " ";
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, print);
		
		input.close();
	}
}
