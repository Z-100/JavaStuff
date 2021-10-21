package learn.functionalProgramming.examples.Predicate;

import java.util.function.BiPredicate;

public class _BiPredicate {

	public static void main(String[] args) {
		System.out.println(isTheSame.test("5", 5));
		System.out.println(isTheSame.test("4", 5));
	}

	/**
	 * A BiPredicate is the same thing as a Predicate,
	 * with the difference being, that this interface
	 * accepts two parameters.
	 *
	 * @return true or false
	 */
	private static BiPredicate<String, Integer> isTheSame = (str, num) -> str.equals(num.toString());
}
