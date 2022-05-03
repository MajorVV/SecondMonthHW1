package com.company;

public final class Apple extends Samsung{
    private int camera;

    public Apple(String model, int memory, int year, colorEnum mobiColor, double size, int camera) {
        super(model, memory, year, mobiColor, size);
        this.camera = camera;
    }

    public int getCamera() {
        return camera;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + "\nCamera: " + camera;
    }

    public int Samsung(int model, int memory){
        return super.Samsung(model, memory);
    }
}
