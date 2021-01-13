package com.tts;

import java.util.HashMap;
import java.util.Scanner;

public class HashMappingCars {

    public static HashMap<String, String> createCarInventory() {
        //create a hash map of vehicles <model is key, make is value>
        HashMap<String, String> myHashCars = new HashMap<>();
        myHashCars.put("MDX", "Acura");
        myHashCars.put("RDX", "Acura");
        myHashCars.put("XC60", "Volvo");
        myHashCars.put("SRX", "Cadillac");
        myHashCars.put("COROLLA", "Toyota");
        myHashCars.put("PRIUS", "Toyota");

        return myHashCars;
    }

    public static void communicateWithCarCustomer(HashMap<String, String> inventory) {
        //ask customer what car (model) they're looking for
        Scanner readInput = new Scanner(System.in);

        boolean found;
        System.out.println("\nHi, what kind of car are you looking for?");
        String model = readInput.next();

        do {
            model = model.toUpperCase();

            if(inventory.containsKey(model)) {
                found = true;
                String make = inventory.get(model);
                System.out.printf("\nOh, you're looking for a(n) %s? " +
                                "Our %s selection is on the next page...",
                        model, make);
            } else {
                found = false;
                System.out.printf("""

                        I'm sorry. We do not currently have any %s in our inventory. Please enter another model I can help you with.
                        """, model);
                model = readInput.next();
            }
        } while (!found);

        System.out.println("Thanks for stopping by!");
    }

}//HashMappingCars class
