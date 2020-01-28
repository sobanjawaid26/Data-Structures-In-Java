package com.soban.LinkedList.SingleLL;

public class SingleLLNode {

    int data;
    SingleLLNode next;

    SingleLLNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SingleLLNode getNext() {
        return next;
    }

    public void setNext(SingleLLNode next) {
        this.next = next;
    }
}
