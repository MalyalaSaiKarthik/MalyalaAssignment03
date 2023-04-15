/**
 * 
 */
package _18demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			// Do something
		});

		thread.start(); // Starts the thread

		// Try to start the thread again
		try {
			thread.start(); // Throws IllegalThreadStateException
		} catch (IllegalThreadStateException e) {
			// Handle the exception
			System.out.println(e);
		}

		// Create a new instance of the thread and start it
		Thread newThread = new Thread(() -> {
			// Do something
		});

		newThread.start(); // Starts the new thread

	}

}
