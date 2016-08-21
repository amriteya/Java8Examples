package jdk8;

/**
 * 
 * An interface defined as functional interface can have exactly one abstract
 * method. It can have any number of default methods.
 * 
 * Note: You can remove the @FunctionalInterface annotation.
 *
 * @author amriteyapandey
 *
 * @param <F>
 * @param <T>
 */
@FunctionalInterface
public interface Converter<F, T> {

	/**
	 * Abstract method. Ideally responsible for taking an input of some type F
	 * and return output by converting it to some type T.
	 * 
	 * @param from
	 * @return
	 */
	T convert(F from);
}
