package AlgorythmsHandsOnExperience;

import org.apache.commons.lang3.ArrayUtils;

public class AllDataStructures {

    public static void main(String[] args) {

        // instance of a class AllDataStructures
        AllDataStructures allDataStructures = new AllDataStructures();

        // work with Array
        allDataStructures.array01Array();


    } // main

    /*=============================== Array ===================================================*/
    public int[] array01Array() {

        // create an object
        int[] arr01 = new int[10];

        // print out init size
        System.out.println("arr01.length: " + arr01.length);

        // populate Array
        for(int i = 0; i < arr01.length; i++) {
            arr01[i] = 10 + i + 1;
        }

        // print out current length
        System.out.println("arr01.length : " + arr01.length);

        // print out Array
        printArray(arr01);

        // remove element 11 as value
        arr01 = ArrayUtils.removeElement(arr01, 11);
        arr01 = ArrayUtils.removeElement(arr01, 15);

        // print out Array
        System.out.println("After removing elements with values 11 & 15:");
        printArray(arr01);

        // add elements onto taken places
        arr01[0] = 11;
        arr01[4] = 15;

        // print array after restore elements
        System.out.println("add elements onto taken places:");
        printArray(arr01);

        // check length arr01
        System.out.println("arr01.length: " + arr01.length);



        return arr01;
    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println('\n');
    }

}
