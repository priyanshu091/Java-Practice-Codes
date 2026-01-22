package SetInterface.Assignment3;

import java.util.Set;

public class Test {

    public static void main(String[] args) {

        int[] arr1 = {1,2,42,123,431,1,32,12,32,22};
        int[] arr2 = {11,3,4,89,31,1,32,82,323,22};
        int[] arr3 = {2,32,4,12,4,2,124,2,3,4,5};


        Set<Integer> twoWay =
                FindCommonElementsSet.findBasicIntersection(arr1, arr2);

        System.out.println("Common in Array1 & Array2: " + twoWay);


        Set<Integer> threeWay =
                FindCommonElementsSet.threeWayIntersection(arr1, arr2, arr3);

        System.out.println("Common in all three: " + threeWay);


        FindCommonElementsSet.printArr(
                arr1, arr2, arr3,
                twoWay, threeWay
        );
    }
}
