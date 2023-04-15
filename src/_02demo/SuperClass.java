/**
 * 
 */
package _02demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class SuperClass {
	public void publicMethod() {
		System.out.println("SuperClass publicMethod()");
	}

	protected void protectedMethod() {
		System.out.println("SuperClass protectedMethod()");
	}

	void defaultMethod() {
		System.out.println("SuperClass defaultMethod()");
	}

	private void privateMethod() {
		System.out.println("SuperClass privateMethod()");
	}
}
