package com.pearl.datastructure.stacks;

import java.util.Arrays;
import java.util.Objects;

public class BasicStack<X> {

    private X[] data;
    private int stackPointer;

    public BasicStack() {
        this(100);
    }

    public BasicStack(int size) {
        data = (X[]) new Object[size];
    }

    public void push(X i) {

        data[stackPointer++] = i;

    }

    public X pop() {

        if (stackPointer == 0) {
            throw new IllegalStateException("No more items on the stack");
        }
        return data[--stackPointer];
    }

    public boolean contains(X item) {

//        return Arrays.stream(data).anyMatch(datum -> datum == item);

        for (int i = 0; i < stackPointer; i++) {
            if (data[i]==item) {
                return true;
            }
        }
        return false;
    }

    public X access(X item) {

//        while (stackPointer > 0) {
//            for (X datum : data)
//                if (datum == item) {
//                    return datum;
//                }
//        }
//        return null;

        for (int i = 0; i < stackPointer; i++) {
            if (data[i]==item) {
                return item;
            }
        }
        return null;

    }

    public void showStack(){

        for (int i = 0; i < stackPointer; i++) {
            System.out.println(data[i]);
        }
//        Arrays.stream(data)
//                .filter(Objects::nonNull)
//                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        BasicStack stack = new BasicStack();

        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.showStack();
        System.out.println("stack.pop()"+stack.pop());
        stack.showStack();
        System.out.println("stack.pop()"+stack.pop());
        stack.showStack();
        System.out.println("stack.pop()"+stack.pop());
        stack.showStack();
        System.out.println("stack.contains(5)" + stack.contains(5));
        stack.showStack();
        System.out.println("stack.access(5) ==> " + stack.access(5));
        stack.showStack();
        System.out.println("stack.contains(1)" + stack.contains(1));
        stack.showStack();
        System.out.println("stack.access(1) ==> " + stack.access(1));

    }
}