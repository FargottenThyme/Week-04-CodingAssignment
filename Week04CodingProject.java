package backEndSoftwareDesignHomework;

// import java.util.*;


public class Week04CodingProject {
	
	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // 1. Creating an Array of type int, with 8 values.
		System.out.println((ages.length - 1) - ages[0]);
		// Print out the result of: Last index of ages minus the first index of ages.
		int[] ages2 = {35, 8, 10, 24, 63, 18, 41, 99, 1}; // 1.b Creating an Array of type int, with 9 values.
		System.out.println((ages2.length-1) - ages2[0]);
		// Print out the result using the previous algorithm.
		int ages2Sum = 0; // Declare the variable before the loop.
		for (int i = 0; i < ages2.length; i++) {
			ages2Sum += ages2[i]; // Adds the current value of ages2Sum to ages2 of index [i], until i = ages2.length - 1
		}
		System.out.println(ages2Sum/ages2.length); // Prints the average of ages2 via sum / length.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // 2. Creating an Array of type String, with 6 values.
		int namesLengthSum = 0; // 2.a Declare the variable for Sum before the loop.
		for (int i = 0; i < names.length; i++) {
			namesLengthSum += names[i].length(); // Adds the current value of namesLengthSum to the length of names at index i, until i = names.length - 1
		}
		System.out.println(namesLengthSum/names.length); // 2.a Prints the average name length.
		String namesConcat = names[0]; // 2.b Declare and assign first value to the concatenation varable.
		for (int i = 1; i < names.length; i ++) {
			namesConcat += " " + names[i]; // Adding a space then the value of names at index i, until i = names.length - 1
		}
		System.out.println(namesConcat); // Printing the result of concatenated names.
		
		// 3. To access the last element of an array, use the syntax arrayName[arrayName.length - 1]
		System.out.println(names[names.length - 1]);
		
		// 4. To access the first element of an array, use the syntax arrayName[0]
		System.out.println(names[0]);
		
		int[] nameLengths = new int[6]; // 5. Create an Array of type int, with 6 elements, but no values.
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); // Iterates through, designating each index of nameLengths equal to the length of the same index in names.
		}
		
		int nameLengthsSum = 0; // 6. Declare the sum variable.
		for (int lengths : nameLengths) {
			nameLengthsSum += lengths; // Adding each value of nameLengths to nameLengthsSum
		}
		System.out.println(nameLengthsSum); // Print the result.
		System.out.println(wordConcat("Hello", 3)); // Prints the result of 7
		System.out.println(fullName("Dylan", "Karr")); // Prints the result of 8
		System.out.println(isOver100(ages2)); // Prints the result of 9, using the array from problem 1.b
		double[] dblArray = {3.4, 11.0, 36.8, 22.2, 17.1}; // Creates a double array for use in problem 10.
		System.out.println(avgOfDblArray(dblArray)); // Prints the result of 10
		double[] dblArray2 = {5.8, 12.1, 45.3, 20.0, 15.9, 34.5}; // Creates a second double array for use in problem 11.
		System.out.println(isAvg1OverAvg2(dblArray, dblArray2)); // Prints the result of 11.
		System.out.println(willBuyDrink(true, 10.00)); // Prints the result of 12.
		System.out.println(firstLetterToUpper("project")); // Prints the result of 13.
	}
	// 7. Create a public scope, static method, of type String. Inputs are (String word, int n).
	public static String wordConcat(String word, int n) {
		String wordConcatenated = ""; // Declares a variable to start the concatenation.
		if (n > 0) { // Checks to make sure n > 0.
			for (int i = 0; i < n; i++) {
				wordConcatenated += word; // Concatenates word for each pass of i, until i = n - 1
			}
			return wordConcatenated; // Return the concatenation.
		} else { // If n !> 0, null is returned.
			return null;
		}
	}
	// 8. Create a public scope, static method of type String. Inputs are (String firstName, String lastName).
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName; // Returns a concatenation of firstName and lastName with a space between.
	}
	// 9. Create a public scope, static method of type boolean. Input is (int[] numArray).
	public static boolean isOver100(int[] numArray) {
		int numSum = 0; // Declare the sum variable.
		for (int numAdd : numArray) {
			numSum += numAdd; // With each iteration of numArray, adds the value to numSum. Uses an advanced for loop.
		}
		return numSum > 100; // Returns true if numSum > 100, false if numSum !> 100.
	}
	// 10. Create a public scope, static method of type double. Input is (double[] numDblArray).
	public static double avgOfDblArray(double[] numDblArray) {
		double numDblSum = 0.0; // Declare the sum variable of type double.
		for (double numDblAdd : numDblArray) {
			numDblSum += numDblAdd; // With each iteration of numDblArray, add the value to numDblSum. Uses an advanced for loop.
		}
		return numDblSum/numDblArray.length; // Returns the result of numDblSum divided by the length of numDblArray, thus the average.
	}
	// 11. Create a public scope, static method of type boolean. Inputs are (double[] dblArray, double[] dblArray2).
	public static boolean isAvg1OverAvg2(double[] dblArray, double[] dblArray2) {
		double dblSum = 0.0;
		double dblSum2 = 0.0; // Declare both required Sum variables.
		for (double dblAdd : dblArray) {
			dblSum += dblAdd; // With each iteration of dblArray, add the value to dblSum. Uses an advanced for loop.
		}
		double dblAvg = dblSum / dblArray.length; // Declares and sets the value of the avg variable.
		for (double dblAdd2 : dblArray2) {
			dblSum2 += dblAdd2; // With each iteration of dblArray2, add the value to dblSum2. Uses an advanced for loop.
		}
		double dblAvg2 = dblSum2 / dblArray2.length; // Declare and sets the value of the avg2 variable.
		return dblAvg > dblAvg2; // Returns a true if dblAvg is greater than dblAvg2, returns false otherwise.
	}
	// 12. Create a public scope, static method of type boolean. Inputs are (boolean isHotOutside, double moneyInPocket).
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) { // Checks if isHotOutside is true AND if moneyInPocket is greater than 10.50
				return true; // If both are true, returns true
		} else {
			return false; // Returns false if at least one is false.
		}
	}
	// 13. Create a public scope, static method of type String. Input is (String word).
	// Method goal is to take a word and update the first letter to an uppercase character.
	public static String firstLetterToUpper(String word) {
		char[] charArray = word.toCharArray(); // Converts word to a char array.
		String firstLetter = String.valueOf(charArray[0]); // Selects the first letter in charArray and assigns to a String.
		firstLetter = firstLetter.toUpperCase(); // Uses the string modifier toUppercase() on the single character String.
		charArray[0] = firstLetter.charAt(0); // Reassigns the first char in charArray to the first index of firstLetter.
		String upperWord = String.valueOf(charArray); // Converts the char array to String.
		return upperWord; // Returns the result.
	}
		
		

}
