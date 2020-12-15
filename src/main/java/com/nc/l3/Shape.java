package com.nc.l3;

public interface Shape extends I1,I2 {
    double PI=3.14;

    abstract double calculateArea(); //по умолчанию public
    default String provideColor(){
        return "green";
    }

}
