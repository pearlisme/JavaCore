/**
 * 
 */
package com.pearl.java;

import com.pearl.java.Concurrent.DeadLock;

/**
 * @author pearl
 *
 */
public class Starter {

	/**
	 * 
	 */
	public Starter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DeadLock.execute();
//		processEmployee();

	}

	private static void processEmployee() {
		Employee e1 = new Employee(100, "hero", "MotoCorp");
		Employee e2 = new Employee(100, "honda", "MotoCorp");
		System.out.println(e1.compare(e1, e2));

		if (e1.equals(e2)) {
			System.out.println(e1);
		}

		if (e1.EmpId == e2.EmpId) {
			System.out.println("Same ID please change it...");
		}
		System.out.println(e1);
		System.out.println(e2);
	}

}
