/**
 * 
 */
package _19demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable);
		thread1.start();
	}

}

//Method 1: Extend Thread class
class MyThread extends Thread {
	@Override
	public void run() {
		// Do something
	}
}

// Method 2: Implement Runnable interface
class MyRunnable implements Runnable {
	@Override
	public void run() {
		// Do something
	}
}