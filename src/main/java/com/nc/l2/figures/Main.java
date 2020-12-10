package com.nc.l2.figures;

public class Main {
    public static void main(String[] args) {

        //Circle circle1=new Circle(25);
        Circle circle2=new Circle(25,"green");
        Circle cylinder=new Cylinder(25,"yellow",15.2); //видит только методы.которые есть в родителях upcast

        /*
        System.out.println(circle2.returnCurrentObject());

        System.out.println(circle2.getArea());
        System.out.println(cylinder.getArea());

        Cylinder cylinder1=(Cylinder) cylinder; //downcast-небезопасно . Проводится явно. Ссылаются на один объект,но ссылки разные
        //Можно привести к circle,а затем Cylinder (Cylinder)(Circle) cylinder;
        System.out.println(cylinder1.calculateVolume());
         */

        circle2=null;
        System.out.println(circle2 instanceof Circle);
        System.out.println(circle2 instanceof Cylinder);
        System.out.println(circle2 instanceof Object);

        System.out.println("_______________________");

        System.out.println(cylinder instanceof Circle);
        System.out.println(cylinder instanceof Cylinder);
        System.out.println(cylinder instanceof Object);

        //true- с типа объекта и вверх по иерархии


    }
}
