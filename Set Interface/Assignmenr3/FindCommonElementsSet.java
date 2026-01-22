package SetInterface.Assignment3;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsSet {


public static Set<Integer> findBasicIntersection(int[] arr1,int[] arr2){

    Set<Integer> set1= new HashSet<>();

    for (Integer i : arr1) {
        set1.add(i);
    }
    Set<Integer> set2= new HashSet<>();
    for (Integer i : arr2) {
        set2.add(i);
    }

    set1.retainAll(set2);

return set1 ;
}
public static Set<Integer> threeWayIntersection(int[] arr1,int[] arr2, int[] arr3){

    if (arr1.length==0 || arr2.length==0 || arr3.length==0){

        System.out.println("One or More Arrays are Empty");

        return new HashSet<>();
    }

    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    Set<Integer> set3 = new HashSet<>();

    for (int i : arr1) {
        set1.add(i);
    }
    for (int i : arr2) {
        set2.add(i);
    }
    for (Integer i : arr3) {
        set3.add(i);
    }

    set1.retainAll(set2);
    set1.retainAll(set3);

    if (set1.isEmpty()){
        System.out.println("No Common element Found");
        return set1;
    }

    return set1;
}
public static void printArr(int[] arr1,int[] arr2, int[] arr3, Set<Integer> twoWayIntersection, Set<Integer> threeWayIntersection){

    System.out.println("Array 1 size:"+arr1.length);
    System.out.println("Array 2 size:"+arr2.length);
    System.out.println("Array 3 size:"+arr3.length);

    System.out.println("\nTwo-way intersection size (Array1 & Array2):"+twoWayIntersection.size() );
    System.out.println("Three-way intersection size (All three): " + threeWayIntersection.size());

    Set<Integer> allElements = new HashSet<>();
    for (int num : arr1) allElements.add(num);
    for (int num : arr2) allElements.add(num);
    for (int num : arr3) allElements.add(num);

    int totalUniqueElements = allElements.size();

    if (totalUniqueElements > 0) {
        double percentage = (threeWayIntersection.size() * 100.0) / totalUniqueElements;
        System.out.printf("Intersection percentage: %.2f%%\n", percentage);
    } else {
        System.out.println("Intersection percentage: 0.00%");
    }

    System.out.println("===============================\n");
}

}

    

