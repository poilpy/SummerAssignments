/*
 * Colin Murphy
 * CIS254
 * 6-28-15
 * Harden
 * 
 * This class lists the methods that belong to the WordCruncher class.
 * The class sets the instance variable to the parameter when constructed
 * if the parameter contains only letters, otherwise the instance variable is set
 * to default. The class has methods that return numLetters, numVowels, whether the 
 * instance variable beginsWithVowel, the reversed, pig latin, and gibberish forms of the instance variables,
 * and the number of any entered characters in the instance variable.
 */

public class WordCruncher {
	
	private String word;
	
	/*
	 * The default constructor that sets the instance variable to "default".
	 */
	public WordCruncher(){
		
		word = "default";
	}
	
	
	
	
	
	
	/*
	 * overloaded constructor that sets the instance variable to the passed string
	 * if it contains only characters. Otherwise, it is set to "default".
	 */
	public WordCruncher(String string){
		
		if (string.matches("[A-Za-z]*"))
			word = string;
		else
			word = "default";
	}

	
	
	
	
	/*
	 * numLetters returns the length of the instance variable.
	 */
	public int numLetters(){
		
		return word.length();
	}

	
	
	
	
	/*
	 * numVowels loops through each char in the instance variable
	 * checking each one for whether it is a vowel or not. If so,
	 * a counter is incremented. the counter is returned.
	 */
	public int numVowels(){
		
		int numV = 0;
		
		for(int i = 0; i < word.length(); i++){
			char v = word.charAt(i);
			if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u' || v=='A' || v=='E' || v=='I' || v=='O' || v=='U'){
	            numV++;
	        }
	    }
		
		
		return numV;
	}

	
	
	
	
	/*
	 * isQuit checks whether the instance variable is the string
	 * "quit". if so, it returns true, otherwise false. This
	 * is necessary for the while loop in WordCruncherTest.java.
	 */
	public boolean isQuit(){
		
		boolean isTrue = false;
		
		if(word.equals("quit"))
			isTrue = true;
		else
			isTrue = false;
		
		return isTrue;
	}

	
	
	
	
	/*
	 * beginsWithVowel checks whether the first letter of the instance variable is
	 * a vowel. If so, it returns true, otherwise false. This is necessary for the
	 * toPigLatin and toGibberish methods.
	 */
	private boolean beginsWithVowel(){
		
		boolean isTrue = false;
		
		if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u") || word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("o") || word.startsWith("U"))
			isTrue = true;
		else
			isTrue = false;
		
		return isTrue;
	}

	
	
	
	
	/*
	 * toPigLatin adds "way" to the end of the instance variable
	 * if it begins with a vowel and moves the first letter of the
	 * instance variable along with "ay" if it begins with a consonant. 
	 * The edited form is returned rather than the instance variable.
	 */
	public String toPigLatin(){
		
		String editedWord = word;
		
		if(beginsWithVowel())
			editedWord = editedWord + "way";
		else{
			
			char firstLetter = editedWord.charAt(0);
			editedWord = editedWord.substring(1);
			editedWord = editedWord + firstLetter + "ay";
		}
		
		return editedWord;
	}

	
	
	
	
	/*
	 * toGibberish adds "ithag" to the beginning of the instance variable
	 * if it begins with a vowel and adds "ithag" in between the first letter and
	 * the rest of the instance variable if it begins with a consonant. The edited form
	 * is returned rather than the instance variable.
	 */
	public String toGibberish(){
		
		String editedWord = word;
		
		if(beginsWithVowel())
			editedWord = "itha" + "g" + editedWord;
		else{
			
			char firstLetter = editedWord.charAt(0);
			editedWord = editedWord.substring(1);
			editedWord = firstLetter + "ithag" + editedWord;
		}
		
		return editedWord;
	}

	
	
	
	
	/*
	 * reverse loops through the instance variable backwards, placing the reversed 
	 * sequence of letters into a char array. The array is then turned into a new
	 * sting and returned.
	 */
	public String reverse(){
		
		char[] rArray = new char[word.length()];
		int rCount = 0;
				
		for(int count = word.length() - 1; count >= 0; count--){
			
			rArray[rCount] = word.charAt(count);
			rCount++;
		}
		
		String reversedWord = new String(rArray);
		
		return reversedWord;
	}

	
	
	
	
	/*
	 * numCharOccurrences loops through the instance variable and checks
	 * whether each letter in the char parameter ch. If so, a counter is
	 * incremented. The counter is returned.
	 */
	public int numCharOccurrences(char ch){
		
		int chCount = 0;
		
		for(int count = 0; count < word.length(); count++){
			
			if(word.charAt(count) == ch)
				chCount++;
		}
		
		return chCount;
	}

	
	
	
	
	/*
	 * getWord returns the instance variable. This is used to tell the user what
	 * word they entered in WordCruncherTest.java.
	 */
	public String getWord(){
		
		return word;
	}
	
}


