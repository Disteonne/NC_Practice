package com.nc.l3;


public  class Rectangle implements Shape {
    private String color="red";
    private double length=1;
    private double width=1;

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    public Rectangle(String color){

    }

    public Rectangle(String color, double length, double width) {

        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
