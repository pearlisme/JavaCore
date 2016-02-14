package com.pearl.Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<String>();
		
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
		strings.add("fff");

		Collections.sort(strings);
		System.out.println("Simple sort");
	}

}
