package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;

class Application {
        public static void main(String[] args){

            ArrayList<Integer> numbers = new ArrayList<Integer>();

            OddNumbersExterminator run = new OddNumbersExterminator();
            run.exterminate(numbers);
        }
}
