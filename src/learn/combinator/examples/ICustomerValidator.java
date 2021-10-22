package learn.combinator.examples;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static learn.combinator.examples.ICustomerValidator.ValidationResult.*;


public interface ICustomerValidator
		extends Function<Customer, ICustomerValidator.ValidationResult> {

	static ICustomerValidator isEmailValid() {
		return customer -> customer.getEmail().contains("@") ?
				SUCCESS : EMAIL_INVALID;
	}

	static ICustomerValidator isPhoneValid() {
		return customer -> customer.getPhone().length() > 5 ?
				SUCCESS : PHONE_INVALID;
	}

	static ICustomerValidator isAdult() {
		return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ?
				SUCCESS : NOT_ADULT;
	}
	default ICustomerValidator and (ICustomerValidator other) {
		return customer -> {
			ValidationResult result = this.apply(customer);
			return result.equals(SUCCESS) ?
					other.apply(customer) : result;
		};
	}

	enum ValidationResult {
		SUCCESS, PHONE_INVALID, EMAIL_INVALID, NOT_ADULT
	}
}
