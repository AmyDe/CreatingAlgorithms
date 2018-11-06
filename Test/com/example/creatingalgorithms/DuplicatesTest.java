package com.example.creatingalgorithms;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class DuplicatesTest {

    @Test
    public void testOneDupeFound() {
        Duplicates newDupe = new Duplicates();
        int[] myArr = {1, 5, 5};
        Assert.assertThat(newDupe.isDupe(myArr), is(equalTo(true)));
    }

}