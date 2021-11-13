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
}

