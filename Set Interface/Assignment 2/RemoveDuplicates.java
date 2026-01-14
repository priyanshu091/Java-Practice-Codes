package SetInterface.Assignment2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 2, 9, 5, 6, 8, 3};

        Set<Integer> arrSet=new HashSet<>();

        for (Integer i : arr) {
            arrSet.add(i);
        }

        for (Integer i : arrSet) {
            System.out.print(i+" ");
        }
    }
}
