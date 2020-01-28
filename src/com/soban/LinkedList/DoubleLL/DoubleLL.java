package com.soban.LinkedList.DoubleLL;

public class DoubleLL {

    private DoubleLLNode head;
    private DoubleLLNode tail;
    private int size;

    public DoubleLL() {
    }

    public DoubleLL(DoubleLLNode head, DoubleLLNode tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public DoubleLLNode getHead() {
        return head;
    }

    public void setHead(DoubleLLNode head) {
        this.head = head;
    }

    public DoubleLLNode getTail() {
        return tail;
    }

    public void setTail(DoubleLLNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoubleLLNode createDoubleLL(int data){
        DoubleLLNode node  = new DoubleLLNode(data);
        node.setNext(null);
        node.setPrev(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public int insertUniversal(int data, int location){
        DoubleLLNode newNode = new DoubleLLNode(data);
        if(location == 0){
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;

        }else if(location >= size){
            newNode.setNext(null);
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }else {
            DoubleLLNode node = head;
            for (int i = 0; i < location; i++){
                node = node.getNext();
            }
            newNode.setNext(node.getNext());
            newNode.setPrev(node);
            node.getNext().setPrev(newNode);
            node.setNext(newNode);
        }
        size++;
        return data;
    }

    public void traverseDoubleLL(DoubleLLNode head){
        DoubleLLNode node = head;
        System.out.println(node.getData());
        while(node.getNext() != null){
            System.out.println(node.getNext().getData());
            node = node.getNext();
        }
    }

    public int searchDoubleLL(DoubleLLNode head, int searchEle){
        int pos = 1;
        DoubleLLNode temp = head;
        while(temp.getNext() != null){
            if(temp.getData() == searchEle){
                return pos;
            }
            temp = temp.getNext();
            pos++;
        }
        return pos;
    }

    public int deleteEleFromDoubleLL(DoubleLLNode head, int delEle){
        int pos = 1;
        DoubleLLNode temp = head;
        while (temp.getNext() != null){
            if(temp.getData() == delEle){
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                return pos;
            }
            temp = temp.getNext();
            pos++;
        }
        return pos;
    }

    public DoubleLLNode deleteEntireLL(DoubleLLNode head){
        head = null;
        tail = null;
        return head;
    }

    public static void main(String[] args) {
        DoubleLL obj = new DoubleLL();
        DoubleLLNode head = obj.createDoubleLL(1);
        obj.insertUniversal(2,2);
        obj.insertUniversal(3,3);
        obj.insertUniversal(4,4);
        obj.insertUniversal(5,5);
        obj.insertUniversal(6,6);
        obj.insertUniversal(7,7);
        obj.insertUniversal(8,8);
        obj.insertUniversal(9,9);

        int pos = obj.searchDoubleLL(head, 5);
        System.out.println(pos);
//        obj.traverseDoubleLL(head);

        int delPos = obj.deleteEleFromDoubleLL(head, 5);
        System.out.println(delPos);
//        obj.traverseDoubleLL(head);

//        obj.traverseDoubleLL(head);

//        System.out.println(head.getData());
    }
}
