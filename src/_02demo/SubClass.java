/**
 * 
 */
package _02demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class SubClass extends SuperClass {

	@Override
	public void publicMethod() {
		System.out.println("SubClass publicMethod()");
	}

	@Override
	protected void protectedMethod() {
		System.out.println("SubClass protectedMethod()");
	}

	@Override
	void defaultMethod() {
		System.out.println("SubClass defaultMethod()");
	}

	// @Override
	// private void privateMethod() {
		// System.out.println("SubClass privateMethod()");
	// } ERROR: Cannot reduce the visibility of
	// the inherited method
}