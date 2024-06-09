package JobsheetGraph;

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1,3);
        g.addEdge(0, 2,2);
        g.addEdge(1, 2,1);
        g.addEdge(2, 0,7);
        g.addEdge(2, 3,5);
        g.addEdge(6, 7,7);

        g.print();

        boolean hasEdge = g.getEdge(0, 1);
        System.out.println("Apakah ada edge diantara 0 dan 1? " + hasEdge);
        g.getDegree();
    
    }
}
