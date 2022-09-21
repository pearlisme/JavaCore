/*
package com.pearl.java.reference;

import com.pearl.java.common.Person;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public class PhantomReferenceD {

    public static void main(String[] args) {


        ReferenceQueue<Person> personReferenceQueue = new ReferenceQueue<>();

        ArrayList<FinalizePerson>  finalizePeople = new ArrayList<>();

        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {

            Person p = new Person("name:"+i,i);
            people.add(p);
            finalizePeople.add(new FinalizePerson(p,personReferenceQueue));
        }

        people = null;

        System.gc();

        for (FinalizePerson person : finalizePeople) {
            System.out.println(person.isEnqueued());
        }

        Reference<? extends  Person> reference;
        while((reference = personReferenceQueue.poll()) != null){

            ((FinalizePerson)reference).cleanUp();

        }
    }
}

class FinalizePerson extends PhantomReference<Person>{

    */
/**
     * Creates a new phantom reference that refers to the given object and
     * is registered with the given queue.
     *
     * <p> It is possible to create a phantom reference with a <tt>null</tt>
     * queue, but such a reference is completely useless: Its <tt>get</tt>
     * method will always return null and, since it does not have a queue, it
     * will never be enqueued.
     *
     * @param referent the object the new phantom reference will refer to
     * @param q        the queue with which the reference is to be registered,
     *//*

    public FinalizePerson(Person referent, ReferenceQueue<? super Person> q) {
        super(referent, q);
    }


    public void cleanUp() {
        System.out.println("System is in cleaning the resources...");
    }
}*/
