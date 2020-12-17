package com.nc.l4;

public class Person {
    private String name;
    private int age;
    private String passport;

    private static int counter;

    public Person(String name, int age, String passport) {
        counter++;
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public static int getCounter() {
        return counter;
    }

    public static void  staticMethod(){
        //this.nonStaticMethod();  в статических работают ТОЛЬКО СТАТИЧЕСКИЕ
        //age--;
        getCounter();
    }
    //this/super со статикой-НЕЛЬЗЯ.т.к статик-к классу.а не к объекту
    //нельзя overrider и overl
    public  void  nonStaticMethod(){
        //this.staticMethod();//в не статич методак может вызыватьв всё статическое и не
        getCounter();

    }
}
