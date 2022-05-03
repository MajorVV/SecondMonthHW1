package com.company;

public class Main {
    public static void main(String[] args) {

     Samsung s10 = new Samsung("+", 128, 2021, colorEnum.RED, 7.8);
     Apple macbook = new Apple("15", 1028, 2020, colorEnum.WHITE, 4, 4);
     Apple iPad = new Apple("iPad mini", 256, 2015, colorEnum.GOLD, 12, 30);
        System.out.println("S10: " + s10.getInfo() + "\nMacbook: " + macbook.getInfo() +
                "\nIpad: " + iPad.getInfo() + "");
    }
}
