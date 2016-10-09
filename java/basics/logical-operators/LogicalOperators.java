/******************************************
 *  Compilation:  javac LogicalOperators.java
 *  Execution:    java LogicalOperators
 *
 *  Prints the result from logical 
 *	operations.
 *
 ******************************************/

public class LogicalOperators {

	public static void main(String[] args) {
		// example variables
		int A = 3;
		int B = 5;
		boolean T = true;
		boolean F = false;

		// print 'equal to'
		System.out.println(A == B); 			// false

		// print 'not equal to'
		System.out.println(A != B);				// true

		// print 'greater than'
		System.out.println(A > B); 				// false

		// print 'less than'
		System.out.println(A < B); 				// true

		// print 'greater than or equal to'
		System.out.println(A >= B); 			// false

		// print 'less than or equal to'
		System.out.println(A <= B); 			// true

		// print 'and'
		System.out.println(T && F); 			// false

		// print 'or'
		System.out.println(T || F); 			// true

		// print 'not'
		System.out.println(!T);					// false

	}

}