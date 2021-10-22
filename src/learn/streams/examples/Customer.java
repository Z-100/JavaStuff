package learn.streams.examples;

import lombok.Getter;

@Getter
public class Customer {

	private final String name;
	private final String phone;
	private final Gender gender;

	public Customer(String name, String phone, Gender gender) {
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}
}

