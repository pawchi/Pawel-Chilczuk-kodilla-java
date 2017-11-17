package com.kodilla.testing.collection;
import java.util.ArrayList;
class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> numbersEven = new ArrayList<Integer>();

       for (int n = 0; n < numbers.size(); n++) {
            if (numbers.get(n) % 2 == 0) {
                numbersEven.add(numbers.get(n));
            }
        }
        return numbersEven;
    }
}