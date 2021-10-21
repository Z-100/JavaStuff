package learn.functionalProgramming.examples.Predicate;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		System.out.println(validPhoneNum.test("079 123 44 44"));
		System.out.println(validPhoneNum.test("076 123 45 67"));
	}

	/**
	 * Simply said, a Predicate is a comparator
	 *
	 * @return true or false
	 */
	private static Predicate<String> validPhoneNum = str -> str.contains("076");
}
