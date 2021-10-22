package learn.combinator.examples;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidationServiceOld {

	public boolean isValid(Customer customer) {
		return isEmailValid(customer.getEmail())
				&& isPhoneValid(customer.getPhone())
				&& isDobValid(customer.getDob())
				&& isNameValid(customer.getName());
	}

	private boolean isEmailValid(String email) {
		return email.contains("@");
	}

	private boolean isPhoneValid(String phone) {
		return phone.length() > 5;
	}

	private boolean isDobValid(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears() > 18;
	}

	private boolean isNameValid(String name) {
		return !name.contains("$");
	}
}
