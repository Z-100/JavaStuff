package learn.lambda.examples;

public class TypeInference {

	/**
	 * @param s -> s.length() is the lambda given to the printLambda method
	 * @method printLambda
	 */
	public static void main(String[] args) {
		printLambda(s -> s.length());
	}

	/**
	 * method which required a lambda and calculates the length of a given string
	 */
	public static void printLambda(StringLenghthLambda l) {
		System.out.println(l.getLength("Hello Lambda"));
	}

	/**
	 * Interface for the lambda to work
	 * @getLength() is the call the lambda is doing
	 */
	interface StringLenghthLambda {
		int getLength(String s);
	}
}
