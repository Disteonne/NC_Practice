package com.nc.l2.shapes;

public class Rectangle extends Shape {
    private double length=1;
    private double width=1;

    @Override
    public double calculateArea() {
        return length*width;
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, double length, double width) {
        super(color);
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
