/******************************************************
 *
 *  Declare and initialise various variable types.
 *
 *  Author 			: Michael Sjoeberg (github.com/mqe)
 *
 *  Date 			: 13 July 2017
 *  Updated 		: 13 July 2017 (Michael Sjoeberg)
 * 
 *  Compilation 	: javac VariableTypes.java
 *  Execution 		: java VariableTypes
 *
 ******************************************************/

public class VariableTypes {

	public static void main(String[] args) {

		// print credits
		System.out.println(
			"---------------------------------------------------\n" +
			"Program   : Variable Types\n" +
			"Author    : Michael Sjoeberg (github.com/mqe)\n" +
			"Date      : 13 July 2017\n" +
			"Updated   : 13 July 2017 (Michael Sjoeberg)\n" +
			"---------------------------------------------------\n");

		// integer examples
		System.out.println("Integer:");
		integer_example();

		// char and string examples
		System.out.println("String and Char:");
		char_string();

		// byte and double examples
		System.out.println("Byte and Double:");
		byte_double();
	}

	/**
	 * Private method for integer.
	 */
	private static void integer_example() {

		// declare and initialise x, y, and z as 'int'
		int x = 6, y = 8, z = 10;

		// print variables
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println(" ");
	}

	/**
	 * Private method for char and string.
	 */
	private static void char_string() {

		// declare and initialise 'name' and 'character' as 'String' and 'char'
		String aString = "Michael";
		char aChar = 'm';

		// print variables
		System.out.println("aString = " + aString);
		System.out.println("aChar = " + aChar);
		System.out.println(" ");
	}

	/**
	 * Private method for byte and double.
	 */
	private static void byte_double() {

		// declare and initialise bigB and d as 'byte' and 'double'
		byte aByte = 22;
		double aDouble = 3.14159;

		// print variables
		System.out.println("aByte = " + aByte);
		System.out.println("aDouble = " + aDouble);
		System.out.println(" ");
	}

}