public class DirectedGraphAdjMatrix {
    int vertex;
    int matrix[][];

    public DirectedGraphAdjMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination) {
        // add edge
        matrix[source][destination] = 1;
    }

    public void removeEdge(int source, int destination) {
        // remove edge
        matrix[source][destination] = 0;
    }

    public void addVertex() {
        int newSize = vertex + 1;
        int[][] newMatrix = new int[newSize][newSize];

        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }

        matrix = newMatrix;
        vertex = newSize;
    }

    public boolean isConnected(int v1, int v2) {
        return matrix[v1][v2] == 1;
    }


    public void printGraph() {

        for (int i = 0; i < vertex; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedGraphAdjMatrix graph = new DirectedGraphAdjMatrix(6);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        graph.addEdge(4, 3);
        graph.addEdge(5, 3);
        graph.addEdge(5, 4);
        graph.printGraph();
        System.out.println();
        System.out.println("After Removing");
        graph.removeEdge(4, 3);
        graph.printGraph();
        System.out.println();
        System.out.println("After Adding Vertex");
        graph.addVertex();
        graph.addEdge(3, 6);
        graph.printGraph();
    }
}
