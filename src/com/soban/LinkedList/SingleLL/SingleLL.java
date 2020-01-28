package com.soban.LinkedList.SingleLL;

public class SingleLL {
    SingleLLNode head;
    SingleLLNode tail;
    int size;

    // Create a SinglyLinkedList
    public SingleLLNode createSingleLL(int data) {
        SingleLLNode node = new SingleLLNode(data);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert an element at the start of LL
    public SingleLLNode insertAtBeginning(int data){
        SingleLLNode node = new SingleLLNode(data);
        node.setNext(head);
        head = node;
        size++;
        return head;
    }

    // Insert an element at the end of LL
    public SingleLLNode insertAtEnd(int data){
        SingleLLNode node = new SingleLLNode(data);
        node.setNext(null);
        tail.setNext(node);
        tail = node;
        size++;
        return tail;
    }

    // Insert an element at a given location
    public SingleLLNode insertAtGivenLocation(int data, int location){
        SingleLLNode newNode = new SingleLLNode(data);
        SingleLLNode node = null;
        for (int i = 1; i<= location; i++)
            node = head.getNext();
        newNode.setNext(node.getNext());
        node.setNext(newNode);
        size++;
        return head;
    }

    //main
    public static void main(String[] args) {
//        SingleLL obj = new SingleLL();
//        SingleLLNode head = obj.createSingleLL(1);
//        SingleLLNode tail = obj.insertAtEnd(3);
//        obj.insertAtGivenLocation(2,2);
//        obj.insertAtGivenLocation(4,3);
//        obj.insertAtGivenLocation(5,4);
    }
}
