package com.nc.l2.shapes;

public class Triangle  extends Shape{

    private double base=1.0;
    private double height=1;


    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }

    public Triangle(String color) {
        super(color);
    }
}
