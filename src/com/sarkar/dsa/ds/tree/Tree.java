package com.sarkar.dsa.ds.tree;

public class Tree {

    private T_Node root = null;

    // Root - Left - Right
    public static void preOrderTraversal(T_Node root) {
        if (root == null) return;
        System.out.print(root.getValue() + " ");
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }

    // Left - Root - Right
    public static void inOrderTraversal(T_Node root) {
        if (root == null) return;
        inOrderTraversal(root.getLeft());
        System.out.print(root.getValue() + " ");
        inOrderTraversal(root.getRight());
    }

    // Left - Right - Root
    public static void postOrderTraversal(T_Node root) {
        if (root == null) return;
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    public static int getHeight(T_Node root) {
        if (root == null) return -1;
        int leftSubTreeHeight = getHeight(root.getLeft());
        int rightSubTreeHeight = getHeight(root.getRight());
        if (leftSubTreeHeight > rightSubTreeHeight) return leftSubTreeHeight + 1;
        return rightSubTreeHeight + 1;
    }

    public static int getSize(T_Node root) {
        if (root == null) return 0;
        return getSize(root.getLeft()) + getSize(root.getRight()) + 1;
    }

    public static void levelOrderTraversal(T_Node root) {

    }

}
