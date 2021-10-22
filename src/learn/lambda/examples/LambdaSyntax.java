package learn.lambda.examples;

public class LambdaSyntax {

	public static void main(String[] args) {
		System.out.println(method("Hello World"));

		lambda.method("Hello World");

		lambdaWithMethodReference.method("Hello World");
	}

	// ? Imperative way
	private static String method(String s) {
		return s;
	}
	// ? Lambda
	private static Lambda lambda = (s) -> System.out.println(s);
	// ? Cooler lambda
	private static Lambda lambdaWithMethodReference = System.out::println;

	// ? Interface used by the lambda
	interface Lambda {
		void method(String s);
	}
}