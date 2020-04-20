package CourseWork;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 2 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Return answer: " + aPlusB(a, b));
		
		System.out.println("Enter temperature: ");
		int temperature = input.nextInt();
		System.out.println("Is it summer(true or false): ");
		boolean isSummer = input.nextBoolean();
		System.out.println("Will the squirrels play today: " + willSquirrelsPlay(temperature, isSummer));
		
		System.out.println("Enter 3 lotto numbers: ");
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
		int valueThree = input.nextInt();
		System.out.println("Lottery ticket value: " + greenTicket(valueOne, valueTwo, valueThree));
		
		System.out.println("Enter a string with x's in a row throughout it: ");
		String sentence = input.next();
		System.out.println("Number of repeating XX's in the String: " + countXX(sentence));
		
		System.out.println("Enter a String then number of times wanting to repeat: ");
		String anotherSentence = input.next();
		int times = input.nextInt();
		System.out.println("String repeated X number of times: " + multipleStrings(anotherSentence, times));
				
		input.close();
	}
	
	// Question 1: Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b.
	public static int aPlusB(int a, int b) {
		String aString = String.valueOf(a);
		int aLength = aString.length();
		String sumString = String.valueOf(a + b);
		int sumLength = sumString.length();	
		
		if(sumLength == aLength) {
			return a + b;
		} else {
			return a;
		}
	}
	
	// Question 2: The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
	public static boolean willSquirrelsPlay(int temperature, boolean isSummer) {
	  if(isSummer) {
		return (temperature >= 60 && temperature <= 100);
	  }
	return (temperature >= 60 && temperature <= 90);
	}
	
	// Question 3: You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
	public static int greenTicket(int valueOne, int valueTwo, int valueThree) {
		if(valueOne == valueTwo) {
			if(valueTwo == valueThree) {
				return 20;
			}
			return 10;
		}
		if(valueOne == valueThree || valueTwo == valueThree) {
			return 10;
		}
		return 0;
	}
	
	// Question 4: Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	public static int countXX(String sentence) {
		int count = 0;
		for(int i = 0; i < sentence.length() - 1; i++) {
			if(sentence.charAt(i) == 'x' || sentence.charAt(i) == 'X') {
				if(sentence.charAt(i + 1) == 'x' || sentence.charAt(i + 1) == 'X') {
					count++;
				}
			}
		}
		return count;
	}
	
	// Question 5: Given a string and a non-negative int n, return a larger string that is n copies of the original string.
	public static String multipleStrings(String anotherSentence, int times) {
		String newSentence = "";
		for(int i = 0; i < times; i++) {
			newSentence += anotherSentence;
		}
		return newSentence;
	}
}