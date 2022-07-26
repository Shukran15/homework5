package com.company;

public class Priceway{

    int morningprice;
    int nightprice;

    @Override
    public String toString() {
        return "Priceway{" +
                "morningprice=" + morningprice +
                ", nightprice=" + nightprice +
                '}';
    }

    public Priceway(int morgenprice, int nighprice){
    this.morningprice = morningprice;
    this.nightprice = nightprice;


    }
}