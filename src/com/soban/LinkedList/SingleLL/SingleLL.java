package com.soban.LinkedList.SingleLL;

public class SingleLL {
    SingleLLNode head;
    SingleLLNode tail;
    int size;

    /**
     * Create a SinglyLinkedList
     * @param data
     * @return
     */
    public SingleLLNode createSingleLL(int data) {
        SingleLLNode node = new SingleLLNode(data);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    /**
     * Insert element at any position
     * @param data
     * @param location
     * @return
     */
    public SingleLLNode insertUniversal(int data, int location){
        SingleLLNode node = new SingleLLNode(data);
        if(location == 0){
            node.setNext(head);
            head = node;
            size++;
        } else if(location >= size){
            tail.setNext(node);
            tail = node;
            size++;
        }
        else{
            SingleLLNode temp = head;
            for (int i = 1; i< location; i++){
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        return head;
    }

    /**
     * Traverse Linked List
     * @param head
     */
    public void traverseLinkedList(SingleLLNode head){
        SingleLLNode node = head;
        System.out.println(head.getData());
        while(node.getNext() != null){
            System.out.println(node.getNext().getData());
            node = node.getNext();
        }
    }

    /**
     * Search an element in a Linked List
     * @param head
     * @param searchEle
     * @return
     */
    public int searchInLinkedList(SingleLLNode head, int searchEle){
        int pos = 1;
        SingleLLNode node = head;
        while(node.getData() != searchEle){
            node = node.getNext();
            pos++;
        }
        if(node.getData() == searchEle)
            return pos;
        return 0;
    }

    /**
     * Delete an element from the Linked List
     * @param head
     * @param delEle
     * @return
     */
    public int deleteEleFromLinkedList(SingleLLNode head, int delEle){
        int pos = 1;
        SingleLLNode node = head;
        while(node.getNext().getData() != delEle){
            node = node.getNext();
            pos++;
        }
        if(node.getNext().getData() == delEle){
            node.setNext(node.getNext().getNext());
            return pos + 1;
        }
        return 0;
    }

    /**
     * Delete an entire Linked List
     * Returns SingleLLNode
     * @param h
     * @return
     */
    public SingleLLNode deleteEntireLL(SingleLLNode h){
        h = null;
        tail = null;
        return head;
    }

    public static void main(String[] args) {


        SingleLL obj = new SingleLL();
        SingleLLNode head = obj.createSingleLL(1);
        obj.insertUniversal(2,2);
        obj.insertUniversal(3,3);
        obj.insertUniversal(4,4);
        obj.insertUniversal(5,5);

//        obj.traverseLinkedList(head);

//        int pos = obj.searchInLinkedList(head, 4);
//        System.out.println(pos);
//        obj.traverseLinkedList(head);
//
//        int delPos = obj.deleteEleFromLinkedList(head, 4);
//        System.out.println(delPos);
//        obj.traverseLinkedList(head);
//        sql server 2014 developer edition
        // sqlservertutorial se download sample database
//        indexing
//        query optimization
//        select command fast performance
//        1 million data insertion
//        bulk upload
//        temp tabale
//        sql server indexing
//        stored procedure
//        running query through stored procedure
        // compiler design  background

        obj.deleteEntireLL(head);
        obj.traverseLinkedList(head);
    }
}
