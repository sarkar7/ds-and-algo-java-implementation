package com.sarkar.dsa.ds.tree;

public class Runner {

    public static void main(String[] args) {

        T_Node root  = new T_Node(1);
        T_Node node2 = new T_Node(2);
        T_Node node3 = new T_Node(3);
        T_Node node4 = new T_Node(4);
        T_Node node5 = new T_Node(5);
        T_Node node6 = new T_Node(6);
        T_Node node7 = new T_Node(7);

        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);

        //Tree.preOrderTraversal(root);

        System.out.println(Tree.getSize(root));
        System.out.println(Tree.getHeight(root));

    }
}