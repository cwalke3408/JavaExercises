package com.fileCreating;

public class CrummyCal {
    private int total;


    public void add(int num){
        this.total += num;
    }

    public void substract(int num){
        this.total -= num;
    }

    public void multiply(int num){
        this.total *= num;
    }

    public void divide(int num){
        total /= num;
    }

    public void clear(){
        this.total = 0;
    }

    public int getAnswer(){
        return total;
    }
}

