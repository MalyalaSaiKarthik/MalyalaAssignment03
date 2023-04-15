/**
 * 
 */
package _05demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * In this example, the strings "Hello" and "world" are added to a StringBuffer
		 * and a StringBuilder object. We print the results after converting the objects
		 * to strings. As you can see, both StringBuffer and StringBuilder produce the
		 * same output.
		 * 
		 * In general, the individual needs of your application will determine whether
		 * to use a StringBuffer or a StringBuilder. Use StringBuffer if thread safety
		 * is necessary. Otherwise, use StringBuilder if efficiency is an issue.
		 */

		// using StringBuffer
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello");
		stringBuffer.append(" ");
		stringBuffer.append("world");
		String result1 = stringBuffer.toString();
		System.out.println("Result using StringBuffer: " + result1);

		// using StringBuilder
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		stringBuilder.append(" ");
		stringBuilder.append("world");
		String result2 = stringBuilder.toString();
		System.out.println("Result using StringBuilder: " + result2);
	}

}
