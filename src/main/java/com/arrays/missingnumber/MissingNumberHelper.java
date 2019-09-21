package com.arrays.missingnumber;

public class MissingNumberHelper {
    public int findMissingNumber(int[] numArray)
    {
        int total=0;
        //calculate total of all numbers
        for(int i:numArray)
        {
            total+=i;
        }

        //calculate expected sum of all numbers
        int n=numArray.length+1;
        int expectedResult = (n*(n+1))/2;
        System.out.println("Missing number is : "+ (expectedResult-total));
        return (expectedResult-total);

    }
}
