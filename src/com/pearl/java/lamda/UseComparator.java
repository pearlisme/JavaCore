package com.pearl.java.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

		Comparator<String> comp = (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		};

		Collections.sort(strings);
		System.out.println("Sort w/ case: "+ strings );

		Collections.sort(strings,comp);
		System.out.println("Sort w/o case: "+ strings );


	}

}
