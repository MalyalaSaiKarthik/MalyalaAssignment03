/**
 * 
 */
package _26demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class MySingleton {
	private static final MySingleton INSTANCE = new MySingleton();

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		return INSTANCE;
	}
}