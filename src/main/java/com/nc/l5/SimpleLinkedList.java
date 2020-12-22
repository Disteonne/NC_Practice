package com.nc.l5;

public class SimpleLinkedList {
    private Node first;
    private Node last;
    private int size;

    public SimpleLinkedList() {
    }

    public int getSize() {
        return size;
    }

    public void addToEnd(int data) {
        if (size == 0) {
            first = new Node(data);
            last = first;
            size = 1;
            return;
        }
        Node node = new Node(data);
        last.setNext(node);
        last = node;
        size++;
    }

    public void add(int data, int position) throws Exception {
        if (position > size) {
            throw new Exception();
        }
        if (position == 0 && size == 0 || position == size) {
            addToEnd(data);
            return;
        }
        if(position==0 && size>0){
            first=new Node(data,first);
            size++;
        }
        Node cursor=first;
        for (int i = 0; i < position; i++) {
            cursor=cursor.getNext();
        }
        Node elem=new Node(data,cursor.getNext());
        cursor.setNext(elem);
        return;

    }

    public void delete(int position) {
        //
    }

    public int get(int position) {
        //
        return 0;
    }

    public void set(int data, int position) {

    }

    public int pop() {
        //
        return 0;
    }

    public void push() {
        //
    }

}
