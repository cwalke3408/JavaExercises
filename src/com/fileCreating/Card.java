package com.fileCreating;

public class Card {

    private String type;
    private String value;

    public Card(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                this.type + '\'' +
                this.value + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
