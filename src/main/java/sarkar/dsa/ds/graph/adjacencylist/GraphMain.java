package sarkar.dsa.ds.graph.adjacencylist;

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        System.out.println("Graph1:");
        g.printGraph();

        /*
        System.out.println("BFS traversal of Graph1 : " + bfs(g));
        System.out.println();

        Graph g2 = new Graph(5);
        g2.addEdge(0,1);
        g2.addEdge(0,4);
        g2.addEdge(1,2);
        g2.addEdge(3,4);
        System.out.println("Graph2:");
        g2.printGraph();
        System.out.println("BFS traversal of Graph2 : " + bfs(g2));
        */
    }
}
