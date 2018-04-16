package com.fileCreating;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testInsertionSort();
    }

    public static void findThePrime(int x){
        System.out.println(" The " + x + "th Prime is ... \n[" + FindPrimeNumber.findPrimeNumber(x) + "]");
    }

    public static void testInsertionSort(){

        // Initialize lists
        ArrayList<Integer> unsortedList = new ArrayList<>();
        ArrayList<Integer> sortedList;

        // Create an Unsorted list to sort using Insertion Sort
        unsortedList.add(12);
        unsortedList.add(11);
        unsortedList.add(13);
        unsortedList.add(5);
        unsortedList.add(6);

        // Print Unsorted List
        String str = "unSorted list is  [";
        for(Integer num : unsortedList){
            str += num + "|";
        }
        String finalStr = str.substring(0,str.length()-1);
        System.out.println(finalStr + "]");

        // Sort unsorted List using Insertion Sort
        sortedList = FindPrimeNumber.insertionSort(unsortedList);

        // Print sorted list
        String str1 = "  Sorted list is  [";
        for(Integer num : sortedList){
            str1 += num + "|";
        }
        String finalStr1 = str1.substring(0,str1.length()-1);
        System.out.println(finalStr1 + "]");

    }
}
