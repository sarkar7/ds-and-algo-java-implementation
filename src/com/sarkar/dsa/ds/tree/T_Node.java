package com.sarkar.dsa.ds.tree;

public class T_Node {
    private int value;
    private T_Node left;
    private T_Node right;
    private int rightCount;
    private int leftCount;

    T_Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public T_Node getLeft() {
        return left;
    }

    public void setLeft(T_Node left) {
        this.left = left;
    }

    public T_Node getRight() {
        return right;
    }

    public void setRight(T_Node right) {
        this.right = right;
    }

    public Integer getRightCount() {
        return rightCount;
    }

    public void setRightCount(int rightCount) {
        this.rightCount = rightCount;
    }

    public int getLeftCount() {
        return leftCount;
    }

    public void setLeftCount(int leftCount) {
        this.leftCount = leftCount;
    }
}
