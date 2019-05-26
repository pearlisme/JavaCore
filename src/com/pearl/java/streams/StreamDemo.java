package com.pearl.java.streams;

import com.pearl.java.common.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("muel",30));
        personList.add(new Person("mynthe",80));
        personList.add(new Person("muellender",70));
        personList.add(new Person("myzda",50));


        doSequencialStream(personList);
//        doParallelStream(personList);
//        doStreamMap(personList);

    }

    private static void doStreamMap(List<Person> personList) {
        int sumOfAge = personList.stream()
                .mapToInt(t -> t.getAge())
                .sum();

        System.out.println("Sum of all ages --->"+sumOfAge);

        OptionalDouble list = personList.stream()
                                    .mapToDouble(t -> t.getAge())
                                    .average();
        System.out.println("Optional Double "+ list);
    }

    private static void doParallelStream(List<Person> personList) {

        System.out.println("Implementation by stream(): ");

        personList.stream()
                .parallel()
                .forEach(t -> System.out.println(t.getName()));

        System.out.println("Implementation by parellelStream(): ");

        personList.parallelStream()
                .forEach(System.out::println);
    }

    private static void doSequencialStream(List<Person> personList) {

        Predicate<Person> predicate = t -> t.getAge() > 60;

        System.out.println("Sequencial Stream: ");
        personList.stream()
                .filter(predicate)
                .map((t) -> {
                    return t.getName() + " : Eligible for Pension";
                })
                .forEach(System.out::println);
                //                .forEach(t -> System.out.println(t.getName() +" is ("+ t.getAge()+ ") years old"));

        System.out.println("Sequencial Stream by Arrays");

        Stream.of(personList)
                .forEach(System.out::println);
    }
}
