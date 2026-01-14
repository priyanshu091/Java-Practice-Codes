package SetInterface.Assignment1;

import java.util.HashSet;
import java.util.Set;

public class BasicSetOperations {
    public static void main(String[] args) {


        Set<Integer> numSet = new HashSet<>();

        numSet.add(1);
        numSet.add(2);
        numSet.add(3);
        numSet.add(2);
        numSet.add(4);

        System.out.println("Set: " + numSet);

        System.out.println("Contains 3? " + numSet.contains(3));


        System.out.println("Size: " + numSet.size());



}}
