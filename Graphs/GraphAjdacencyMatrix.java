public class GraphAjdacencyMatrix {
    int vertex;
    int matrix[][];

    public GraphAjdacencyMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination) {
        // add edge
        matrix[source][destination] = 1;
        // add back edge for undirected graph
        matrix[destination][source] = 1;
    }

    public void removeEdge(int source, int destination) {
        // remove edge
        matrix[source][destination] = 0;
        // remove back edge for undirected graph
        matrix[destination][source] = 0;
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

    public void removeVertex(int v) {
        // Check if the vertex index is valid
        if (v < 0 || v >= vertex) {
            System.out.println("Invalid vertex index");
            return;
        }

        // Calculate the new size of the matrix after removing the vertex
        int newSize = vertex - 1;
        int[][] newMatrix = new int[newSize][newSize];

        int newRow = 0, newCol;

        // Iterate over the original matrix
        for (int i = 0; i < vertex; i++) {
            // Skip the row corresponding to the removed vertex
            if (i == v)
                continue;

            newCol = 0;

            // Iterate over the columns of the original matrix
            for (int j = 0; j < vertex; j++) {
                // Skip the column corresponding to the removed vertex
                if (j == v)
                    continue;

                // Copy the value from the original matrix to the new matrix
                newMatrix[newRow][newCol++] = matrix[i][j];
            }

            // Move to the next row in the new matrix
            newRow++;
        }

        // Update the matrix and vertex count with the new values
        matrix = newMatrix;
        vertex = newSize;
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
        GraphAjdacencyMatrix graph = new GraphAjdacencyMatrix(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
        System.out.println();
        System.out.println("After Removing");
        graph.removeEdge(0, 4);
        graph.printGraph();

        System.out.println();
        System.out.println("After Adding Vertex");
        graph.addVertex();
        graph.printGraph();
    }
}
