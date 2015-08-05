/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * this program tests the fraction class. All methods from Fraction.java
 * are called and work as intended.
 */


public class FractionTest {
	
	public static void main(String[] args) {
        Fraction f1 = new Fraction(9,8);
        Fraction f2 = new Fraction(2,3);
        Fraction result = new Fraction();

        System.out.print("The result starts off at ");
        result.print();
        System.out.println();

        System.out.print("The product of ");
        f1.print();
        System.out.print(" and ");
        f2.print();
        System.out.print(" is ");
        result = f1.multipliedBy(f2);
        result.print();
        System.out.println();

        System.out.print("The quotient of ");
        f1.print();
        System.out.print(" and ");
        f2.print();
        System.out.print(" is ");
        result = f1.dividedBy(f2);
        result.print();
        System.out.println();

        System.out.print("The sum of ");
        f1.print();
        System.out.print(" and ");
        f2.print();
        System.out.print(" is ");
        result = f1.addedTo(f2);
        result.print();
        System.out.println();

        System.out.print("The difference of ");
        f1.print();
        System.out.print(" and ");
        f2.print();
        System.out.print(" is ");
        result = f1.subtract(f2);
        result.print();
        System.out.println();

        if (f1.isEqualTo(f2)){
            System.out.println("The two Fractions are equal.");
        } else {
            System.out.println("The two Fractions are not equal.");
        }
        
        Fraction f3 = new Fraction(12, 8);
        Fraction f4 = new Fraction(202, 303);
        result = f3.multipliedBy(f4);
        System.out.print("The product of ");
        f3.print();
        System.out.print(" and ");
        f4.print();
        System.out.print(" is ");
        result.print();
        System.out.println();
    }
}

/*
The result starts off at 0/1
The product of 9/8 and 2/3 is 3/4
The quotient of 9/8 and 2/3 is 27/16
The sum of 9/8 and 2/3 is 43/24
The difference of 9/8 and 2/3 is 11/24
The two Fractions are not equal.
The product of 3/2 and 2/3 is 1/1
*/