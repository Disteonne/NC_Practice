package com.nc.l1_21;

import com.nc.l2.figures.Circle;

public class ReflecMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //1. forName() syntax
        Class clazz=Class.forName("com.nc.l2.figures.Circle");

        Circle circle=(Circle) clazz.newInstance();

        System.out.println(clazz.isPrimitive());
        System.out.println(clazz.getPackage().getName());

        //2. getClass() syntax
        int[] array={1,2,3,4};
        Class clazz1=array.getClass();
        System.out.println(clazz1.isPrimitive());

        //3. .class syntax
        Class clazz2=int.class;
        System.out.println(clazz2.isPrimitive());

    }
}
