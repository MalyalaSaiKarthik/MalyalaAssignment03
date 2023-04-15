/**
 * 
 */
package _06demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello, World!"; // Immutable
		str = str + " Goodbye!"; // A new string object is created

		StringBuilder sb = new StringBuilder("Hello, World!"); // Mutable
		sb.append(" Goodbye!"); // Contents modified in-place
	}
	
}
