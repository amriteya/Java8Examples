package jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java 8 concepts practical examples. Refer to :
 * http://winterbe.com/posts/2014/03/16/java-8-tutorial/ for concepts related to
 * the examples
 * 
 * 
 * Note : Use JDK1.8 to run these examples.
 * 
 * 
 * @author amriteyapandey
 *
 */
public class Java8Tutorial {

	/*
	 * Printing a dashed line to separate examples in console output.
	 */
	public static void logicalSeparator() {
		System.out.println("--------------------------------------");
	}

	/**
	 * Example for lambda expression. Writing a comparator using lambda
	 * expressions.
	 */
	public static void lambdaExpressions() {

		List<String> names = Arrays.asList("peter", "ana", "mike", "xenia");

		System.out.println(names);

		logicalSeparator();

		/*
		 * Prior to Java 8 method of using comparator's compare method
		 */
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});

		System.out.println(names);

		logicalSeparator();

		/*
		 * Shortening the comparator example using Java8 concepts
		 * 
		 * Note: Sorting in reverse order to distinguish from above sorting.
		 * 
		 */
		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});

		System.out.println(names);

		logicalSeparator();

		/*
		 * There is no need to for return in Java8 examples There is no need of
		 * curly braces if the you've just one line of code. Same as in single
		 * line after if-else statements.
		 */
		Collections.sort(names, (String a, String b) -> a.compareTo(b));

		System.out.println(names);

		logicalSeparator();

		/*
		 * Java compiles is aware of the parameters types so you can skip them
		 * as well.
		 * 
		 * P.S.: This is cool!
		 */
		Collections.sort(names, (a, b) -> b.compareTo(a));

		System.out.println(names);

		logicalSeparator();

	}

	/**
	 * Example for functional interface. Functional interface defined as
	 * Converter interface.
	 * 
	 */
	public static void functionalInterface() {

		/*
		 * We are defining the action to be performed by the singleton abstract
		 * method in Converter.
		 */
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);

		Integer convertedInteger = converter.convert("123");

		System.out.println(convertedInteger);

		logicalSeparator();

	}

	/**
	 * Example of static method references.
	 * 
	 * Java8 allows a simpler way to access static method and pass them as
	 * references.
	 * 
	 * 
	 */
	public static void methodReferences() {

		/*
		 * We can short circuit valueOf static method of Integer wrapper class.
		 */
		Converter<String, Integer> converter = Integer::valueOf;

		Integer converted = converter.convert("123");

		System.out.println(converted);
	}

	public static void main(String[] args) {

		// Testing lambda expression in Java8
		lambdaExpressions();

		logicalSeparator();

		// Testing functional interfaces in Java8
		functionalInterface();

		logicalSeparator();

		// Testing Method References
		methodReferences();

	}

}
