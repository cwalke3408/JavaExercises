package com.fileCreating;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testInsertionSort(17);
    }

    public static void findThePrime(int x){
        System.out.println(" The " + x + "th Prime is ... \n[" + FindPrimeNumber.findPrimeNumber(x) + "]");
    }

    public static void testInsertionSort(int entries){

        // Initialize lists
        ArrayList<Integer> unsortedList = new ArrayList<>();
        ArrayList<Integer> sortedList;

        // Create an Unsorted list to sort using Insertion Sort
        for(int i = 0; i < entries; i++){
            int random = (int)(Math.random() * 99 + 1);
            unsortedList.add(random);
        }

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
