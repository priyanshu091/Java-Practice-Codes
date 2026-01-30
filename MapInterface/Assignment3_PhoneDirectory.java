package MapInterface;/*
 * Assignment 3: Phone Directory
 *
 * Objective: Practice putIfAbsent, replace, values(), and iteration
 *
 * Instructions:
 * 1. Create a Map to store contact names (String) as keys and phone numbers (String) as values
 * 2. Add 5 contacts to the directory
 * 3. Try to add a duplicate contact using putIfAbsent (should not override)
 * 4. Try to add a new contact using putIfAbsent (should add successfully)
 * 5. Update a contact's phone number using replace
 * 6. Display all phone numbers using values()
 * 7. Try to replace a phone number for a non-existing contact
 *
 * Sample Output:
 * Directory created with 5 contacts
 * Tried to add duplicate John: null (not added)
 * Added new contact Sarah: +1-555-9999
 * Updated Bob's number from +1-555-2222 to +1-555-2223
 * All phone numbers: [+1-555-1111, +1-555-2223, +1-555-3333, ...]
 * Tried to update non-existing contact Mike: null
 * Final directory size: 6 contacts
 */

import java.util.HashMap;
import java.util.Map;

public class Assignment3_PhoneDirectory {
    public static void main(String[] args) {
        // Your code here
        Map<String,String> directory=new HashMap<>();

        //Adding Contacts
        directory.put("Shivam","+91-8723834328");
        directory.put("Aman","+91-9287224233");
        directory.put("Shivansh","+91-8294927243");
        directory.put("Rajat","+91-9232489234");

        //Adding Duplicate Contact using putIfAbsent
        addContact(directory,"Aman","91-9247234272");
        //Adding New Contact Using putIfAbsent
        addContact(directory,"Rahul","91-8237234212");

        //Replacing Contact number
        replaceContactNum(directory,"Shivam","+91-8237482283");

        //Display Contacts
        displayContacts(directory);

    }public static  void addContact(Map<String,String> directory,
                                            String name ,
                                            String conNum) {

        boolean added = directory.putIfAbsent(name, conNum) == null;
        System.out.println("\n ===Adding Contact===\n");
        if (added) {
            System.out.println("Successfully Added " + name+" with Contact Number:"+conNum);

        } else {
            System.out.println("Contact "+name+" Already Exist");

        }
        System.out.println("===");


    }public static void replaceContactNum(Map<String,String> directory,
                                          String name ,
                                          String conNum){
        System.out.println("\n ===Replacing Contact===\n");
        directory.replace(name,conNum);
        System.out.println("Replaced Contact Number of "+name+" with "+conNum);
        System.out.println("====");


    }
    public static void displayContacts(Map<String,String> directory){
        System.out.println("=== Displaying All Contacts===");
        for (Map.Entry<String,String> entry: directory.entrySet()) {
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
        System.out.println("====");
    }

}
