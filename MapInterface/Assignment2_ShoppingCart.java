package MapInterface;/*
 * Assignment 2: Shopping Cart System
 * 
 * Objective: Practice put, remove, containsKey, get, getOrDefault
 * 
 * Instructions:
 * 1. Create a Map to store product names (String) as keys and quantities (Integer) as values
 * 2. Add 6 different products with their quantities to the cart
 * 3. Display all products using keySet()
 * 4. Remove 2 products from the cart
 * 5. Update the quantity of one existing product
 * 6. Use getOrDefault to safely get quantity of a product (existing and non-existing)
 * 7. Print the final cart status
 * 
 * Sample Output:
 * Cart Contents: [Apple, Banana, Milk, Bread, Eggs, Cheese]
 * Removed: Orange
 * Updated Milk quantity to 3
 * Quantity of Milk: 3
 * Quantity of Yogurt (not in cart): 0
 * Final cart size: 4 items
 */

import java.util.HashMap;
import java.util.Map;
public class Assignment2_ShoppingCart {
    public static void main(String[] args) {
        // Your code here

        //Created a Map
        Map<String,Integer> cart = new HashMap<>();

        //Adding Products
        cart.put("Apple",4);
        cart.put("Banana",6);
        cart.put("Eggs",3);
        cart.put("Cheese",1);
        cart.put("Milk",2);
        cart.put("Oats",5);

        //Display all Products
        System.out.println("Products in cart:"+cart.keySet());

        //Remove 2 Products
        cart.remove("Oats");
        cart.remove("Milk");

        //Update Quantity of Existing  product

        cart.put("Banana",4);
        System.out.println("Updated Banana Quantity");

        //Using getOrDefault() to get Quantity of Products

        //Product Which exist
        System.out.println("Quantity of Oats:"+cart.getOrDefault("Oats",0));


        //Product Which Does not exist

        System.out.println("Quantity of Chocolate:"+cart.getOrDefault("Chocolate",0));

        //Final cart status
        System.out.println("\n\nFinal cart size: " + cart.size() + " items\n\n");

        for (Map.Entry<String,Integer> product:cart.entrySet()) {

            System.out.println(product.getKey()+":"+product.getValue());
        }

        }
    }

