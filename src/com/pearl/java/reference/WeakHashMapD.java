//package com.pearl.java.reference;
//
//import com.pearl.java.Person;
//
//import java.util.Random;
//import java.util.WeakHashMap;
//
//public class WeakHashMapD {
//
//    public static void main(String[] args) {
//
//        Person liel = new Person();
//
//        WeakHashMap<Person,PersonMetaData> weakHashMap = new WeakHashMap<>();
//
//        weakHashMap.put(liel,new PersonMetaData());
//
//        PersonMetaData personMetaData = weakHashMap.get(liel);
//
//        System.out.println("personMetaData "+personMetaData);
//
//
//
//        if (new Random().nextBoolean()) {
//            System.out.println("Lost the Key somewhere");
//            liel = null;
//            System.gc();
//        }
//
//
//        if (weakHashMap.containsKey(liel)) {
//            System.out.println("Still contains Key");
//        }else {
//            System.out.println("Key gone");
//        }
//
//
//
//
//    }
//}
//
//class PersonMetaData{
//
//    String meta;
//
//    public PersonMetaData() {
//
//        meta = "This is an intel";
//    }
//
//    @Override
//    public String toString() {
//        return "PersonMetaData{" +
//                "meta='" + meta + '\'' +
//                '}';
//    }
//}
