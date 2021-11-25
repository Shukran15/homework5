package com.company;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train("electric", "oval", 45.5F, 12, "green");
        Train train2 = new Train("petrol", "rectangle", 30.5F, 10, "white");

        Way way1 = new Way("Nekrasovka-Kosino", 1000);
        Way way2 = new Way ("Kosino-Nekrasovka", 1000);

        Priceway priceway = new Priceway (45, 65);

        Tunnel tunnel1 = new Tunnel(200);
        Tunnel tunnel2 = new Tunnel(300);
        Tunnel tunnel3 = new Tunnel(500);

        Depo depo = new Depo(15, "Lermontovsy prospekt");
    }



}