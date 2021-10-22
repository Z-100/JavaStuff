package learn.combinator.examples;

import java.time.LocalDate;

import static learn.combinator.examples.ICustomerValidator.*;

public class _Combinator {

	public static void main(String[] args) {
		Customer customer = new Customer(
				"Alice",
				"alice@gamil.com",
				"079696969",
				LocalDate.of(2020, 1, 1));

		combinatorPattern(customer);
	}

	private static void customerValidationServiceOld(Customer customer) {
		CustomerValidationServiceOld cvso = new CustomerValidationServiceOld();
		System.out.println(cvso.isValid(customer));
	}

	private static void combinatorPattern(Customer customer) {

		// * None of the interfaces code is being executed
		// * until .apply() is being executed
		ValidationResult result = isEmailValid()
				.and(isAdult())
				.and(isPhoneValid())
				.apply(customer);

		System.out.println(result);
	}
}
