/******************************************
 *  Compilation:  javac WhileLoop.java
 *  Execution:    java WhileLoop
 *
 *  Counting to five using a while loop.
 *
 ******************************************/

public class WhileLoop {

	public static void main(String[] args) {
		int count = 1;

		// while loop for counting to 5
		while (count <= 5) {
			System.out.println("The count is: " + count);
			count++;
		}

		// print 'done!'
		System.out.println("Done!");
	}

}