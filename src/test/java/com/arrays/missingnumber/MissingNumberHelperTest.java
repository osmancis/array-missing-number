package com.arrays.missingnumber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberHelperTest {

    @Test
    public void testMissingNumber()
    {
        MissingNumberHelper mnh = new MissingNumberHelper();
        Assert.assertEquals(3,mnh.findMissingNumber(new int[] {1,2,4}));
        Assert.assertEquals(4,mnh.findMissingNumber(new int[] {1,2,3,5}));
    }

}