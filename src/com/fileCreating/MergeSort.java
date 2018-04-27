package com.fileCreating;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public int[] mergeSort(int[] num) {

        // Midway point to cut the array in half
        int halfWayIndex = (num.length / 2);


        int[] test = Arrays.copyOfRange(num, 0, num.length);
        System.out.println();
        System.out.print("My given array: ");
        for (int x : test) System.out.print("<" + x + ">");
        System.out.println();

        // Split array in half into a front and back array
        int[] front = Arrays.copyOfRange(num, 0, halfWayIndex);
        int[] back = Arrays.copyOfRange(num, halfWayIndex, num.length);

        System.out.println("Front <---> Back");
        printArray(front);
        System.out.print(" <---> ");
        printArray(back);
        System.out.println();
        System.out.println();

        int[] frontSorted = new int[front.length];
        int[] backSorted = new int[back.length];

        // Recursively cut array in half until the array is size of 1
        if (halfWayIndex > 0) {
            frontSorted = mergeSort(front);
            backSorted = mergeSort(back);
        } else {
            return num;
        }

        int[] mergeList = new int[front.length + back.length];
        int i = 0, j = 0, x = 0;

        // Merge the sub array by checking the min btw rover btw the sub arrays
        while (i < frontSorted.length && j < backSorted.length) {
            // Compare which is smaller
            if (frontSorted[i] < backSorted[j]) {
                mergeList[x] = frontSorted[i];
                i++;
            } else {
                mergeList[x] = backSorted[j];
                j++;
            }

            x++;
        }

        // Tac on the rest when front or back is out
        while (j < backSorted.length) {
            mergeList[x] = backSorted[j];
            j++;
            x++;
        }
        while (i < frontSorted.length) {
            mergeList[x] = frontSorted[i];
            i++;
            x++;
        }


        System.out.print("Merging :: ");
        printArray(frontSorted);
        System.out.print(" with ");
        printArray(backSorted);
        System.out.print(" :: Final --> ");
        printArray(mergeList);
        System.out.println();

        return mergeList;
    }

    public void printArray(int[] arr) {

        System.out.print("|");
        for (int x : arr) {
            System.out.print(x + "|");
        }
    }

    // Given array size -> produce random array with the length of 'arrSize'
    public int[] randArray(int arrSize){

        int[] randomArray = new int[arrSize];

        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = (int)(Math.random() * 100 + 1 );
        }

        return randomArray;
    }
}
