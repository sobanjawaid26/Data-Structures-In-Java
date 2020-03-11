package com.soban.BinaryTree.ByArray;

import com.soban.exceptions.StackEmptyException;
import com.soban.exceptions.StackFullException;

public class BinaryTreeByArray {

    int arr[];
    int lastUsedIndex;

    BinaryTreeByArray(int size){
        arr = new int[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of size " + size + " has been created");
    }

    public boolean isTreeFull(){
        if(arr.length - 1 == lastUsedIndex)
            return true;
        else
            return false;
    }

    public void insert(int value){
        if(this.isTreeFull()){
            throw new StackFullException("Tree is full");
        }
        else{
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
        }
    }

    public void levelOrderTraversal(){
        for (int i = 0; i < lastUsedIndex; i++){
            System.out.println(arr[i]);
        }
    }

    public void preOrderTraversal(int index){
        if(index > lastUsedIndex){
            throw new StackEmptyException("Tree Empty");
        }
        else{
            System.out.println(arr[index]);
            preOrderTraversal(index * 2);
            preOrderTraversal(index * 2 + 1);
        }
    }

    public void postOrderTraversal(int index){
        if(index > lastUsedIndex){
            throw new StackEmptyException("Tree Empty");
        }
        else{
            postOrderTraversal(index * 2);
            postOrderTraversal(index + 2 + 1);
            System.out.println(arr[index]);
        }
    }

    public void inOrderTraversal(int index){
        if(index > lastUsedIndex){
            throw new StackEmptyException("Tree Empty");
        }
        else{
            inOrderTraversal(index * 2);
            System.out.println();
            inOrderTraversal(index * 2 + 1);
        }
    }

    //search
    public int search(int value){
        for(int i = 0; i < lastUsedIndex; i++){
            if(arr[i] == value);
            return i;
        }
        return -1;
    }
    //delete
    public int delete(int value){
        int searchLocation = search(value);
        if(searchLocation != -1){
            arr[searchLocation] = arr[lastUsedIndex];
            lastUsedIndex--;
            return searchLocation;
        }
        else{
            return -1;
        }
    }
    //deleteTree
    public void deleteTree(){
        try {
            arr = null;
            System.out.println("Tree has been deleted successfully !");
        }catch(Exception e){
            System.out.println("There was an error deleting the tree.");
        }
    }

}
