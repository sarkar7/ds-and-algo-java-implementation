package com.sarkar.dsa.ds.tree;

/**
 *
 * Restrictions
 * ============
 * 1. All the nodes of left sub-tree should be less than the root.
 * 2. All the nodes of right sub-tree should be greater than the root.
 * 3. All the nodes are unique
 *
 */

public class BinarySearchTree {

    private T_Node root;

    public BinarySearchTree(int data) {
        if (data == 0) throw new RuntimeException("Root can't be zero!");
        this.root = new T_Node(data);
    }

    public void insert(int data) {
        add(root, data);
    }

    private T_Node add(T_Node root, int data) {
        if (data == 0) throw new RuntimeException("Node value can't be zero!");
        if (root == null) return new T_Node(data);

        if (data < root.getValue()) {
            root.setLeft(add(root.getLeft(), data));
        } else if (data > root.getValue()) {
            root.setRight(add(root.getRight(), data));
        }
        return root;
    }

    public void inOrder() {
        inOrder(this.root);
    }

    public void preOrder() {
        preOrder(this.root);
    }

    public void postOrder() {
        postOrder(this.root);
    }

    private void inOrder(T_Node root) {
        if (root == null) return;
        inOrder(root.getLeft());
        System.out.print(root.getValue() + " ");
        inOrder(root.getRight());
    }

    private void preOrder(T_Node root) {
        if (root == null) return;
        System.out.print(root.getValue() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    private void postOrder(T_Node root) {
        if (root == null) return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    public int getMin() {
        return getMinRec(this.root);
    }

    public int getMax() {
        return getMaxRec(this.root);
    }

    private int getMaxRec(T_Node root) {
        if (root.getRight() == null) return root.getValue();
        return getMaxRec(root.getRight());
    }

    private int getMin(T_Node root) {
        while(root != null) {
            if (root.getLeft() == null) return root.getValue();
            root = root.getLeft();
        }
        return 0;
    }

    private int getMinRec(T_Node root) {
        if (root.getLeft() == null) return root.getValue();
        return getMinRec(root.getLeft());
    }

}
