package learn.functionalProgramming.examples.Function;

import java.util.function.BiFunction;

public class _BiFunction {

	public static void main(String[] args) {
		System.out.println(outputStringAndInt.apply(69, "The number entered was:"));
	}

	/**
	 * A function has two parameters with the first being
	 * the input parameter and the second one being the
	 * return type / output
	 */
	private static BiFunction<Integer, String, String> outputStringAndInt =
			(num, message) -> String.format("%s %d", message, num);
}
