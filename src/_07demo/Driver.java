/**
 * 
 */
package _07demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyClass myObject = new MyClass(10);
		System.out.println(myObject.getX());
	}

}

final class MyClass {
	private int x;

	final public MyClass(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}
}
