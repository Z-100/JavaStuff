package learn.lambda.examples;

public class LambdaSyntax {

	public String method() {
		return "Hello World";
	}


	// Same thing
	Lambda lambda = (s) -> System.out.println(s);
	Lambda lambdaWithMethodReference = System.out::println;

	interface Lambda {
		void method(String s);
	}
}