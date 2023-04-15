/**
 * 
 */
package _14demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Not synchronized
		List<String> list = new ArrayList<>();

		// Synchronized
		List<String> synchronizedList = Collections.synchronizedList(list);
		synchronized (list) {
			// Access the list here
		}

		// Thread-safe by design
		List<String> copyOnWriteList = new CopyOnWriteArrayList<>();
	}

}
