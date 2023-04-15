package _15demo;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 
 */

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Hashtable is synchronized.
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put("apple", 1);
		hashtable.put("banana", 2);
		hashtable.put("orange", 3);

		// HashMap is not synchronized.
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("apple", 1);
		hashMap.put("banana", 2);
		hashMap.put("orange", 3);

	}

}
