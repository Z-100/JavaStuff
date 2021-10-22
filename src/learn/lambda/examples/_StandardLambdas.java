package learn.lambda.examples;

import java.util.ArrayList;

public class _StandardLambdas {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("One");
		stringList.add("Two");
		stringList.add("Three");

		forEachLambda(stringList);
		removeIfLambda(stringList);
	}

	/**
	 * This lambda function is used to loop through the
	 * entire ArrayList.
	 * A method reference is used to print every item
	 *
	 * @param stringList The given ArrayList of strings
	 */
	private static void forEachLambda(ArrayList<String> stringList) {
		stringList.forEach(System.out::println);
	}

	/**
	 * This lambda function removes any item
	 * matching the given Predicate
	 *
	 * @param stringList The given ArrayList of strings
	 */
	private static void removeIfLambda(ArrayList<String> stringList) {
		System.out.println("After removeIf 'e' exists: ");
		stringList.removeIf(str -> str.contains("e"));
		forEachLambda(stringList);
	}
}
