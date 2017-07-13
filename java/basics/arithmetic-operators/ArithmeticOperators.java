/******************************************************
 *
 *  Compute and print the result from various
 *  arithmetic operations.
 *
 *  Author 			: Michael Sjoeberg (github.com/mqe)
 *
 *  Date 			: 13 July 2017
 *  Updated 		: 13 July 2017 (Michael Sjoeberg)
 * 
 *  Compilation 	: javac ArithmeticOperators.java
 *  Execution 		: java ArithmeticOperators
 *
 ******************************************************/

public class ArithmeticOperators {

	public static void main(String[] args) {
		// example variables
		double a = 10.0;
		double b = 20.0;

		// print credits
		System.out.println("---------------------------------------------------\n" +
						   "Author 	  : Michael Sjoeberg (github.com/mqe)\n" +
						   "Date 	  : 13 July 2017\n" +
						   "Updated   : 13 July 2017 (Michael Sjoeberg)\n" +
						   "---------------------------------------------------\n");

		// print example variables
		System.out.println("a = " + Double.toString(a));
		System.out.println("b = " + Double.toString(b));
		System.out.println(" ");

		// addition examples
		System.out.println("Addition:");
		addition(a, b);

		// subtraction examples
		System.out.println("Subtraction:");
		subtraction(a, b);

		// multiplication examples
		System.out.println("Multiplication:");
		multiplication(a, b);

		// division examples
		System.out.println("Division:");
		division(a, b);

		// modulo examples
		System.out.println("Modulo:");
		modulo(a, b);

		// increment
		System.out.println("Increment:");
		a++;
		System.out.println("a++ => a = " + Double.toString(a));
		System.out.println(" ");

		// decrement
		System.out.println("Decrement:");
		b--;
		System.out.println("b-- => b = " + Double.toString(b));
		System.out.println(" ");
	}

	/**
	 * Private method for addition.
	 */
	private static void addition(double a, double b) {

		// addition examples
		System.out.println("a + b = "  		 	+ Double.toString(a + b));
		System.out.println("a + (a + b) = " 	+ Double.toString(a + (a + b)));
		System.out.println(" ");
	}

	/**
	 * Private method for subtraction.
	 */
	private static void subtraction(double a, double b) {

		// subtraction examples
		System.out.println("a - b = "  			+ Double.toString(a - b));
		System.out.println("a - (a - b) = "  	+ Double.toString(a - (a - b)));
		System.out.println(" ");
	}

	/**
	 * Private method for multiplication.
	 */
	private static void multiplication(double a, double b) {

		// multiplication examples
		System.out.println("a * b = "  			+ Double.toString(a * b));
		System.out.println("a * (a * 2) = "  	+ Double.toString(a * (a * 2)));
		System.out.println(" ");
	}

	/**
	 * Private method for division.
	 */
	private static void division(double a, double b) {

		// division examples
		System.out.println("a / b = "  			+ Double.toString(a / b));
		System.out.println("(a * b) / a = "  	+ Double.toString((a * b) / a));
		System.out.println(" ");
	}

	/**
	 * Private method for modulo.
	 */
	private static void modulo(double a, double b) {

		// modulo examples
		System.out.println("a % b = "  			+ Double.toString(a % b));
		System.out.println("(a * b) % b = "  	+ Double.toString((a * b) % b));
		System.out.println(" ");
	}
}
