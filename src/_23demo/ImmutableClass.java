/**
 * 
 */
package _23demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class ImmutableClass {
	private final int value;

	public ImmutableClass(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
