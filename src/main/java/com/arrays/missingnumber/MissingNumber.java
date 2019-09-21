package com.arrays.missingnumber;

public class MissingNumber {
    public static void main(String... args)
    {
        MissingNumberHelper helper = new MissingNumberHelper();
        helper.findMissingNumber(new int[]{ 1,2,3,4,5,6,8,9,10 });
    }
}
