package com.fileCreating;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindPrimeNumber {

    public static Integer findPrimeNumber(int xPrime) {

        // Start from 1
        // Check each number is prime
        // if prime store value in array list
        // check values that against values in the array list
        ArrayList<Integer> primeList = new ArrayList<>();
        Boolean prime = true;

        int currNum = 2;

        do {
            for (Integer x : primeList) {
                if (currNum % x == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) primeList.add(currNum);

            currNum++;
            prime = true;

        } while (primeList.size() < xPrime);

        return primeList.get(primeList.size() - 1);
    }

    // Given a list of numbers to be sorted using an Insertion Sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> unSortedList) {

        // Sort A[0 ... i-1] indexes
        for (int currSorted = 2; currSorted <= unSortedList.size(); currSorted++) {

            // Rover is the curr number being check position among curr sorted list
            int rover = unSortedList.get(currSorted - 1);

            // Checking A[0 ... i-1]
            // Check rover position in the sorted list
            for (int i = 0; i < currSorted; i++) {
                if (rover < unSortedList.get(i)) {

                    // Place rover before the value it's less than
                    unSortedList.add(i, rover);
                    // Remove rover from prev position
                    unSortedList.remove(currSorted);

                    break;
                }
            }
        }

        // return Sorted List
        return unSortedList;
    }

    public static int findIt(int[] A) {
        Map<Integer, Boolean> storeAmountOfThisDigit = new HashMap<>();

        for (int x : A) {
            // if odd [true] make even [false]
            if (storeAmountOfThisDigit.containsKey(x)) {
                if (storeAmountOfThisDigit.get(x)) storeAmountOfThisDigit.put(x, false);
                else storeAmountOfThisDigit.put(x, true);

            } else {
                storeAmountOfThisDigit.put(x, true);
            }
        }


        // Print Map
//        for(Map.Entry<Integer, Boolean> entry : storeAmountOfThisDigit.entrySet()){
//            System.out.println("[" + entry.getKey() + "|" + entry.getValue() + "]");
//        }

        for (Map.Entry<Integer, Boolean> entry : storeAmountOfThisDigit.entrySet()) {
            if (entry.getValue()) return entry.getKey();
        }

        int odd = -1;
        return odd;
    }

    public static String phoneNumbers(int[] numbers) {
        String first = "";
        String second = "";
        String third = "";


        for (int i = 0; i < 3; i++) {
            first += numbers[i];
        }
        for (int i = 3; i < 6; i++) {
            second += numbers[i];
        }
        for (int i = 6; i < 10; i++) {
            third += numbers[i];
        }

        return "(" + first + ") " + second + "-" + third;
    }

    /*
     Sum the numbers
        Write a static method called sumNumbers that takes an array as a parameter and it returns an int of the sum of the numbers.
        sumNumbers([1, 4, 8])
        13
     */
    public static Integer sumNumbers(int[] arr) {

        // take first number and add to the rest of the array
        if (arr.length == 0) return 0;

        int newArr[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }

        return sumNumbers(newArr) + arr[0];
    }

    /*
    Product
        Write a static method called product that takes an array
        of numbers and returns the product of the numbers.

      > product([3, 4, 5])
        60
     */
    public static Integer productNumbers(int[] arr) {
        if (arr.length == 0) return 1;

        int newArr[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }

        return productNumbers(newArr) * arr[0];
    }

    /*
    Find the factorial !
        Write a static method called factorial that takes a number and returns the factorial result of that number
        5! is 5 factorial
        5! = 5 x 4 x 3 x 2 x 1 = 120
        10! = 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1 = 3,628,800
     */
    public static Integer factorial(int fact) {

        // Base Case
        if (fact == 1) return 1;

        // Multiply the fact number with fact-1
        return factorial(fact - 1) * fact;
    }

    /*
    Filtering

        First, create a static method that returns an ArrayList of ints from 1 to 1000
        Second, using that ArrayList, create another static method that takes in that
        arraylist as a parameter and returns a new Arraylist of numbers that does not contain multiples of 2, 3 or 5. DON’T USE .filter


        for example for numbers from 1 to 30, I should get a final arraylist (1, 7, 11, 17, 13, 19, 23, 29).
     */
    private ArrayList<Integer> ansList = new ArrayList<>();

    public ArrayList<Integer> myFilter(ArrayList<Integer> numList) {

        // Base case
        if (numList.size() == 0) {
            return ansList;
        }

        // Check if the first num in numList is a multiple of 2, 3, or 5
        if (numList.get(0) % 2 == 0 || numList.get(0) % 3 == 0 || numList.get(0) % 5 == 0) ;
        else ansList.add(numList.get(0));

        // Repeat using numList with the first index removed
        numList.remove(0);
        return myFilter(numList);
    }

    // Print Square
    public static String printSquare(int count) {
        if (count > 0) {
            return printSquare(count - 1) + "*****\n";
        }
        return "";
    }

    /*
    Acronym

        Write a static method called acronym that takes an array of words as argument and returns the acronym of the words.

        > acronym(['very', 'important', 'person'])
        'VIP'
        > acronym(['national', 'aeronautics', 'space', 'administration'])
        'NASA'
     */
    public static String acronym(String[] strArr) {
        String acr = "";

        for (String str : strArr)
            acr += str.charAt(0);

        return acr.toUpperCase();
    }

    // Tic Tac Toe Three in the Row
    public static String threeInARow(String[] arr) {

        if (arr[0].equalsIgnoreCase("x") && arr[1].equalsIgnoreCase("x") && arr[2].equalsIgnoreCase("x"))
            return "X";

        if (arr[0].equalsIgnoreCase("o") && arr[1].equalsIgnoreCase("o") && arr[2].equalsIgnoreCase("o"))
            return "O";

        return "none";
    }

    /*
    Alphabetical Order Sorting
        Create a static method AlphabetSoup that takes in a string parameter being passed and returns the string with the letters in alphabetical order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be included in the string. DO NOT USE method sort from the collections class.

        Input:"hello"
        Output:"ehllo"

        Input:"coderbyte"
        Output:"bcdeeorty"

        Input:"hooplah"
        Output:"ahhloop"
 */
    public static String alphaSorting(String input) {
        String[] inputArr = input.split("");

        for (int i = 1; i < inputArr.length; i++) {
            int j = i;
            String temp = inputArr[i];

            while(j > 0 && temp.charAt(0) < inputArr[j-1].charAt(0)){
                // swap letters
                inputArr[j] = inputArr[j-1];
                j--;
            }
            inputArr[j] = temp;
        }

        // Join array to a String
        String output = "";
        for (String letter : inputArr) {
            output += letter;
        }

        return output;
    }

    // TIC TAC TOE
    public static String ticTacToe(String[][] board){

        for(int i = 0; i < board.length; i++){
            // Check each row answer
            if(board[i][0].equalsIgnoreCase("O") &&board[i][1].equalsIgnoreCase("O") && board[i][2].equalsIgnoreCase("O"))
                return "O";
            else if(board[i][0].equalsIgnoreCase("X") &&board[i][1].equalsIgnoreCase("X") && board[i][2].equalsIgnoreCase("X"))
                return "X";

            // Check each col for answer
            if(board[0][i].equalsIgnoreCase("O") &&board[1][i].equalsIgnoreCase("O") && board[2][i].equalsIgnoreCase("O"))
                return "O";
            else if(board[0][i].equalsIgnoreCase("X") &&board[1][i].equalsIgnoreCase("X") && board[2][i].equalsIgnoreCase("X"))
                return "X";
        }

        // Check Diagonals
        if(board[0][0].equalsIgnoreCase("O") &&board[1][1].equalsIgnoreCase("O") && board[2][2].equalsIgnoreCase("O")) return "O";
        else if(board[0][0].equalsIgnoreCase("X") &&board[1][1].equalsIgnoreCase("X") && board[2][2].equalsIgnoreCase("X")) return "X";
        else if(board[0][0].equalsIgnoreCase("O") &&board[1][1].equalsIgnoreCase("O") && board[2][2].equalsIgnoreCase("O")) return "O";
        else if(board[0][2].equalsIgnoreCase("X") &&board[1][1].equalsIgnoreCase("X") && board[2][0].equalsIgnoreCase("X")) return "X";

        return "none";
    }


}

