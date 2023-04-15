/**
 * 
 */
package _12demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int x = 10;
		x = 20; // This will cause a compilation error because x is final

		try {
		    // some code that may throw an exception
		} catch (Exception e) {
		    // handle the exception
		} finally {
		    // this code will always be executed
		}
	}
	
	@Override
	 protected void finalize() throws Throwable {
	    // perform some cleanup here
	    super.finalize();
	 }

}
