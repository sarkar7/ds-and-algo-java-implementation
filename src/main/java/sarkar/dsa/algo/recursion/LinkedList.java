package sarkar.dsa.algo.recursion;

public class LinkedList {

    private Node head;
    private int sum = 0;

    public LinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return this.head;
    }

    public void add(int data) {
        addRecursively(data);
    }

    private void addRecursively(int data)
    {
        if (head == null) {
            this.head = new Node(data);
        } else {

            addRecursively(data);
        }
    }

    public void traverseRecursively() {
        if (head != null) {
            System.out.print( head.data + " ");
            head = head.next;
            traverseRecursively();
        }else{
            System.out.println("List is empty!");
        }
    }

}
