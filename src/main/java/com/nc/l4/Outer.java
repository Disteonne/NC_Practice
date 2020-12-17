package com.nc.l4;

public class Outer {
    private  static int counter;
    private static void m1(){};
    private void m2(){};
    private static final double PI=3.14;

    public static class Inner{
        public class InnerInner{

        }

        public static final int C=3;

        public void incrementCounter(){
           // counter++;  <- for inner
            counter++;
            m1();
            //m2(); не работает в статик классе
        }

       // public static void innetStatck(){}; -внутри иннера- статик(ПОЛЯ И МЕТОДЫ) нельзя
        public static void m(){
            m1();
            //m2(); не работает в статик классе
        } // внутри статик класса могут быть и статик и не статик. Можно создавать инстансы без внеш класса
    }

    public void displayIncrementedCounter(){
        double res=PI*PI;
        Inner inner=new Inner();
        inner.incrementCounter();
        System.out.println(counter);
        m1();
        m2();

    }

    public int getCounter() {
        return counter;
    }
}
