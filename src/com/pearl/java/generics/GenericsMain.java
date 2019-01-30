package com.pearl.java.generics;

import com.pearl.java.common.Person;

import java.util.*;

public class GenericsMain {

    public static void main(String[] args) {


        Person muthu = new Person("Muthu", 28);
        Person curler = new Person("Curler", 30);
        Person pearl = new Person("Pearl",25);

        doListProcessing(muthu, curler, pearl);

        doMapProcessing(muthu, curler, pearl);

        Class className;

    }

    private static void doListProcessing(Person muthu, Person curler, Person pearl) {
        List<Person> personList = new ArrayList<>();

        personList.add(muthu);
        personList.add(curler);
        personList.add(pearl);

        System.out.println(personList);

        Collections.sort(personList,new AgeComparator());
        System.out.println(personList);

        Collections.sort(personList,new ReverseComparator<>(new AgeComparator()));
        System.out.println(personList);
    }


    private static void doMapProcessing(Person muthu, Person curler, Person pearl) {


        Map<String, Person> madMen = new HashMap();

        madMen.put(muthu.getName(), muthu);
        madMen.put(pearl.getName(), pearl);
        madMen.put(curler.getName(), curler);

        for (Person p : madMen.values()) {
            System.out.println(p.getName() + " is " + p.getAge() + " years Old");
        }
    }
}
