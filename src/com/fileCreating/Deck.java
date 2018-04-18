package com.fileCreating;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> allCards = new ArrayList<>();
    private ArrayList<Card> modCards = new ArrayList<>();

    public Deck() {
        String[] suit = {"Club", "Spade", "Diamond", "Heart"};
        String[] face = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        // Intialize allCards with a full Deck of 52 playing cards
        for(String aSuit : suit){
            for(String aFace : face){
                allCards.add(new Card(aSuit, aFace));
            }
        }
    }

    public void pickCards(String str){
        for(Card card : allCards){
            if(card.getValue().equalsIgnoreCase(str) || card.getType().equalsIgnoreCase(str))
                modCards.add(card);
        }
    }

    @Override
    public String toString() {
        String list = "";

        for(Card card : modCards){
            list += "\n "+ card.toString();
        }
        return "Deck " + list;
    }
}
