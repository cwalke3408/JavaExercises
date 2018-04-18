package com.fileCreating;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;

public class CarlsProblems2 {

    public String strMultiply(String str, int count){

        String finalMultiStr = "";
        //str += str;
        for(int i =0; i < count; i++){
            finalMultiStr += str;
        }

        return finalMultiStr;
    }

    public static boolean palindrome(String str){

        str.toLowerCase();
        if(str.length() <= 1) return true;
        if(str.charAt(0) != str.charAt(str.length()-1)) return false;

        return palindrome(str.substring(1, str.length()-1));

    }

    public static void deckOfCards(){

        String[] type = {"Club", "Spade", "Diamond", "Heart"};
        String[] value = {"Ace", "2","3","4","5","6","7","8","9","Jack","Queen","King"};
        Card[] cards = new Card[48];

        int count = 0;
        for(String aType : type){
            for(String aValue : value){
                cards[count] = new Card(aType, aValue);
                count++;
            }
        }

        // Print Deck of Cards
        for (int i = 0; i < 48; i++) {
            System.out.println(cards[i].toString());
        }
    }
}
