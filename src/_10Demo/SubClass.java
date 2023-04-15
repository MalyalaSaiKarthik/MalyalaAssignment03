/**
 * 
 */
package _10Demo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Sai Karthik Malyala
 *
 */
public class SubClass extends SuperClass {

	// OK: Same throws clause
	@Override
	public void doSomething() throws IOException {
		throw new IOException();
	}

	// OK: Super throws clause
	@Override
	public void doSomething() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	// ERROR: Wider throws clause
	// @Override
	// public void doSomething() throws Exception { }
}
