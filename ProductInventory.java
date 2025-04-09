package LabExperiment_9;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Adding products
        inventory.put(101, 50); // Product ID 101 with quantity 50
        inventory.put(102, 30); // Product ID 102 with quantity 30
        inventory.put(103, 20); // Product ID 103 with quantity 20

        // Updating quantity of product ID 102
        inventory.put(102, 25); // Updated quantity to 25

        // Removing product ID 103
        inventory.remove(103); // Product ID 103 removed

        // Displaying final inventory
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
