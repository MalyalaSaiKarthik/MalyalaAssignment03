/**
 * 
 */
package _01demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box<String> stringBox = new Box<>("Hello, World!");
		System.out.println(stringBox.getContent());

		Box<Integer> intBox = new Box<>(42);
		System.out.println(intBox.getContent());
	}
}