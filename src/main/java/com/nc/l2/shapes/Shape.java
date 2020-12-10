package com.nc.l2.shapes;

public abstract class Shape {
    private String color="red";

    public abstract double calculateArea();

    public Shape(String color) {
        this.color = color;
    }



}
