package learn.callbacks.examples;

import java.util.function.Consumer;

public class _Callback {

	public static void main(String[] args) {

		// * The last parameter is a function, which will be
		// * executed if it's being called in the helloWithFunction method
		helloWithFunction("John", null, value -> {
			System.out.println("Last name not provided for: " + value);
		});

		// * The last parameter is a runnable, which will be
		// * executed if it's being called in the helloWithRunnable method
		helloWithRunnable("John",
				null,
				() -> System.out.println("Last name not provided"));
	}

	/**
	 * Simple method using a Function as callback, if something happens
	 * that should not happen.
	 *
	 * @param fName First name
	 * @param lName null value
	 * @param callBack The given Consumer (described in main())
	 */
	private static void helloWithFunction(String fName, String lName, Consumer<String> callBack) {
		System.out.println(fName);
		if (lName != null)
			System.out.println(lName);
		else
			callBack.accept(fName);
	}

	/**
	 * Simple method using a runnable as callback, if something happens
	 * that should not happen.
	 *
	 * @param fName First name
	 * @param lName null value
	 * @param callBack The given Runnable (described in main())
	 */
	private static void helloWithRunnable(String fName, String lName, Runnable callBack) {
		System.out.println(fName);
		if (lName != null)
			System.out.println(lName);
		else
			callBack.run();
	}
}
