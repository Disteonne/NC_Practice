package com.nc.l2.shapes;

public class Main {
    public static void main(String[] args) {
    Rectangle rectangle=new Rectangle("yellow",25,100);

    Triangle triangle=new Triangle("black",15.0,70.0);//ссылка мб shape

        //как работает instanceof?
    m(rectangle);
    m(triangle);

    System.out.println(rectangle.calculateArea());
    System.out.println(triangle.calculateArea());


    Shape teremok=new Shape("green") {
        double base=15.0;
        double height=10.0;
        @Override
        public double calculateArea() {
            return base*base+0.5*base*height;
        }
    };

        System.out.println("square of teremok "+teremok.calculateArea());

    }

    public static void m(Shape shape) {
        System.out.println("Main.m");
        System.out.println("area"+shape.calculateArea()); //можно исп для множ-ва объектов.Универсальность
    }
}
