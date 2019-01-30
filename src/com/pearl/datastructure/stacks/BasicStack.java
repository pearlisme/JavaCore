package com.pearl.datastructure.stacks;

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

    public static void main(String[] args) {

        BasicStack stack = new BasicStack();

        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}