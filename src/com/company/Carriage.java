package com.company;

import java.util.ArrayList;

public class Carriage {

    public static final int capacity = 80;
    private ArrayList<Boolean> places;

    public Carriage() {
        places = new ArrayList<>();

        for (int i = 0; i < capacity; i++)
            places.add(false);
    }

    public Boolean CheckPlaceIsFree(int number) {
        return places.get(number);
    }

    public void SetPlaceTaken(int number) {
        places.set(number, true);
    }

    public Boolean IsFull() {
        return places.stream().allMatch(p -> p);
    }
}
