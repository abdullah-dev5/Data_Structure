import java.util.*;

public class GraphUsingAdjList {

    private HashMap<Integer, ArrayList<Integer>> map;

    public GraphUsingAdjList() {
        map = new HashMap<Integer, ArrayList<Integer>>();
    }

    public void addVertex(int vertex) {
        if (!map.containsKey(vertex)) {
            map.put(vertex, new ArrayList<Integer>());
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        if (!map.containsKey(vertex1)) {
            addVertex(vertex1);
        }
        if (!map.containsKey(vertex2)) {
            addVertex(vertex2);
        }
        map.get(vertex1).add(vertex2);
        map.get(vertex2).add(vertex1); // remove this line if you want a directed graph
    }

    public ArrayList<Integer> getAdjacentVertices(int vertex) {
        if (map.containsKey(vertex)) {
            return map.get(vertex);
        }
        return null;
    }

    public void removeEdge(int vertex1, int vertex2) {
        if (map.containsKey(vertex1) && map.containsKey(vertex2)) {
            map.get(vertex1).remove(Integer.valueOf(vertex2));
            map.get(vertex2).remove(Integer.valueOf(vertex1)); // remove this line if you want a directed graph
        }
    }

    public void removeVertex(int vertex) {
        if (map.containsKey(vertex)) {
            ArrayList<Integer> adjacentVertices = map.get(vertex);
            for (int adjacentVertex : adjacentVertices) {
                removeEdge(vertex, adjacentVertex);
            }
            map.remove(vertex);
        }
    }





    
    public void printGraph() {
        for (int vertex : map.keySet()) {
            System.out.print(vertex + ": ");
            for (int adjacentVertex : map.get(vertex)) {
                System.out.print(adjacentVertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphUsingAdjList graph = new GraphUsingAdjList();
        graph.addVertex(5);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addVertex(4);
        graph.addEdge(4, 1);
        graph.addEdge(4, 3);
        graph.addEdge(4, 2);
        System.out.println();
        graph.printGraph();
        graph.removeVertex(5);
        graph.removeEdge(4, 3);
        System.out.println();

        graph.printGraph();
    }
}