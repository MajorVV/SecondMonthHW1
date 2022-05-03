package com.company;

public class Samsung extends  Mobile{

    public Samsung(String model, int memory, int year, colorEnum mobiColor, double size) {
        super(model, memory, year, mobiColor);
this.size = size;
    }
    private double size;

    public double getSize() {
        return size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nSize: " + size;
    }

    public int Samsung(int model, int memory){
        return model;
    }

    public final int Samsung( int memory){
        return memory;
    }

}
