package com.tts;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //numbers game
        ArrayList<Integer> numbersList = LoopingWithNumbers.getUserNumbers();
        System.out.println("your numbers: " + numbersList);

        System.out.println("sum: " + LoopingWithNumbers.findSum(numbersList));
        System.out.println("product: " + LoopingWithNumbers.findProduct(numbersList));
        System.out.println("largest: " + LoopingWithNumbers.findLargest(numbersList));
        System.out.println("smallest: " + LoopingWithNumbers.findSmallest(numbersList));

        //car game
        HashMap<String, String> carInventory = HashMappingCars.createCarInventory();
        HashMappingCars.communicateWithCarCustomer(carInventory);

    }

}//end Main class
