package com.fileCreating;

import java.util.ArrayList;

public class FindPrimeNumber {

    public static Integer findPrimeNumber(int xPrime){

        // Start from 1
        // Check each number is prime
        // if prime store value in array list
        // check values that against values in the array list
        ArrayList<Integer> primeList = new ArrayList<>();
        Boolean prime = true;

        int currNum = 2;

        do{
            for(Integer x : primeList){
                if(currNum % x == 0){
                    prime = false;
                    break;
                }
            }

            if(prime) primeList.add(currNum);

            currNum++;
            prime = true;

        } while(primeList.size() < xPrime);

        return primeList.get(primeList.size() - 1);
    }

    // Given a list of numbers to be sorted using an Insertion Sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> unSortedList){

        // Sort A[0 ... i-1] indexes
        for(int currSorted = 2; currSorted <= unSortedList.size(); currSorted++){

            // Rover is the curr number being check position among curr sorted list
            int rover = unSortedList.get(currSorted - 1);

            // Checking A[0 ... i-1]
            // Check rover position in the sorted list
            for(int i = 0; i < currSorted; i++){
                if(rover < unSortedList.get(i)){

                    // Place rover before the value it's less than
                    unSortedList.add(i , rover);
                    // Remove rover from prev position
                    unSortedList.remove(currSorted);

                    break;
                }
            }
        }

        // return Sorted List
        return unSortedList;
    }

}

