/******************************************************
 *
 *  Compute logical operations.
 *
 *  Author 			: Michael Sjoeberg (github.com/mqe)
 *
 *  Date 			: 13 July 2017
 *  Updated 		: 13 July 2017 (Michael Sjoeberg)
 * 
 *  Compilation 	: javac LogicalOperators.java
 *  Execution 		: java LogicalOperators
 *
 ******************************************************/

public class LogicalOperators {

	public static void main(String[] args) {

		// print credits
		System.out.println(
			"---------------------------------------------------\n" +
			"Program   : Logical Operators\n" +
			"Author    : Michael Sjoeberg (github.com/mqe)\n" +
			"Date      : 13 July 2017\n" +
			"Updated   : 13 July 2017 (Michael Sjoeberg)\n" +
			"---------------------------------------------------\n");
		
		// example variables
		int A = 3;
		int B = 5;
		boolean T = true;
		boolean F = false;

		// print example variables
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("T = " + T);
		System.out.println("F = " + F);
		System.out.println(" ");

		/**
		 * Equal
		 */
		System.out.println("Equal:");
		System.out.println("(A == B) -> " + (A == B));
		System.out.println("(A == A) -> " + (A == A));
		System.out.println(" ");

		/**
		 * Not equal
		 */
		System.out.println("Not equal:");
		System.out.println("(A != B) -> " + (A != B));
		System.out.println("(A != A) -> " + (A != A));
		System.out.println(" ");

		/**
		 * Greater than
		 */
		System.out.println("Greater than:");
		System.out.println("(A > B) -> " + (A > B));
		System.out.println("(B > A) -> " + (B > A));
		System.out.println(" ");

		/**
		 * Less than
		 */
		System.out.println("Less than:");
		System.out.println("(A < B) -> " + (A < B));
		System.out.println("(B < A) -> " + (B < A));
		System.out.println(" "); 			

		/**
		 * Greater/ less than or equal
		 */
		System.out.println("Greater/ less than or equal:");
		System.out.println("(A >= B) -> " + (A >= B));
		System.out.println("(A <= A) -> " + (A <= A));
		System.out.println(" ");		

		/**
		 * And, or, not
		 */
		System.out.println("And, or, not");
		System.out.println("(T && F) -> " + (T && F));
		System.out.println("(T || F) -> " + (T || F));
		System.out.println("!T -> " + !T);
		System.out.println(" ");						
	}

}