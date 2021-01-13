package com.tts;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class LoopingWithNumbers {

    //get numbers from user
    public static ArrayList<Integer> getUserNumbers() {
        Scanner readInput = new Scanner(System.in);
        ArrayList<Integer> userNumbers = new ArrayList<>();

        //ask user for 5 numbers and store in list
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            userNumbers.add(readInput.nextInt());
        }
        return userNumbers;
    }

    //find the sum
    public static AtomicInteger findSum(ArrayList<Integer> theList) {

        AtomicInteger atomicSum = new AtomicInteger();
        theList.forEach( num -> atomicSum.addAndGet((Integer) num));

        return atomicSum;
    }

    //find the product
    public static int findProduct(ArrayList<Integer> theList) {

        int product = 1;
        for (Object num : theList) {
            product *= (Integer)num;
        }
        return product;
    }

    //find the largest
    public static int findLargest(ArrayList<Integer> theList) {

        int largest = -2000000000;
        for (Object num : theList) {
            if ((Integer)num > largest) {
                largest = (Integer)num;
            }
        }
        return largest;
    }

    //find the smallest
    public static int findSmallest(ArrayList theList) {

        int smallest = 2000000000;
        for (Object num : theList) {
            if ((int)num < smallest) {
                smallest = (int) num;
            }
        }
        return smallest;
    }

}//end LoopingWithNumbers class
