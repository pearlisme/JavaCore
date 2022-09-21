//package com.pearl.java.reference;
//
//import com.pearl.java.Person;
//
//import java.lang.ref.WeakReference;
//
//public class WeakReferenceD {
//
//    public static void main(String[] args) {
//
//
//        Person person = new Person();
//
//        WeakReference<Person> wr = new WeakReference<Person>(person);
//
//        System.out.println("person"+person);
//
//        Person p1 = wr.get();
//        System.out.println("p1 "+p1);
//
//        p1= null;
//        person = null;
//
//        Person p2 = wr.get();
//        System.out.println("p2 "+p2);
//
//        p2 =null;
//        System.gc();
//
//        Person p3 = wr.get();
//        System.out.println("p3 "+p3);
//
//
//    }
//}
