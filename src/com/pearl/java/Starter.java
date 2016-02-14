/**
 * 
 */
package com.pearl.java;

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
		// TODO Auto-generated method stub
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
