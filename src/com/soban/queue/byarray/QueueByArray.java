package com.soban.queue.byarray;

import com.soban.exceptions.QueueEmptyException;
import com.soban.exceptions.QueueFullException;

public class QueueByArray {

    int[] arr;
    int startOfQueue;
    int endOfQueue;

    QueueByArray(int size){
        this.arr = new int[size];
        this.startOfQueue = -1;
        this.endOfQueue = 0;
    }

    //create queue

    // enqueue
    public int enQueue(int val){
        if(this.isFull())
            throw new QueueFullException("Queue full");
        else if(this.isFull()){

        }
        else {

        }
        this.arr[endOfQueue] = val;
        endOfQueue++;
        return val;
    }
    // dequeue
    public int dequeue(){
        if(this.isEmpty())
            throw new QueueEmptyException("Queue Empty");
        int firstEle = this.arr[startOfQueue];
        for(int i = 0; i< endOfQueue; i++){
            this.arr[i] = this.arr[i+1];
        }
        return firstEle;
    }
    // peek in queue
    public int peek(){
        return this.arr[startOfQueue];
    }

    // is empty
    public boolean isEmpty(){
        return (this.startOfQueue == -1) ? true : false;
    }

    // is full
    public boolean isFull(){
        return (this.endOfQueue != 0) ? true : false;
    }
    // delete queue

    public static void main(String[] args) {

        QueueByArray queue = new QueueByArray(10);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

//        for(int i = 0; i< queue.arr.length; i++){
//            queue.enQueue(i);
//        }

        queue.enQueue(1);
        queue.enQueue(2);
        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());


    }
}
