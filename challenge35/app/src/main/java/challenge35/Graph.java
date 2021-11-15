package challenge35;

import java.util.*;

public class Graph<V> {

    HashMap<Node<V>, HashMap<Node<V>, Double>> nodes = new HashMap<>();

    public Node<V> addNode(V value) {
        Node<V> newNode = new Node<V>(value);
        HashMap<Node<V>, Double> valueHashMap = new HashMap<>();
        nodes.put(newNode, valueHashMap);
        return newNode;
    }

    public void addEdge(Node<V> A, Node<V> B) {
        if (nodes.containsKey(A) && nodes.containsKey(B)) {
            nodes.get(A).put(B, null);
        }
    }


    public void addEdge(Node<V> A, Node<V> B, Double W) {
        if (nodes.containsKey(A) && nodes.containsKey(B)) {
            nodes.get(A).put(B, W);
        }
    }

    public List<Node> getNode() {
        return new ArrayList(nodes.keySet());
    }

    public List<Node<V>> getNeighbors(Node<V> A) {
        return new ArrayList<>(nodes.get(A).keySet());
    }

    public int getSize() {
        return nodes.size();
    }


    // challenge 36
    public List<Node<V>> breadthFirst(Node<V> data) {
        List<Node<V>> nodes = new ArrayList<>();
        Queue<Node<V>> breadth = new LinkedList<>();
        Set<Node<V>> visited = new HashSet<>();

        breadth.add(data);
        visited.add(data);
        while (!breadth.isEmpty()) {
            Node<V> front = breadth.remove();
            nodes.add(front);
            if (this.getNeighbors(front).size() > 0) {
                for (Object neighbor : this.getNeighbors(front)) {
                    if (!visited.contains(neighbor)) {
                        visited.add((Node<V>) neighbor);
                        breadth.add((Node<V>) neighbor);
                    }
                }
            }
        }
        return nodes;
    }


    // challenge 37

    public String businessTrip(Graph graph, List<Node<V>> citiesName) {
        Double cost = 0.0;
        boolean flag = false;
        for (int i = 0; i < citiesName.size() - 1; i++) {
            if (graph.nodes.containsKey(citiesName.get(i)) && this.nodes.get(citiesName.get(i)).containsKey(citiesName.get(i + 1))) {
                flag = true;
                cost += this.nodes.get(citiesName.get(i)).get(citiesName.get(i + 1));
            }
        }
        String result = flag + ", $" + cost;
        return result;
    }
}

