package sarkar.dsa.algo.recursion;

public class Runner {

    static int sum = 0;
    public static int doRecursion(Node node) {
        if(node != null) {
            sum += node.data;

            //To make it visually attractive
            System.out.print(node.data);
            if(node.next != null) {
                System.out.print(" -> ");
            } else {
                System.out.println();
            }

            node = node.next;
            doRecursion(node);

        }
        return sum;
    }


    public static void main(String[] args) {

        /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        */

        LinkedList tree = new LinkedList();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);


        tree.traverseRecursively();

    }

}
