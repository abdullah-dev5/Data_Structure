import java.util.*;

public class DirectedGraphList {

    private HashMap<Integer, ArrayList<Integer>> map;
    private int numOfEdges;
    private int numOfVertics;

    public DirectedGraphList() {
        map = new HashMap<Integer, ArrayList<Integer>>();
    }

    public int getNumVertics() {
        return numOfVertics;
    }

    public int getNumEdges() {
        return numOfEdges;
    }

    public void addVertex(int vertex) {
        if (!map.containsKey(vertex)) {
            map.put(vertex, new ArrayList<Integer>());
            numOfVertics++;
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
        numOfEdges++;
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
            numOfEdges--;
        }
    }

    public void removeVertex(int vertex) {
        if (map.containsKey(vertex)) {
            map.remove(vertex);

            // Hashmap.keyset()
            // Return Value: The method returns a set having the keys of the hash map.
            for (int key : map.keySet()) {
                map.get(key).remove(Integer.valueOf(vertex));
            }
            numOfVertics--;
        }
    }
     ArrayList<Integer> getNeighbor(int vertex)
     {
            ArrayList<Integer> neighbors =  new ArrayList<>(getAdjacentVertices(vertex));

         for (int i = 0; i < map.size(); i++) {

            if (map.get(i).size() > 0) {
                for (int j = 0; j < map.get(i).size(); j++) {
                    if (map.get(i).get(j) == vertex) {
                    neighbors.add(i);
                    }
                }
            }
        }   

            return neighbors;
     }

     void printNeighbor(int vertex)
     {
        System.out.print("List of Neighbors of "+vertex+" --> ");
        for(int print : getNeighbor(vertex))
        {
            System.out.print(print+" ");
        }
        System.out.println();
     }


    void outgoingDegree(int vertex) {

        ArrayList<Integer> outGoing = getAdjacentVertices(vertex);
        System.out.print("Outgoing Degree of " + vertex + " --> ");
        for (int key : outGoing) {
            System.out.print(key + "  ");
        }
        System.out.println();
    }

    void inComingDegree(int vertex) {
        int count = 0;
        for (int i = 0; i < map.size(); i++) {

            if (map.get(i).size() > 0) {
                for (int j = 0; j < map.get(i).size(); j++) {
                    if (map.get(i).get(j) == vertex) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Incoming Degree of " + vertex + " : " + count);
    }

    public void printGraph() {
        for (int vertex : map.keySet()) {
            System.out.print(vertex + " --> ");
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
        graph.addVertex(6);
        graph.addEdge(3, 6);
        graph.addEdge(6, 5);

        graph.printGraph();
        graph.getAdjacentVertices(5);

        graph.outgoingDegree(5);
        graph.inComingDegree(3);

        graph.inComingDegree(5);
        System.out.println(graph.getNumVertics());

        graph.printNeighbor(5);
       
    }
}
