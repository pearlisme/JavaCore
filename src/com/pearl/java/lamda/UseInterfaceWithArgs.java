package com.pearl.java.lamda;

import com.pearl.java.lamda.interfaces.InterfaceWithArgs;

public class UseInterfaceWithArgs {

	public UseInterfaceWithArgs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceWithArgs obj = (v1, v2) -> {

			int s = v1 * v2;
			System.out.println("the result is " + s);
		};

		obj.calculate(10, 5);
	}

}
