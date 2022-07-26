package com.company;

public class Depo {
    int parkingplace;
    String located;

    @Override
    public String toString() {
        return "Depo{" +
                "parkingplace=" + parkingplace +
                ", located='" + located + '\'' +
                '}';
    }

    public Depo(int parkingplace, String located){
        this.parkingplace = parkingplace;
        this.located = located;



    }

}
