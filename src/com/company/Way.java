package com.company;

public class Way {
    String name;
    int distance;

    @Override
    public String toString() {
        return "Way{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }

    public Way(String name, int distance) {
       this.name = name;
       this.distance = distance;


    }
}
