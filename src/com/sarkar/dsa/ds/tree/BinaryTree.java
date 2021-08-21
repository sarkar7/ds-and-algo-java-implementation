package com.sarkar.dsa.ds.tree;

public class BinaryTree {

    public boolean isPBT(int count) {
        count = count + 1;

        // Loop to check the count is in the form of 2^(n-1)
        while (count % 2 == 0) {
            count = count / 2;
        }

        return count == 1;
    }

    /*
    public Node add(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        // Condition when count of left sub-tree nodes is equal to the count of right sub-tree nodes
        if (root.rCount == root.lCount) {
            root.left = add(root.left, data);
            root.lCount += 1;
        }

        // Condition when count of left sub-tree nodes is greater than the right sub-tree nodes
        else if (root.rCount < root.lCount) {

            // Condition when left Sub-tree is Perfect Binary Tree then Insert in right sub-tree.
            if (isPBT(root.lCount)) {
                root.right = add(root.right, data);
                root.rCount += 1;
            }

            //If Left Sub-tree is not Perfect Binary Tree then Insert in left sub-tree
            else {
                root.left = add(root.left, data);
                root.lCount += 1;
            }
        }
        return root;
    }

    // Function for inorder Traversal of tree.
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }
    */

}
