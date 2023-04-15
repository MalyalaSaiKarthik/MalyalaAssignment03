/**
 * 
 */
package _13demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Vector is synchronized.
		Vector<String> vector = new Vector<String>();
		vector.add("apple");
		vector.add("banana");
		vector.add("orange");

		// ArrayList is not synchronized by default.
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("apple");
		arrayList.add("banana");
		arrayList.add("orange");

		// ArrayList thread-safe by using the Collections.synchronizedList() method.
		List<String> synchronizedList = Collections.synchronizedList(new ArrayList<String>());

	}
}
