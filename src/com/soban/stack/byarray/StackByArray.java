package com.soban.stack.byarray;

public class StackByArray {
    int[] arr;
    int topOfStack;

    StackByArray(int size){
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("Created new Stack of size:" +size);
    }

    // push
    public int push(int val){
        if(this.isStackFull())
            throw new StackFullException("Stack Full");
        else{
            this.arr[this.topOfStack + 1] = val;
            System.out.println("Inserting " + val + " in the array");
            topOfStack++;
        }
        return this.arr[this.topOfStack];
    }
    // pop
    public void pop(){
        if(this.isStackEmpty())
            throw new StackEmptyException("Stack Empty");
        else
            topOfStack--;
        }

    // peek
    public int peek(){
        if(this.isStackEmpty())
            throw new StackEmptyException("Stack Empty");
        return this.arr[topOfStack];
    }
    // is stack full
    public boolean isStackFull(){
        return (this.topOfStack == this.arr.length - 1) ? true : false;
    }

    // is stack empty
    public boolean isStackEmpty(){
        return (this.topOfStack == -1) ? true : false;
    }

    public static void main(String[] args) {

        StackByArray stack = new StackByArray(10);
        System.out.println(stack.isStackEmpty());
        for(int i = 0; i <= 9; i++){
            stack.push(i);
        }

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());
    }
}

