package learn.functionalProgramming.examples.Supplier;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		System.out.println(getUrl.get());
	}

	/**
	 * A Supplier is a function, which has no input parameters
	 * and only exists to return information. (In this case a List)
	 */
	private static Supplier<List<String>> getUrl = ()
			-> List.of(
					"https://www.google.com",
					"http://www.notgoogle.to");
}
