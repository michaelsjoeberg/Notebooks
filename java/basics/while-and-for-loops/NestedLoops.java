/******************************************
 *  Compilation:  javac NestedLoops.java
 *  Execution:    java NestedLoops
 *
 *  Finding primes using nested loops.
 *
 ******************************************/

public class NestedLoops {

	public static void main(String[] args) {
		int current = 1;

		// while 'current' is less than 20
		while (current <= 20) {
			
			// declare 'base' as 2
			int base = 2;

			// while 'base' is less than or equal to 'current' divided by 'base'
			while (base <= (current / base)) {

				// break if 'current' is not divisable by 'base'
				if (current % base == 0) {
					break;
				}

				// iterate 'base'
				base++;
			}

			// print 'current' if 'base' is greater than 'current' divided by 'base'
			if (base > current / base) {
				System.out.println(current + " is prime");
			}

			// iterate 'current'
			current++;

		}

		// print 'done!'
		System.out.println("Done!");
	}

}