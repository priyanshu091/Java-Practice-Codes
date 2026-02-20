package Enums;/*
 * Assignment 2: Coffee Shop Order System
 *
 * Objective: Learn enum with fields, constructors, getter methods, and combining multiple enums
 *
 * Instructions:
 * 1. Create an enum called CoffeeSize with constants: SMALL, MEDIUM, LARGE, EXTRA_LARGE
 * 2. Add two private instance variables to CoffeeSize enum:
 *    - int price
 *    - int volumeInMl
 * 3. Create a private constructor for CoffeeSize that takes price and volumeInMl as parameters
 * 4. Initialize each CoffeeSize constant with values:
 *    - SMALL: price=100, volume=250ml
 *    - MEDIUM: price=150, volume=350ml
 *    - LARGE: price=200, volume=450ml
 *    - EXTRA_LARGE: price=250, volume=550ml
 * 5. Add public getter methods: getPrice() and getVolumeInMl()
 * 6. Add a method getDescription() that returns a formatted string like "SMALL - ₹100 (250ml)"
 * 7. Create another enum called CoffeeType with constants: ESPRESSO, LATTE, CAPPUCCINO, AMERICANO, MOCHA
 * 8. Add a private instance variable to CoffeeType:
 *    - double priceMultiplier
 * 9. Create a private constructor for CoffeeType that takes priceMultiplier as parameter
 * 10. Initialize each CoffeeType constant with multiplier values:
 *     - ESPRESSO: 1.0
 *     - LATTE: 1.2
 *     - CAPPUCCINO: 1.3
 *     - AMERICANO: 1.1
 *     - MOCHA: 1.5
 * 11. Add getter method: getPriceMultiplier()
 * 12. Create a static method calculateOrderPrice(CoffeeSize size, CoffeeType type) that returns double
 *     - Formula: size.getPrice() * type.getPriceMultiplier()
 * 13. Create a static method displayOrder(CoffeeSize size, CoffeeType type) that prints order details
 * 14. In main method, display all available sizes and types
 * 15. Create and display at least 4 different coffee orders with their final prices
 *
 * Sample Output:
 * Available Coffee Sizes:
 * SMALL - ₹100 (250ml)
 * MEDIUM - ₹150 (350ml)
 * LARGE - ₹200 (450ml)
 * EXTRA_LARGE - ₹250 (550ml)
 * 
 * Available Coffee Types:
 * ESPRESSO (multiplier: 1.0x)
 * LATTE (multiplier: 1.2x)
 * CAPPUCCINO (multiplier: 1.3x)
 * AMERICANO (multiplier: 1.1x)
 * MOCHA (multiplier: 1.5x)
 * 
 * Order Examples:
 * MEDIUM LATTE: ₹180.0 (350ml)
 * LARGE CAPPUCCINO: ₹260.0 (450ml)
 * SMALL ESPRESSO: ₹100.0 (250ml)
 * EXTRA_LARGE MOCHA: ₹375.0 (550ml)
 */

public class Assignment2_CoffeeShop {
    
    // TODO: Define the CoffeeSize enum here
    //       - Add private fields: int price, int volumeInMl
    //       - Create private constructor: CoffeeSize(int price, int volumeInMl)
    //       - Define constants with values: SMALL(100, 250), MEDIUM(150, 350), etc.
    //       - Add getter methods: getPrice() and getVolumeInMl()
    //       - Add getDescription() method that returns formatted string
    enum CoffeeSize {

        SMALL(100, 250),
        MEDIUM(150, 350),
        LARGE(200, 450),
        EXTRA_LARGE(250, 550);

        private int price;
        private int volumeInMl;

        public int getPrice() {
            return price;
        }

        public int getVolumeInMl() {
            return volumeInMl;
        }

        private CoffeeSize(int price, int volumeInMl) {
            this.price = price;
            this.volumeInMl = volumeInMl;
        }

        public String getDescription() {
            return this.name() + " - ₹" + price + " (" + volumeInMl + "ml)";
        }
    }
    // TODO: Define the CoffeeType enum here
    //       - Add private field: double priceMultiplier
    //       - Create private constructor: CoffeeType(double priceMultiplier)
    //       - Define constants: ESPRESSO(1.0), LATTE(1.2), CAPPUCCINO(1.3), etc.
    //       - Add getter method: getPriceMultiplier()
enum CoffeeType{
        ESPRESSO(1.0),
        LATTE(1.2),
        CAPPUCCINO(1.3),
        AMERICANO(1.1),
        MOCHA(1.5);


        private double priceMultiplier;
        
        private CoffeeType(double priceMultiplier){
            this.priceMultiplier=priceMultiplier;
        }

        public double getPriceMultiplier() {
            return priceMultiplier;
        }
    }



    
    
    // TODO: Create static method calculateOrderPrice(CoffeeSize size, CoffeeType type)
    //       Calculate: size.getPrice() * type.getPriceMultiplier()
    //       Return the result as double
    // ─── HELPER METHOD 1 ─────────────────────────────────────────────────────
    // Takes a size and type, applies the multiplier to the base price
    // e.g. MEDIUM(150) * LATTE(1.2) = 180.0

    public static double calculateOrderPrice(CoffeeSize size, CoffeeType type){

        return size.getPrice()*type.getPriceMultiplier();
    }
    
    // TODO: Create static method displayOrder(CoffeeSize size, CoffeeType type)
    //       Print the order in format: "MEDIUM LATTE: ₹180.0 (350ml)"
    //       Use calculateOrderPrice() to get the final price
    // ─── HELPER METHOD 2 ─────────────────────────────────────────────────────
    // Prints one complete order line using the two enums

    public static void displayOrder(CoffeeSize size, CoffeeType type){

        final double price = calculateOrderPrice(size,type);

        System.out.println(size+ " "+type+": "+price+"Rs"+"("+size.getVolumeInMl()+"ml)");
    }


    public static void main(String[] args) {
        
        // TODO: Print header "Available Coffee Sizes:"
        System.out.println("Available Coffee Sizes: ");
        // TODO: Loop through all CoffeeSize values using CoffeeSize.values()
        //       For each size, print its getDescription()
        for (CoffeeSize size : CoffeeSize.values()) {

            System.out.println(size.getDescription());
        }
        
        // TODO: Print header "\nAvailable Coffee Types:"

        System.out.println("\nAvailable Coffee Types:");

        // TODO: Loop through all CoffeeType values using CoffeeType.values()
        //       For each type, print: "TYPE_NAME (multiplier: Xx)"
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type.name() + " (multiplier: " + type.getPriceMultiplier() + "x)");
        }
        
        // TODO: Print header "\nOrder Examples:"

        System.out.println("\nOrder Examples:");
        // TODO: Create and display order 1: MEDIUM LATTE

        displayOrder(CoffeeSize.MEDIUM, CoffeeType.LATTE);
        // TODO: Create and display order 2: LARGE CAPPUCCINO
        displayOrder(CoffeeSize.LARGE, CoffeeType.CAPPUCCINO);
        // TODO: Create and display order 3: SMALL ESPRESSO
        displayOrder(CoffeeSize.SMALL, CoffeeType.ESPRESSO);
        // TODO: Create and display order 4: EXTRA_LARGE MOCHA
        displayOrder(CoffeeSize.EXTRA_LARGE, CoffeeType.MOCHA);
    }
}
        


        

        

        

        

