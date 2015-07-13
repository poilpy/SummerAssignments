/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user how many numbers they wish to enter
 * then proceeds to ask them to enter the numbers. If 7 is entered,
 * the program outputs the first and last position of the 7.
 */

import java.util.Scanner;


public class A6_1 {
	
	public static void main(String[] args){
		
		int numEntered;
		int maxEntered;
		int position = 1;
		int first7 = 0;
		int last7 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers will be entered? : ");
		maxEntered = input.nextInt();
		
		do{
			System.out.print("Enter num: ");
			numEntered = input.nextInt();
			
			if (numEntered == 7 && first7 == 0){
				first7 = position;
			}
			
			if (numEntered == 7){
				last7 = position;
			}
			
			position++;
		} while(position <= maxEntered);
		
		if (first7 != 0){
			System.out.println("The first 7 was in position " + first7);
			System.out.println("The last 7 was in position " + last7);
		}
		else
			System.out.println("Sorry, no 7's were entered.");
		
		input.close();
	}
}

/*
How many numbers will be entered? : 8 
Enter num: 5
Enter num: 7
Enter num: 6
Enter num: 7
Enter num: 7
Enter num: 3
Enter num: 8
Enter num: 6
The first 7 was in position 2
The last 7 was in position 5
*/

/*
How many numbers will be entered? : 8
Enter num: 5
Enter num: 2
Enter num: 6
Enter num: 7
Enter num: 1
Enter num: 3
Enter num: 8
Enter num: 6
The first 7 was in position 4
The last 7 was in position 4
 */

/*
How many numbers will be entered? : 8
Enter num: 5
Enter num: 1
Enter num: 6
Enter num: 5
Enter num: 9
Enter num: 3
Enter num: 8
Enter num: 6
Sorry, no 7's were entered.
*/

