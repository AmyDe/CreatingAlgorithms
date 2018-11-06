package com.example.creatingalgorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class DuplicatesTest {

    private Duplicates newDupe;

    @Before
    public void setUp() {
        newDupe = new Duplicates();
    }

    @Test
//    public void testIntForBool() {
//        int[] myArr = {1, 5, 5};
//        Assert.assertThat(newDupe.isDupe(myArr), is(equalTo(true)));
//    }

    public void testStringForBool() {
        String[] myArr = {"Hello", "Amy", "Hello"};
        Assert.assertThat(newDupe.isDupe(myArr), is(equalTo(true)));
    }

}