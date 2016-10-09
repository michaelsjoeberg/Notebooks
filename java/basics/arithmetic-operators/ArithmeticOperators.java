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
		System.out.println(a + b); 					// 30
		System.out.println(a + (a + b)); 			// 40

		// subtraction
		System.out.println(b - a); 					// 10
		System.out.println(b - b); 					// 0

		// multiplication
		System.out.println(a * b); 					// 200
		System.out.println(a * (a * 2)); 			// 200

		// division
		System.out.println(b / a);					// 2
		System.out.println((a * b) / a); 			// 20

		// modulus
		System.out.println(b % a); 					// 0
		System.out.println(a % b);					// 10

		// increment
		a++;
		System.out.println(a);						// 11

		// decrement
		b--;
		System.out.println(b);						// 19
	}

}