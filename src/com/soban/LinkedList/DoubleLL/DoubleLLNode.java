package com.soban.LinkedList.DoubleLL;

public class DoubleLLNode {

    private int data;
    private DoubleLLNode next;
    private DoubleLLNode prev;

    public DoubleLLNode() {
    }

    public DoubleLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleLLNode getNext() {
        return next;
    }

    public void setNext(DoubleLLNode next) {
        this.next = next;
    }

    public DoubleLLNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleLLNode prev) {
        this.prev = prev;
    }
}
