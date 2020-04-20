package CourseWork;

public class Lab1 {

	public static void main(String[] args) {
		
		int max = max3(50, 80, 105);
		System.out.println("Number 1 answer: " + max);
		
		int min = min3(80, 50, 105);
		System.out.println("Number 2 answer: " + min);
		
		int medianOld = median3Old(80, 50, 105);
		System.out.println("Other Way to do Number 3: " + medianOld);
		
		int median = median3(80, 50, 105);
		System.out.println("Number 3 answer: " + median);
		
		boolean answer = xor(true, true);
		System.out.println("Number 4 answer: " + answer);
		
		boolean factor = isFactor(14, 28);
		System.out.println("Number 5 answer: " + factor);
		
		boolean perfect = isPerfect(28);
		System.out.println("Number 6 answer: " + perfect);
		
		boolean prime = isPrime(10);
		System.out.println("Number 7 answer: " + prime);
	}
		
	// 1. Modifier => public static
	// 2. Return Type => int
	// 3. Method Name => max3
	// 4. Args => int valueOne, int valueTwo, int valueThree
	
	// Lab 1: 	// Write a method called "max3" that computes the maximum value of THREE integers.

	public static int max3(int valueOne, int valueTwo, int valueThree) {
		int max = valueOne;
		if(valueTwo > max) {
			max = valueTwo;
		}
		if(valueThree > max) {
			max = valueThree;
		}
		return max;
	}
	
	// Lab 2: Write a method called "min3" that computes the minimum value of THREE Integers. 
	public static int min3(int valueOne, int valueTwo, int valueThree) {
		int min = valueOne;
		if(valueTwo < min) {
			min = valueTwo;
		}
		if(valueThree < min) {
			min = valueThree;
		}
		return min;		
	}
	
	// Lab 3: Write a method called "median3" that computes the MEDIAN value of THREE integers.
	public static int median3Old(int valueOne, int valueTwo, int valueThree) {
		int medianOld = valueOne;
		if(valueTwo > valueOne && valueOne > valueThree || valueThree > valueOne && valueOne > valueTwo) {
			return valueOne;
		}
		if(valueOne > valueTwo && valueTwo > valueThree || valueThree > valueTwo && valueTwo > valueOne) {
			return valueTwo;
		}
		if(valueOne > valueThree && valueThree > valueTwo || valueTwo > valueThree && valueThree > valueOne) {
			return valueThree;
		}
		return medianOld;
	}
	
	// Lab 3 PROPER
	public static int median3(int valueOne, int valueTwo, int valueThree) {
		int median = 0;
		int total = valueOne + valueTwo + valueThree;
		median = total - max3(valueOne, valueTwo, valueThree) - min3(valueOne, valueTwo, valueThree);
		return median;
	}
	
	// Lab 4: Write a method called "xor" that takes two boolean values (either true or false) and returns a boolean value which is true if EITHER of the values is true BUT NOT BOTH of them.
	public static boolean xor(boolean x, boolean y) {
		return x != y;
	}
	
	// Lab 5: Write a method "isFactor" which takes two integers (k and n) and returns true iff("if and only if") k is a factor of n.
	public static boolean isFactor(int k, int n) {
		return n % k == 0;
	}
	
	// Lab 6: Write a method "isPerfect" which takes an integer and returns true iff that integer is a perfect number
	public static boolean isPerfect(int value) {
		if(value == 0) {
			return false;
		}
		int sum = 0;
		
		for(int i = 1; i < value; i++) {
			if(isFactor(i, value)) {
				sum+=i;
			}
		}
		if(sum == value) {
			return true;
		} else {
			return false;
		}
	}
	
	// Lab 7: Write a method "isPrime" which takes an integer and returns true iff it is a prime number.
	public static boolean isPrime(int value) {
		if(value == 0) {
			return false;
		}
		int sum = 0;
		
		for(int i = 1; i < value; i++) {
			if(isFactor(i, value)) {
				sum+=i;
			}
		}
		if(sum == 1) {
			return true;
		} else {
			return false;
		}
	}
}