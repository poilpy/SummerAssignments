/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to input an age and a food preference
 * (p - popcorn, s - soda, b - both). Entering a non-positive age terminates the program,
 * displaying the number of people in each of five different age groups, the number of different food choices,
 * the average age, and the youngest and oldest ages.
 */

import java.util.Scanner;

public class A5_4 {
	
	public static final int ZERO = 0;
	public static final int EIGHTEEN = 18;
	public static final int THIRTY = 30;
	public static final int FORTY = 40;
	public static final int SIXTY = 60;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int age;
		int age18Less = 0;
		int age18To30 = 0;
		int age30To40 = 0;
		int age40To60 = 0;
		int age60Up = 0;
		int averageAge = 0;
		int numPeople = 0;
		int totalAge = 0;
		int youngestAge;
		int oldestAge;
		int numP = 0;
		int numS = 0;
		int numB = 0;
		String food = "x";
		
		System.out.print("Enter age of attendee (negative number to quit) : ");
		age = input.nextInt();
		youngestAge = age;
		oldestAge = age;
		
		if (age >= 0){
			System.out.print("Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : ");
			food = input.next();
		}
		
		while(age >= 0){
			
			if ( age >= ZERO && age <= EIGHTEEN)
				age18Less++;
			else if ( age > EIGHTEEN && age <= THIRTY)
				age18To30++;
			else if ( age > THIRTY && age <= FORTY)
				age30To40++;
			else if ( age > FORTY && age <= SIXTY)
				age40To60++;
			else if ( age > SIXTY)
				age60Up++;
			
			if ( food.equals("p"))
				numP++;
			if ( food.equals("s"))
				numS++;
			if ( food.equals("b"))
				numB++;
			
			numPeople++;
			totalAge += age;
			averageAge = totalAge/numPeople;
			
			if(age < youngestAge)
				youngestAge = age;
			
			if(age > oldestAge)
				oldestAge = age;
			
			System.out.print("Enter age of attendee (negative number to quit) : ");
			age = input.nextInt();
			
			if (age >= 0){
				System.out.print("Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : ");
				food = input.next();
			}
		}
		
		System.out.println(" ");
		
		System.out.println("age 0 to 18: " + age18Less);
		System.out.println("age 18 to 30: " + age18To30);
		System.out.println("age 30 to 40: " + age30To40);
		System.out.println("age 40 to 60: " + age40To60);
		System.out.println("over 60: " + age60Up);
		
		System.out.println(" ");
		
		System.out.println("food preference popcorn: " + numP);
		System.out.println("food preference soda: " + numS);
		System.out.println("food preference both: " + numB);
		
		System.out.println("The average age was: " + averageAge);
		if (youngestAge >= 0)
			System.out.println("The youngest person in attendance was: " + youngestAge);
		if (oldestAge >= 0)
			System.out.println("The oldest person in attendance was: " + oldestAge);
		
		input.close();
	}
}

/*
Enter age of attendee (negative number to quit) : 34
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : s
Enter age of attendee (negative number to quit) : 16
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : b
Enter age of attendee (negative number to quit) : 68
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : b
Enter age of attendee (negative number to quit) : 53
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : s
Enter age of attendee (negative number to quit) : 39
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : p
Enter age of attendee (negative number to quit) : 23
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : s
Enter age of attendee (negative number to quit) : 21
Enter food preference ('p' for popcorn, 's' for soda, 'b' for both) : s
Enter age of attendee (negative number to quit) : -1
 
age 0 to 18: 1
age 18 to 30: 2
age 30 to 40: 2
age 40 to 60: 1
over 60: 1
 
food preference popcorn: 1
food preference soda: 4
food preference both: 2
The average age was: 36
The youngest person in attendance was: 16
The oldest person in attendance was: 68
*/
