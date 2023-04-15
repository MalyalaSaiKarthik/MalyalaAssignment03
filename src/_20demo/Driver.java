/**
 * 
 */
package _20demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			// execute some code
		});

		System.out.println(t.getState()); // prints NEW

		t.start();

		System.out.println(t.getState()); // prints RUNNABLE

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(t.getState()); // prints TIMED_WAITING

		synchronized (t) {
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(t.getState()); // prints BLOCKED

		t.interrupt();

		System.out.println(t.getState()); // prints TERMINATED

	}

}
