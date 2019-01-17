package com.pearl.java.reference;

import com.pearl.java.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReferenceQueueD {

    public static void main(String[] args) throws InterruptedException, IOException {

        Person person = new Person();

        ReferenceQueue<Person> referenceQueue = new ReferenceQueue<>();

        PersonCleaner cleaner = new PersonCleaner();

        PersonWeakReference weakReference = new PersonWeakReference(person,cleaner,referenceQueue);


        ExecutorService service = Executors.newSingleThreadExecutor();

        service.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    PersonWeakReference wr = (PersonWeakReference) referenceQueue.remove();
                    wr.clean();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        person = null;

        System.gc();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press any Key to continue...");

        br.readLine();

        service.shutdown();


    }
}

class PersonCleaner{

    public void clean() {
        System.out.println("System is cleaning up");
    }
}

class PersonWeakReference extends WeakReference<Person>{

    PersonCleaner personCleaner;

    public PersonWeakReference(Person referent, PersonCleaner cleaner,ReferenceQueue<? super Person> q) {
        super(referent, q);
        this.personCleaner = cleaner;
    }

    public void clean(){
        personCleaner.clean();
    }
}
