package com.pearl.java.generics;

import org.junit.Assert;
import org.junit.Test;

public class SortedPairsTest {

    @Test
    public void shouldReturnOrderOfOrderedPair(){
        SortedPairs<Integer> pair =  new SortedPairs<>(1,2);

        Assert.assertEquals(1,pair.getFirst().intValue());
        Assert.assertEquals(2,pair.getSecond().intValue());

    }


    @Test
    public void shouldFlipOrderOfMisorderedPair(){
        SortedPairs<Integer> pair =  new SortedPairs<>(2,1);

        Assert.assertEquals(1,pair.getFirst().intValue());
        Assert.assertEquals(2,pair.getSecond().intValue());

    }

}
