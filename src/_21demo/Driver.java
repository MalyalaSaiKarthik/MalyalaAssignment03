package _21demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 */

/**
 * @author Sai Karthik Malyala
 *
 */
public class Driver implements Serializable {
	private String name;
	private int age;

	public Driver(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		try {
			// Serialization
			Driver Driver = new Driver("John", 30);
			FileOutputStream fileOut = new FileOutputStream("Driver.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(Driver);
			out.close();
			fileOut.close();

			// Deserialization
			FileInputStream fileIn = new FileInputStream("Driver.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Driver deserializedDriver = (Driver) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("Name: " + deserializedDriver.getName());
			System.out.println("Age: " + deserializedDriver.getAge());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
