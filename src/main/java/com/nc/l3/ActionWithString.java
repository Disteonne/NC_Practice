package com.nc.l3;

public class ActionWithString {
    public static void main(String[] args) {
        String str1="hello"; //string pool
        String str2=new String("hello");//heap
        String str3="hello";
        //в какую область попадет объект string s=str1+str2 и тд

        System.out.println(str1==str2);
        System.out.println(str3==str2);
        System.out.println(str1==str3);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str3));

        //как оптимальнее сравнить строки?

        str1.equals("hello"); //если str1=null,то nullex
        //или
        "hello".equals("hello");//так
    }
}
