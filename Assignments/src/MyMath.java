/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This class stores the methods for outputting whether a number is perfect
 * or prime.
 */

public class MyMath {
	
	//isPerfect returns a number if it is perfect and 0 if it isn't; number is the number checked
	public static int isPerfect(int number){
		
		int sum = 0;
		
		for ( int addition = 1; addition < number; addition++){
			
			if (number % addition == 0)
				sum += addition;
		}
		
		if (sum == number)
			return number;
		else
			return 0;
	}
	
	
	
	
	
	
	//isPrime returns a number if it is prime and 0 if it isn't; number is the number checked
	public static int isPrime(int number){
		
		int pointOfDivision = 0;
		
		for ( int divisor = 2; divisor < number; divisor++){
			
			if (number % divisor == 0)
				pointOfDivision = divisor;
		}
		
		if ( pointOfDivision > 0)
			return 0;
		else
			return number;
	}
	
}
