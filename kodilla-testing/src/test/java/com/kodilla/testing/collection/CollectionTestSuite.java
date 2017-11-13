package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void beforeEmptyList() {
        System.out.println("Test OddNumbersExterminatorEmptyList: begin");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //When
        OddNumbersExterminator run = new OddNumbersExterminator();
        ArrayList<Integer> result= run.exterminate(numbers);
        //Then
        Assert.assertEquals(0,result.size());
    }
    @After
    public void afterEmptyList() {
        System.out.println("Test OddNumbersExterminatorEmptyList: END");
    }

    @Before
    public void beforeNormalList() {
        System.out.println("\nTest OddNumbersExterminatorNormalList: begin");
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> expectedOutput= new ArrayList<Integer>();
        expectedOutput.add(2);
        expectedOutput.add(4);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        //When
        OddNumbersExterminator run = new OddNumbersExterminator();
        ArrayList<Integer> result= run.exterminate(numbers);
        //Then
        Assert.assertEquals(expectedOutput,result);
    }
    @After
    public void afterNormalList() {
        System.out.println("\nTest OddNumbersExterminatorNormalList: END");
    }

}
