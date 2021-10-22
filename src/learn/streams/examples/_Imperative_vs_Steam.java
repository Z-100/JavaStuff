package learn.streams.examples;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

public class _Imperative_vs_Steam {

	private static void mapToIntStreamMethodReferences(List<Customer> customers) {
		// ? This is the 4-line-stream-clean-code-way
		// ? with method references

		customers.stream()
				.map(Customer::getName)
				.mapToInt(String::length)
				.forEach(System.out::println);
	}

	private static void mapToIntStream(List<Customer> customers) {
		// ? This is the 4-line-stream-clean-code-way

		customers.stream()
				.map(customer -> customer.getName())
				.mapToInt(name -> name.length())
				.forEach(length -> System.out.println(length));
	}

	private static void mapToIntStreamDetailed(List<Customer> customers) {
		// ? This is the stream way, but with the required parameters
		// ? being replaced by their functional interface

		// * Function having a Customer as a parameter and returning a String
		Function<Customer, String> customerStringFunction = customer -> customer.getName();

		// * Function taking a String and outputting it as an Integer
		// * <String, Integer> not needed, as function does that by default
		ToIntFunction<String> stringToIntFunction = name -> name.length();

		// * Takes an integer and prints it
		IntConsumer println = length -> System.out.println(length);

		// * Same stream as mapToIntStream()
		customers.stream()
				.map(customerStringFunction)
				.mapToInt(stringToIntFunction)
				.forEach(println);
	}

	private static void imperativeWay(List<Customer> customers) {
		// ? This is the longer and ugly looking way
		// ? of performing this action

		for (Customer customer : customers) {
			String name = customer.getName();
			Integer nameLength = name.length();
			System.out.println(nameLength);
		}
	}
}
