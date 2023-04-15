/**
 * 
 */
package _03demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		SubClass1 subClass1 = new SubClass1();
		System.out.println(subClass1.getValue());
		
		SubClass2 subClass2 = new SubClass2();
		System.out.println(subClass2.getValue());
	}

}

class SuperClass {
    public Number getValue() {
        return 42;
    }
}

class SubClass1 extends SuperClass {
	@Override
    public Integer getValue() {
        return 42;
    }
}

class SubClass2 extends SuperClass {
	@Override
    public Double getValue() {
        return 42.0;
    }
}