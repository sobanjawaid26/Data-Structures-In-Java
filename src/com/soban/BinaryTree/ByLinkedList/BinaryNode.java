package com.soban.BinaryTree.ByLinkedList;

public class BinaryNode {

    int value;
    int height;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode() {
    }

    public BinaryNode(int value, int height, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.height = height;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
