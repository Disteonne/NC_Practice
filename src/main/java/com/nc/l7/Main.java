package com.nc.l7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
    Integer i1=new Integer(5);
    Integer i2=10; //Autobox
    Integer i3= sum(i1,i2);



    List<A> listA=new ArrayList<>();
    List<B> listB=new ArrayList<>();
    List<C> listC=new ArrayList<>();

    Main.process(listA);
    Main.process(listB);
    Main.process(listC);

    }
    //WILDCARD ?: может так же наследовать классы и интерфейсы
    //НЕ СОЗДАЕТСЯ НОВЫЙ ТИП В ОТЛИЧИИ ОТ ПАРАМЕТРИЗАЦИИ КЛАССА(НЕ WILDCARD)
    public static void process(List<? extends B> list){
        for (Object o :list
             ) {
            System.out.println(o);
        }
    }

    public static <PARAM extends Number> double method(PARAM a,PARAM b){
        return a.doubleValue()+b.doubleValue();
    }
}
