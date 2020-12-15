package com.nc.l3;


public class Triangle implements Shape {
    private String color="red";
    private double base=1.0;
    private double height=1;

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    public Triangle(String color, double base, double height) {

        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }

    public Triangle(String color) {

    }
}
