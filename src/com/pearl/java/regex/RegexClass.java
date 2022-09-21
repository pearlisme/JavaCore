package com.pearl.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(".s");

        Matcher matcher = pattern.matcher("as");

        boolean b = matcher.matches();

        System.out.println("Result : "+b);

        boolean as = Pattern.matches(".s", "as");

        System.out.println("as :"+ as);

        System.out.println(Pattern.matches("[ab]","ab"));
    }
}

