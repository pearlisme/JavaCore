package com.pearl.java.lamda;

import com.pearl.java.lamda.interfaces.SimpleInterface;

public class UseSimpleInterface {

	public UseSimpleInterface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SimpleInterface obj = () -> System.out.println("Say something");
		obj.doSomething();
	}

}
