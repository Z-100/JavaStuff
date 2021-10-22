package learn.optionals.examples;

import java.util.Optional;

public class _Optionals {

	public static void main(String[] args) {
		orElseOptionals();
		ifOptionals();
	}

	private static void orElseOptionals() {
		// * Sets the value of val to the given item,
		// * if it's not null. Else the value of val
		// * will be the given default Supplier
		Object val = Optional.ofNullable("Hello World!").orElseGet(() -> "Something went wrong!");
		// ? Printed val, while val has a value
		System.out.println(val);

		// * Example with the given parameter being null
		Object val2 = Optional.ofNullable(null).orElseGet(() -> "Something went wrong!");
		// ? Printed val, while val2 is null and therefore prints the orElseGet()
		System.out.println(val2);

		// * Throws an exception, with the exception
		// * being a supplier
		Object val3 = Optional.ofNullable(null).orElseThrow(() -> new IllegalStateException("Exception thrown"));
		// ? Tries to print the val, but throws exception while doing so
		System.out.println(val3);
	}

	private static void ifOptionals() {

		// * When the value is present (!= null)
		// * code inside ifPresent is being executed
		Optional.ofNullable("Hello World!").ifPresent(val -> {
			// ? Can insert logic in any of these functions
			System.out.println(val);
		});

		// * Checks if value is present
		// * If it is not null, the value gets printed with a Consumer
		// * If it is null, a runnable is being executed
		Optional.ofNullable(null)
				.ifPresentOrElse(System.out::println,
						() -> System.out.println("Value passed is null"));
	}
}
