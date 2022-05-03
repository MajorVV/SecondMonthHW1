package com.company;

public class Mobile {
    private String model;
    private int memory;
    private int year;
    private colorEnum mobiColor;

    public colorEnum getMobiColor() {
        return mobiColor;
    }
    public int getMemory() {
        return memory;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Mobile (String model, int memory, int year, colorEnum mobiColor ){
        this.model = model;
        this.memory = memory;
        this.year = year;
        this.mobiColor = mobiColor;

    }
    public String getInfo(){
        return "Model:  " + model +
                "\nMemory: " + memory +
                "\nyear: " + year +
                "\nColor: " + mobiColor;
    }
}
