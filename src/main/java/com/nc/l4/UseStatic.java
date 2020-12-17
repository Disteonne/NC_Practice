package com.nc.l4;

public class UseStatic {
    static int a=3;
    static int b;

    //передаются строго по значению и ссыл и примитив
    static void meth(int x){
        System.out.println("use meth");
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }

    static {
        System.out.println("init");
        b=a*4;
    }
    //блок кода задает область видимости
    //java гарантирует последовательность вызовов java статик блок
    static {
        System.out.println("from static two");
    }
    public static void main(String[] args) {
        System.out.println("main");
        meth(42);
    }
}
