package com.nc.l1_21;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    public int operate(int x, int y, MathOperation operation) {
        return operation.operation(x, y);
    }


    public static void main(String[] args) {
        Operator operator = new Operator();
        int x = 3;
        int y = 4;
        int result = operator.operate(x, y, new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        });
        System.out.println(result);

        //MathOperation mathOperation=(a,b) -> a + b;
        AdditionOperation additionOperation=new AdditionOperation();

        //int res=operator.operate(x,y,additionOperation::add);//ref to instance not static method

        int res=operator.operate(x,y,Math::multiplyExact);//ref to inst static method
        System.out.println(res);

        int result1= operator.operate(x, y, (int a, int b) -> {
            return a + b;
        });

        System.out.println(result1);

        int result2= operator.operate(x, y, (a,b) -> a + b);

        System.out.println(result2);

        List<String> stringList=new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");

        //stringList.forEach(element-> System.out.println(element));
        stringList.forEach(System.out::println);

    }
}
