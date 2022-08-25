package sarkar.dsa.ds.tree;

public class BinaryTree {

    public boolean isPBT(int count) {
        count = count + 1;

        // Loop to check the count is in the form of 2^(n-1)
        while (count % 2 == 0) {
            count = count / 2;
        }
        return count == 1;
    }


    public T_Node add(T_Node root, int data) {

        if (root == null) {
            return new T_Node(data);
        }

        // Condition when count of left sub-tree nodes is equal to the count of right sub-tree nodes
        if (root.getRightCount() == root.getLeftCount()) {
            root.setLeft(add(root.getLeft(), data));
            root.setLeftCount(root.getLeftCount()+1);
        }

        // Condition when count of left sub-tree nodes is greater than the right sub-tree nodes
        else if (root.getRightCount() < root.getLeftCount()) {

            // Condition when left Sub-tree is Perfect Binary Tree then Insert in right sub-tree.
            if (isPBT(root.getLeftCount())) {
                root.setRight(add(root.getRight(), data));
                root.setRightCount(root.getLeftCount()+1);
            }

            //If Left Sub-tree is not Perfect Binary Tree then Insert in left sub-tree
            else {
                root.setLeft(add(root.getLeft(),data));
                root.setLeftCount(root.getLeftCount()+1);
            }
        }
        return root;
    }

    // Function for inorder Traversal of tree.
    public void inorder(T_Node root) {
        if (root != null) {
            inorder(root.getLeft());
            System.out.print(root.getValue() + " ");
            inorder(root.getRight());
        }
    }

}
