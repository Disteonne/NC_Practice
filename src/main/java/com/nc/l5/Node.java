package com.nc.l5;

import java.util.LinkedList;

public class Node<DATA extends Number> {

    private DATA data;
    private Node<DATA> next;

     Node() {
    }

     Node(DATA data, Node<DATA> next) {
        this.data = data;
        this.next = next;
    }

     Node(DATA data) {
        this.data = data;
    }

     DATA getData() {
        return data;
    }

     Node getNext() {
        return next;
    }

     void setData(DATA data) {
        this.data = data;
    }

     void setNext(Node<DATA> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
//DATA1 НЕ ТАКАЯ Ж КАК DATA
class ChildNode<DATA1 extends Number,X> extends Node<DATA1>{
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();

    }
}