/******************************************
 *  Compilation:  javac ArithmeticOperators.java
 *  Execution:    java ArithmeticOperators
 *
 *  Prints the result from arithmetic 
 *	operations.
 *
 ******************************************/

import java.lang.*;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// example variables
		double a = 10.0;
		double b = 20.0;

		// addition
		System.out.println(a + b); 					// a + b
		System.out.println(a + (a + b)); 			// a + (a + b)

		// subtraction
		System.out.println(b - a); 					// b - a
		System.out.println(b - b); 					// b - b

		// multiplication
		System.out.println(a * b); 					// a * b
		System.out.println(a * (a * 2)); 			// a * (a * 2)

		// division
		System.out.println(b / a);					// b / a
		System.out.println((a * b) / a); 			// (a * b) / a

		// modulus
		System.out.println(b % a); 					// b % a
		System.out.println(a % b);					// a % b

		// exponent
		System.out.println(Math.pow(a, 2));			// a^2
		System.out.println(Math.pow(b, (a / 10)));	// b^(a / 10)
	}

}