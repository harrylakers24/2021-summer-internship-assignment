package com.company;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        int[] testArray = {2, 4, 5, 1, 3, 5, 4, 3, 3, 4, 2, 4, 2, 5, 1, 1, 5};
        int[] testArray2 = {3, 12, 15, 15, 15, 12, 3, 3, 2};
        int targetSum = 6;
// Expected pairs are (to be printed on the console):
// (2, 4)
// (1, 5)

        findPairs(testArray, targetSum);

        reconcileHelper(testArray, testArray2);
    }




    /*
    Algorithm
    1. Initialize a Hashmap
    2. Loop through all values within the array (bounded by testArray.length)
        a. Calculate the value (need) that is needed to add to the current array value in iteration i
        b. if the hashmap contains the value (need), and doesn't already contain the current array value(check for duplicate), print out the pair of values
        c. the value of the array will be added to the hashmap
        d. increment i

    Time complexity and space complexity are both O(n)
    */

    static void findPairs(int[] testArray, int targetSum) {
        Map<Integer, Integer> table = new HashMap<>();

        for (int i = 0; i < testArray.length; i++) {

            int need = targetSum - testArray[i];


            if (table.containsKey(need) && !(table.containsKey(testArray[i]))) {
                System.out.print("(" + need + "," + testArray[i] + ")");
                System.out.print("\n");

            }


            table.put(testArray[i], i);


        }



    }


    /*
    Algorithm
    1. Initialize a Hashmap (prevent duplicates)
    2. Loop through all values within the array a(bounded by a.length)
        a. check that array b does not contain the current value of array a[k] and hashmap does not contain the current a[k] value (check for duplicate)
        b. if true, print out the number since it isn't in the other array
        c. the value of array a a[k] will be added to the hashmap
        d. iterate k
    3. repeat step 1 and 2 for array b

    Time complexity and space complexity are both O(n)
    */

    static void reconcileHelper(int[] a, int[] b) {


        System.out.print("Numbers in array a that aren't in array b:");
        Map<Integer, Integer> table = new HashMap<>();
        for (int k = 0; k < a.length; k++) {
            int finalK = k;
            if ((!(Arrays.stream(b).anyMatch( num-> num == a[finalK]))) && !(table.containsKey(a[k]))) {
                System.out.print("\n");
                System.out.print(a[k]);
                table.put(a[k], k);
            }
        }

        System.out.print("\n");
        System.out.print("Numbers in array b that aren't in array a:");
        Map<Integer, Integer> table2 = new HashMap<>();
        for (int k = 0; k < b.length; k++) {
            int finalK = k;
            if ((!(Arrays.stream(a).anyMatch( num-> num == b[finalK]))) && !(table2.containsKey(b[k]))) {
                System.out.print("\n");
                System.out.print(b[k]);
                table2.put(b[k], k);
            }
        }
    }

}
