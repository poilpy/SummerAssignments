
import java.util.Scanner;

public class A1_3 {
	
	public static int convert = 16;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int pounds;
		int ounces;
		
		System.out.print("Enter pounds: ");
		pounds = input.nextInt();
		
		ounces = pounds * convert;
		
		System.out.println(pounds + " pounds is " + ounces + " ounces.");
		
		input.close();
	}
}

/*
Enter pounds: 10
10 pounds is 160 ounces.
*/