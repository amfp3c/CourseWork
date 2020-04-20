package CourseWork;

public class Day3Assignment {

	public static void main(String[] args) {
		String testWord = "Racecar";
		
		String wordTwo = upperLower(testWord);
		System.out.println("Question 1 answer: " + wordTwo);
		
		System.out.println("Question 2 answer: " + isPalindrome(testWord));
		
		System.out.println("Question 3 answer: " + vowelCount(testWord));
		
		System.out.println("Question 4 answer: " + removeCharacterAtPoint(testWord, 'c'));
		
		System.out.println("Question 5 answer: " + removeMiddle(testWord));
	}
	
	// Lab 1: Write a program to convert every even position to upper case and every odd position to lower case.
	public static String upperLower(String word) {
		String wordTwo = "";
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if(i % 2 == 0) {
				ch = Character.toLowerCase(ch);
			} else {
					ch = Character.toUpperCase(ch);
				}
					wordTwo += ch;
		}
		return wordTwo;
	}
	
	// Lab 2: Write a program to determine if a string is a palindrome.
	public static boolean isPalindrome(String word) {
		String  exampleReverse= "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			exampleReverse += word.charAt(i);
		}
			if(word.equalsIgnoreCase(exampleReverse)){
		return true;
		}
		return false;
	}
	
	/* public static boolean isPalindrome(String word) {
		String exampleForward = "";
		for(int i = 0; i < exampleForward.length(); i++) {
			System.out.println(exampleForward.charAt(i));
		}
		
		boolean palindrome = true;
		String  exampleReverse= "";
		for(int i = exampleReverse.length() - 1; i >= 0; i--) {
			System.out.println(exampleReverse.charAt(i));
		}
		if(exampleForward == exampleReverse) {
			
		}
		return palindrome; */
	
	// Lab 3: Write a program to count all the vowels in a string.
	public static int vowelCount(String str) {
		int vCount = 0;
		// String str = sentenceExample;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vCount++;
			}
		}
		return vCount;
	}
	
	// Lab 4: Write a method to remove a given character from a string.
	public static String removeCharacterAtPoint(String testWord, char p) {
		String newWord = "";
		// newWord = testWord.toLowerCase();
		for(int i = 0; i < testWord.length(); i++) {
			if(testWord.charAt(i) != p) {
				newWord = newWord + testWord.charAt(i);
			}
		}
		return newWord.toLowerCase();
        // return testWord.substring(0, p) + testWord.substring(p + 1);  
	}
	
	// Lab 5: Write a program to remove the middle character of a string.
	public static String removeMiddle(String word) {
		String result = "";
		// Step 1: check if even or odd
		if(word.length() % 2 == 0) {
			// Even case
			int middleUpperLetter = word.length() / 2;
			int middleLowerLetter = middleUpperLetter - 1;
			result = word.substring(0, middleLowerLetter);
			result = result + word.substring(middleUpperLetter + 1);
		} else {
			// Odd case
			int middleLetter = word.length() / 2;
			result = word.substring(0, middleLetter);
			result = result + word.substring(middleLetter + 1);
		}
		return result;
	}
}