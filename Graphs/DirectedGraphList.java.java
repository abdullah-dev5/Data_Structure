import java.util.*;

public class DirectedGraphList {

    private HashMap<Integer, ArrayList<Integer>> map;

    public DirectedGraphList() {
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
        }
    }

    public void removeVertex(int vertex) {
        if (map.containsKey(vertex)) {
            // Remove the vertex from the map
            map.remove(vertex); 
            // Hashmap.keyset()  
            // Return Value: The method returns a set having the keys of the hash map.
            for (int key : map.keySet()) {
                map.get(key).remove(Integer.valueOf(vertex));
            }
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
        DirectedGraphList graph = new DirectedGraphList();
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        graph.addEdge(4, 3);
        graph.addEdge(5, 3);
        graph.addEdge(5, 4);

        graph.printGraph();
        System.out.println();
        graph.removeVertex(3);
        graph.printGraph();
    }
}
