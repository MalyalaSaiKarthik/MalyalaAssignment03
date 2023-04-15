/**
 * 
 */
package _17demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Iterator<String> iterator = list.iterator();

		// Fail-fast
		while (iterator.hasNext()) {
			String element = iterator.next();
			list.remove(element); // Throws ConcurrentModificationException
		}

		// Fail-safe
		List<String> copy = new ArrayList<>(list);
		iterator = copy.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			list.remove(element); // Safe, modifies the copy instead of the original list
		}

	}

}
