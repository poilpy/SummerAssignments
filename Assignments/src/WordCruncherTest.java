/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This program tests the methods from WordCruncher.java.
 * The users is asked to input a word other than quit (which would terminate the program). 
 * The program then prints the number of letters in the word, the number of vowels, the reversed form
 * of the word, the word in pig latin and gibberish, and the number of occurrences of a letter entered by the user.
 * The process then repeats.
 */

import java.util.Scanner;


public class WordCruncherTest {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word (enter quit to exit) :");
		WordCruncher word = new WordCruncher(input.nextLine());
		
		while(!word.isQuit()){
			
			System.out.println(word.numLetters() + " letters.");
			System.out.println(word.numVowels() + " vowels.");
			System.out.println(word.reverse() + " when reversed.");
			System.out.println(word.toPigLatin() + " in pig latin.");
			System.out.println(word.toGibberish() + " in gibberish");
			
			System.out.print("Enter a letter: ");
			char enteredLetter = input.next().charAt(0);
			System.out.println(enteredLetter + " occurs " + word.numCharOccurrences(enteredLetter) + " times in " + word.getWord());
			
			System.out.print("Enter a word (enter quit to exit) :");
			word = new WordCruncher(input.next());
		}
		
		
		input.close();
	}
	
}


/*
Enter a word (enter quit to exit) :HelloWorld
10 letters.
3 vowels.
dlroWolleH when reversed.
elloWorldHay in pig latin.
HithagelloWorld in gibberish
Enter a letter: l
l occurs 3 times in HelloWorld
Enter a word (enter quit to exit) :quit
*/