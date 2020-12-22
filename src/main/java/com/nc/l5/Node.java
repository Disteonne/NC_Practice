package com.nc.l5;

public class Node {

    private int data;
    private Node next;

     Node() {
    }

     Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

     Node(int data) {
        this.data = data;
    }

     int getData() {
        return data;
    }

     Node getNext() {
        return next;
    }

     void setData(int data) {
        this.data = data;
    }

     void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
