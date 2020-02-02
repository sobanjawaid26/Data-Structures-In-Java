package com.soban.stack.bylinkedlist;

public class StackByLinkedList {

    SingleLinkedList list;

    // push
    public int push(int val){
        if(this.list == null)
            this.list = new SingleLinkedList();
        SingleNode newNode = new SingleNode(val);
        newNode.setNext(this.list.getHead());
        this.list.setHead(newNode);
        return val;

    }

    // pop
    public void pop(){
        this.list.setHead(this.list.getHead().getNext());
    }

    //peek
    public int peek(){
        return this.list.getHead().getValue();
    }
    //is empty
    public boolean isEmpty(){
        return (this.list.getHead() == null) ? true : false;
    }
    // is full
    public boolean isFull(){
        return true;
    }

    public static void main(String[] args) {
        StackByLinkedList stack = new StackByLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());
    }

}
