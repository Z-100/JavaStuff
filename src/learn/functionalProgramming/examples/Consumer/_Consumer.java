package learn.functionalProgramming.examples.Consumer;

import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		Customer maria = new Customer("Maria", "9999");

		greetCustomer.accept(maria);
	}

	/**
	 * A consumer is a functional interface to consume.
	 * That means, it has nothing to return and therefore
	 * only has (an) input parameter(s)
	 */
	private static final Consumer<Customer> greetCustomer = customer -> {
		System.out.println(String.format("Hello %s! Thanks for registering %s",
				customer.getName(), customer.getPhone()));
	};
}
