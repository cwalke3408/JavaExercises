package com.fileCreating;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testMergeSort();
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

    public static void testOddCount(){
        int[] arr = {20,1,1,2,2,3,3,5,5,4,20,4,5};
        System.out.println("The Integer with an odd amount is: " + FindPrimeNumber.findIt(arr));
    }

    public static void phoneNumber(){
        System.out.println("Phone Number: " + FindPrimeNumber.phoneNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static void sumNumbers(){
        System.out.println("Sum of Numbers: " + FindPrimeNumber.sumNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static void productNumbes(){
        System.out.println("Product of Numbers: " + FindPrimeNumber.productNumbers(new int[]{3,4,5}));
    }

    public static void factorial(){
        System.out.println("Factorial: " + FindPrimeNumber.factorial(10));
    }

    public static void filtering()
    {
        int size = 30;
        ArrayList<Integer> fakeDummy = new ArrayList<>();

        // Create dummy arraylist
        for(int i = 1; i <= size; i++){
            fakeDummy.add(i);
        }

        FindPrimeNumber factObj = new FindPrimeNumber();
        ArrayList<Integer> ans = factObj.myFilter(fakeDummy);

        System.out.print("[");
        for(Integer x : ans) System.out.print(x+"|");
        System.out.println();
    }

    public static void printSquare(){
        System.out.println(FindPrimeNumber.printSquare(3));
    }

    public static void acronym(){
        String[] str = {"very", "important", "person"};
        System.out.println(FindPrimeNumber.acronym(str));
    }

    public static void threeInTheRow(){
        String[] strX = {"X","X","X"};
        System.out.println("Case 1: " + FindPrimeNumber.threeInARow(strX));

        String[] strO = {"O","O","O"};
        System.out.println("Case 2: " + FindPrimeNumber.threeInARow(strO));

        String[] strNone = {"X","O","X"};
        System.out.println("Case 3: " + FindPrimeNumber.threeInARow(strNone));
    }

    public static void testAlphaSorting(){
        System.out.println(FindPrimeNumber.alphaSorting("hooplah"));
    }

    public static void testTicTacToe(){
        System.out.println(FindPrimeNumber.ticTacToe(new String[][]{
                {"O", "O", "O"},
                {"X", " ", "X"},
                {" " , "X", " "}
        }));

        System.out.println(FindPrimeNumber.ticTacToe(new String[][]{
                {"O", "X", "O"},
                {"O", "X", " "},
                {" " ,"X" ," "}
        }));

        System.out.println(FindPrimeNumber.ticTacToe(new String[][]{
                {"O", "X", "O"},
                { "O", "O", " "},
                {" ","X","X"}
        }));
    }

    public static void testCalculator(){

        CrummyCal calc = new CrummyCal();

        calc.add(750);
        calc.substract(420);
        calc.multiply(13);
        calc.divide(30);

        System.out.println(calc.getAnswer());

        calc.clear();
        calc.add(1000);
        System.out.println(calc.getAnswer());
    }

    public static void testStrMultiply(){
        CarlsProblems2 carl = new CarlsProblems2();
        System.out.println(carl.strMultiply("abc", 5));
    }

    public static void testPalindrom(){
        System.out.println(CarlsProblems2.palindrome("tattarattat"));
    }

    public static void testCards(){
        CarlsProblems2.deckOfCards();
    }

    public static void testDeck(){
        Deck deck = new Deck();

        deck.pickCards("Club");
        System.out.println(deck.toString());
    }

    public static void testMergeSort(){

        MergeSort mergeSorting = new MergeSort();
        int[] numList = mergeSorting.randArray(30);

        //int[] numList = {8,4,3,7,5,6,1};
        mergeSorting.mergeSort(numList);
    }

}
