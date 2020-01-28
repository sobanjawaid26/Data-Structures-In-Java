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
    public SingleLLNode insertIntoSLL(int data, int location){
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
     * Insert an element at the start of LL
     * @param data
     * @return
     */
    public SingleLLNode insertAtBeginning(int data){
        SingleLLNode node = new SingleLLNode(data);
        node.setNext(head);
        head = node;
        size++;
        return head;
    }

    /**
     * Insert an element at the end of LL
     * @param data
     * @return
     */
    public SingleLLNode insertAtEnd(int data){
        SingleLLNode node = new SingleLLNode(data);
        node.setNext(null);
        tail.setNext(node);
        tail = node;
        size++;
        return tail;
    }

    /**
     * Insert an element at a given location
     * @param data
     * @param location
     * @return
     */
    public SingleLLNode insertAtGivenLocation(int data, int location){
        SingleLLNode newNode = new SingleLLNode(data);
        SingleLLNode node = null;
        for (int i = 1; i<= location; i++)
            node = head.getNext();
        if(node == null){
            head.setNext(newNode);
            newNode.setNext(null);
            tail = newNode;
        }else{
            newNode.setNext(node.getNext());
            node.setNext(newNode);
        }
        size++;
        return head;
    }

    /**
     * Traverse Linked List
     * @param head
     */
    public void traverseLinkedList(SingleLLNode head){
        SingleLLNode node = head;
        while(node.getNext() != null){
            System.out.println(node.getData());
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
     * @param head
     * @return
     */
    public SingleLLNode deleteEntireLL(SingleLLNode head){
        head = null;
        tail = null;
        return head;
    }

    public static void main(String[] args) {
        SingleLL obj = new SingleLL();
        SingleLLNode head = obj.createSingleLL(1);
        SingleLLNode tail = obj.insertAtEnd(3);
        obj.insertAtGivenLocation(2,2);
        obj.insertAtGivenLocation(3,3);
        obj.insertAtGivenLocation(4,4);
        obj.insertAtGivenLocation(5,5);
        obj.insertAtGivenLocation(6,6);
        obj.insertAtGivenLocation(7,7);
        obj.insertAtGivenLocation(8,8);
        obj.insertAtGivenLocation(9,9);

//        obj.traverseLinkedList(head);

        int pos = obj.searchInLinkedList(head, 8);
        System.out.println(pos);

        int delPos = obj.deleteEleFromLinkedList(head, 8);
        System.out.println(delPos);
    }
}
