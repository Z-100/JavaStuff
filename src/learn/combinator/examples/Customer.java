package learn.combinator.examples;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Customer {

	private final String name;
	private final String email;
	private final String phone;
	private final LocalDate dob;

	public Customer(String name, String email, String phone, LocalDate dob) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}
}
