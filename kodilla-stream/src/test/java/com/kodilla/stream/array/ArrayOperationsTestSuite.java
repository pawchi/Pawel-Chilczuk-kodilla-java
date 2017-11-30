package com.kodilla.stream.array;
import org.junit.Assert;
import org.junit.Test;
import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        int [] numbers = new int[10];
        for (int i=0; i<numbers.length;i++){
            numbers[i]= i+1;
        }
        int sum = 0;
        for (int n:numbers){
            sum = sum + n;
        }

        //When
        double expectedAverage = (double)sum/numbers.length;
        double testedAverage = getAverage(numbers);

        //Then
        Assert.assertEquals(expectedAverage,testedAverage,0);
    }
}
