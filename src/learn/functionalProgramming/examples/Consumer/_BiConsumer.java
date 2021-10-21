package learn.functionalProgramming.examples.Consumer;

import java.util.function.BiConsumer;

public class _BiConsumer {

	public static void main(String[] args) {
		Customer maria = new Customer("Maria", "9999");

		boolean showPhone = true;
		greetCustomer.accept(maria, showPhone);

		showPhone = false;
		greetCustomer.accept(maria, showPhone);
	}

	/**
	 * A BiConsumer simply accepts two instead of one single
	 * parameter to be (beware, joke ahead) 'consumed'.
	 *
	 * Else wise exactly the same as a consumer
	 */
	private static BiConsumer<Customer, Boolean> greetCustomer = (customer, showPhone) -> {
		System.out.println(String.format("Hello %s! Thanks for registering %s",
				customer.getName(), (showPhone ? customer.getPhone() : "****")));
	};
}
