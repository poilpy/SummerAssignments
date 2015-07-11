
public class MyMath {
	
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
