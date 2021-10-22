package learn.streams.examples;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static learn.streams.examples.Gender.*;

/**
 * Simply said, Java Streams require
 * functions from functional programming
 * as parameters
 */
public class _Stream {

	public static void main(String[] args) {
		List<Customer> customers = List.of(
				new Customer("Hans", "6969", MALE),
				new Customer("Maria", "775757", FEMALE),
				new Customer("Aurora", "69420", FEMALE),
				new Customer("Peter", "55055", OTHER)
		);
	}

	private static void mapStream(List<Customer> customers) {
		// * Creates a stream from the abstract class
		customers.stream()
				// * Converts the list to a map only containing the gender
				.map(customer -> customer.getGender()) // ? Replace with any getter
				// * Collects every item matching the Predicate,
				// * whilst also removing duplicates
				.collect(Collectors.toSet())
				// * Prints every item
				.forEach(System.out::println);
	}

	private static void mapToIntStream(List<Customer> customers) {
		// * Creates a stream from the abstract class
		customers.stream()
				// * Converts the list to a map only containing the name
				.map(customer -> customer.getName())
				// * Converts the previously listed names to an Integer
				// * value consisting of the length of the name
				.mapToInt(name -> name.length())
				// * Prints every item
				.forEach(System.out::println);
	}

	private static void matchFunctionStream(List<Customer> customers) {
		// * A Predicate, checking if the customers gender is female
		Predicate<Customer> customerPredicate = customer -> FEMALE.equals(customer.getGender());

		// * Extracts the created stream to a variable (ctrl + alt + v)
		boolean containsOnlyFemales = customers.stream()
				// * Loops through the list and checks if <every> item in the list
				// * matches the predicate and therefore returns a boolean
				.allMatch(customerPredicate)
				// ? Won't work, but this method returns true if any item matches
				.anyMatch(customerPredicate)
				// ? Won't work, but this method returns true if no item matches
				.noneMatch(customerPredicate);

		System.out.println(containsOnlyFemales);
	}

	private static void filterFunctionStream(List<Customer> customers) {
		// * Extracts the created stream to a variable (ctrl + alt + v)
		Set<Gender> genderList = customers.stream()
				// * Filters and removes (not from the actual list)
				// * every item not matching the Predicate
				.filter(customer -> customer.getName().length() > 4)
				// ? Already described
				.map(customer -> customer.getGender())
				// ? Already described
				.collect(Collectors.toSet());

		System.out.println(genderList);
	}
}
