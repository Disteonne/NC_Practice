package com.nc.l4;

public class Main {
    public static void main(String[] args) {
        /*
        Person p1=new Person("Ivan",25,"02204");
       // Person.counter=100500;
        Person p2=new Person("Petr",30,"11204");

        System.out.println(p1.getCounter());
        System.out.println(p2.getCounter());

        System.out.println(Person.getCounter());
         */


        //внутр и влож классы
        /*
        Outer outer=new Outer();
        outer.displayIncrementedCounter();
        outer.displayIncrementedCounter();


        Outer.Inner inner=outer.new Inner();
        Outer.Inner inner1=new Outer().new Inner();

        inner.incrementCounter();
        System.out.println(outer.getCounter());
         */

        //Outer outer=new Outer();
        //outer.displayIncrementedCounter();

        /*
        Outer outer=new Outer();
        Outer.Inner inner=new Outer.Inner();
        inner.incrementCounter();
        System.out.println(outer.getCounter());
        System.out.println(Outer.Inner.C);

        Outer.Inner.InnerInner innerInner=inner.new InnerInner();

         */
        Outer outer=new Outer();
        Outer.Inner inner=new Outer.Inner();
        inner.incrementCounter();
        outer.displayIncrementedCounter();
        System.out.println(Outer.Inner.C);

    }
}
