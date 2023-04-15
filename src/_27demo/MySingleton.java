/**
 * 
 */
package _27demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class MySingleton {
	private static MySingleton instance;

	private MySingleton() {
	}

	public static synchronized MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
}
