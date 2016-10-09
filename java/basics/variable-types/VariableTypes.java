/******************************************
 *  Compilation:  javac VariableTypes.java
 *  Execution:    java VariableTypes
 *
 *  Prints various variable types.
 *
 ******************************************/

import java.lang.*;

public class VariableTypes {

	public static void main(String[] args) {
		// declare and initialise x, y, and z as 'int'
		int x = 6, y = 8, z = 10;

		// declare and initialise a and b as 'String' and 'char'
		String a = "Michael";
		char b = 'm';

		// declare and initialise B and d as 'byte' and 'double'
		byte B = 22;
		double d = 3.14159;

		// declare and reference r to x
		int r = x;

		// print x, y, and z
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);

		// print a and b
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		// print B and d
		System.out.println("B: " + B);
		System.out.println("d: " + d);

		// print r
		System.out.println("r: " + r);
	}

}