/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program creates a class Fraction. This class has two instance variables,
 * numValue for the numerator, and denValue for the denominator. There is a default
 * constructor and a constructor that assigns two given values to numValue and denValue.
 * There are four methods corresponding to the four operations that are able to be performed
 * on the fraction object; addition, subtraction, multiplication, and division. The method isEqualTo
 * determines whether two fraction objects are equal to each other. The gcf method provides an int that
 * reduces a fraction when it is printed with the print method.
 */


public class Fraction {
	
	private int numValue;
	private int denValue;
	
	//default constructor
	public Fraction(){
		
		numValue = 0;
		denValue = 1;
	}
	
	
	
	
	
	
	//constructor that gives values to numValue and denValue
	public Fraction(int num, int den){
		
		numValue = num;
		denValue = den;
	}
	
	
	
	
	
	
	//adds the value of the entered fraction object to the current fraction
	public Fraction addedTo(Fraction f2){
		
		int modNum1;
		int modNum2;
		int modDen;
		
		modDen = denValue * f2.denValue;
		modNum1 = numValue * f2.denValue;
		modNum2 = f2.numValue * denValue;
		
		Fraction result = new Fraction(modNum1 + modNum2, modDen);
		return result;
	}
	
	
	
	
	
	
	//subtracts the value of the entered fraction object to the current fraction
	public Fraction subtract(Fraction f2){
		
		int modNum1;
		int modNum2;
		int modDen;
		
		modDen = denValue * f2.denValue;
		modNum1 = numValue * f2.denValue;
		modNum2 = f2.numValue * denValue;
		
		Fraction result = new Fraction(modNum1 - modNum2, modDen);
		return result;
	}
	
	
	
	
	
	
	//multiply the value of the entered fraction object to the current fraction
	public Fraction multipliedBy(Fraction f2){
		
		Fraction result = new Fraction(numValue * f2.numValue, denValue * f2.denValue); 
		return result;
	}
	
	
	
	
	
	
	//divides the value of the current fraction object by the entered fraction
	public Fraction dividedBy(Fraction f2){
		
		Fraction result = new Fraction(numValue * f2.denValue, denValue * f2.numValue);
		return result;
	}
	
	
	
	
	
	
	//determines whether the value of the entered fraction object is equal to the current fraction
	public boolean isEqualTo(Fraction f2){
		
		if (numValue == f2.numValue && denValue == f2.denValue)
			return true;
		else
			return false;
	}
	
	
	
	
	
	//outputs the value of the current fraction object
	public void print(){
		
		System.out.print(numValue / gcf() + "/" + denValue / gcf());
	}
	
	
	
	
	
	
	//finds the greatest common factor of the fraction
	private int gcf(){
		
		int store;
	    if (numValue > denValue)
	        store = denValue;
	    else
	        store = numValue;
	    for (int i = store; i > 0; i--) {
	        if ((numValue % i == 0) && (denValue % i == 0))
	            return i;
	    }
	    return 1;
	}
}
