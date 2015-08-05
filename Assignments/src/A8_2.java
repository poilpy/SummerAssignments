/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program asks the user to input integers until they input
 * a negative number. These integer are stored in an array, unless the
 * integer has already been entered. Finally, the contents of the array
 * are outputted to the console in the order that they were entered in.
 * If a negative number is entered first, nothing is outputted. Otherwise,
 * the sequence of integers entered are outputted, excluding repeats of integers.
 */

import java.util.Scanner;


public class A8_2 {
	
	static Scanner input;
	public final static int MAX_ARRAY_SIZE = 1000;
	
	public static void main(String[] args){
		
		input = new Scanner(System.in);
		int[] store = new int[MAX_ARRAY_SIZE];
		int size;
		
		size = readNumbers(store);
		printNumbers(store, size);
	}
	
	
	
	
	
	
	//readNumbers asks the user to input numbers then stores them in the array parameter, list. If a number is repeated, it is not stored.
	public static int readNumbers(int[] list){
		
        int number, count = 0;
 
        System.out.print("Enter a non-negative integer (negative to quit): ");
        number = input.nextInt();

        while ((number >= 0) && (count < MAX_ARRAY_SIZE)){
            
        	if (notInArray(list, number)){
        		list[count] = number;
            	count++;
        	}
            
            if (count < MAX_ARRAY_SIZE){
                System.out.print("Enter a non-negative integer (negative to quit): ");
                number = input.nextInt();
            }
            else
                System.out.println("the array is now full.");
        }
        
        return count;
    }
	
	
	
	
	
	
	//notInArray checks whether the the parameter, number, is in the array parameter, enteredArray.
	public static boolean notInArray( int[] enteredArray, int number){
		
		for (int count : enteredArray){
			
			if (count == number)
				return false;
		}
		
		return true;
		
	}
	
	
	
	
	
	
	//printNumbers outputs the contents of the arrat parameter, list. numItems is the point where the contents stop being outputted.
	public static void printNumbers(int[] list,  int numItems){
        
		int count;
        
		System.out.print("You entered: \n");
        for (count = 0; count < numItems; count++){
            System.out.print(list[count] + " ");
        }
    }
	
}

/*
Enter a non-negative integer (negative to quit): 1
Enter a non-negative integer (negative to quit): 2
Enter a non-negative integer (negative to quit): 3
Enter a non-negative integer (negative to quit): 2
Enter a non-negative integer (negative to quit): 1
Enter a non-negative integer (negative to quit): 6
Enter a non-negative integer (negative to quit): 3
Enter a non-negative integer (negative to quit): 4
Enter a non-negative integer (negative to quit): 5
Enter a non-negative integer (negative to quit): 2
Enter a non-negative integer (negative to quit): -4
You entered: 
1 2 3 6 4 5 
*/
