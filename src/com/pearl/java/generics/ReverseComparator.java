package com.pearl.java.generics;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T>{

    private final Comparator<T> delegateComparator;

    public ReverseComparator(final Comparator<T> delegateComparator){

        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(T left, T right) {
        return -1 * delegateComparator.compare(left, right);
    }
}
