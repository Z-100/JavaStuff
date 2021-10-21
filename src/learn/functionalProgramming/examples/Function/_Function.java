package learn.functionalProgramming.examples.Function;

import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		System.out.println(quadraticFunction.apply(5));
	}

	/**
	 * A function has two parameters with the first being
	 * the input parameter and the second one being the
	 * return type / output
	 */
	private static Function<Integer, Integer> quadraticFunction =
			num -> num * num;
}
