package MapInterface;/*
 * Assignment 4: Word Frequency Counter
 * 
 * Objective: Practice entrySet(), iteration, putIfAbsent, and practical Map usage
 * 
 * Instructions:
 * 1. Create a String with multiple words (some repeated)
 * 2. Split the string into words
 * 3. Use a Map to count the frequency of each word
 * 4. Use putIfAbsent and replace to update counts
 * 5. Iterate through the map using entrySet() and display each word with its count
 * 6. Find and display the most frequent word
 * 7. Display total unique words
 * 
 * Sample Input String:
 * "java is fun java is powerful java is everywhere coding in java is amazing"
 * 
 * Sample Output:
 * Word Frequencies:
 * java: 4
 * is: 4
 * fun: 1
 * powerful: 1
 * everywhere: 1
 * coding: 1
 * in: 1
 * amazing: 1
 * 
 * Most frequent word: java (4 times)
 * Total unique words: 8
 */

import java.util.HashMap;
import java.util.Map;

public class Assignment4_WordFrequencyCounter {
    public static void main(String[] args) {

        String sentence = "java is fun java is powerful java is everywhere coding in java is amazing";

        System.out.println("Original sentence:");
        System.out.println(sentence);
        System.out.println("\n" + "=".repeat(50) + "\n");

        String words[] = sentence.split(" ");

        Map<String,Integer> wordCount = new HashMap<>();

        for (String word : words) {


            wordCount.putIfAbsent(word, 0);

            wordCount.replace(word, wordCount.get(word) + 1);
        }
            System.out.println("Word Frequencies:");
            System.out.println("-".repeat(30));

            for(Map.Entry<String,Integer> entry : wordCount.entrySet()){

                String wordKey=entry.getKey();
                Integer countValue = entry.getValue();

                System.out.println(wordKey + " : " + countValue);
            }

            System.out.println("\n" + "=".repeat(50) + "\n");


            // for most frequent word

            String mostFrequent = "";
            int maxCount = 0;

            for (Map.Entry<String,Integer> entry: wordCount.entrySet()){

                if (entry.getValue()>maxCount){
                    maxCount= entry.getValue();
                    mostFrequent= entry.getKey();

                }


            }
        System.out.println("Most frequent word: " + mostFrequent + " (" + maxCount + " times)");

        int uniqueWords= wordCount.size();
        System.out.println("Total Unique Words are :"+ uniqueWords);

        System.out.println("\n" + "=".repeat(50));
    }
        }


