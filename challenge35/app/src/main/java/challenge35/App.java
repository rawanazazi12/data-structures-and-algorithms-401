/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge35;

import java.util.Arrays;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Challenge 35

        Graph<String> graph = new Graph<>();
        Node<String> node1 = graph.addNode("John");
        Node<String> node2 = graph.addNode("Sara");
        Node<String> node3 = graph.addNode("Michel");
        Node<String> node4 = graph.addNode("Lia");
        Node<String> node5 = graph.addNode("William");
        graph.addEdge(node1, node2);
        graph.addEdge(node2, node5);
        graph.addEdge(node1, node3);
        graph.addEdge(node3, node4);
        graph.addEdge(node1, node2, 5.00);
        graph.addEdge(node2, node5, 10.00);
        List<Node<String>> group1 = Arrays.asList(node1, node2, node5);
        List<Node<String>> group2 = Arrays.asList(node1, node3, node4);
        List<Node<String>> group3 = List.of(node1);
        List<Node<String>> group4 = Arrays.asList(node4, node5);
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);
        System.out.println(group4);

        System.out.println(graph.getSize());
        System.out.println(graph.getNode());
        System.out.println(graph.getNeighbors(node1));
        System.out.println(graph.getNeighbors(node3));



        // challenge 38

        Graph<String> graphTest2 = new Graph<>();
        Node<String> nodeA = graphTest2.addNode("A");
        Node<String> nodeB = graphTest2.addNode("B");
        Node<String> nodeC = graphTest2.addNode("C");
        Node<String> nodeD = graphTest2.addNode("D");
        Node<String> nodeE = graphTest2.addNode("E");
        Node<String> nodeF = graphTest2.addNode("F");
        Node<String> nodeG = graphTest2.addNode("G");
        Node<String> nodeH = graphTest2.addNode("H");

        graphTest2.addEdge(nodeA, nodeB);
        graphTest2.addEdge(nodeA, nodeD);
        graphTest2.addEdge(nodeB, nodeD);
        graphTest2.addEdge(nodeB, nodeC);
        graphTest2.addEdge(nodeC, nodeG);
        graphTest2.addEdge(nodeD, nodeE);
        graphTest2.addEdge(nodeD, nodeH);
        graphTest2.addEdge(nodeD, nodeF);
        graphTest2.addEdge(nodeH, nodeF);

        System.out.println(graphTest2.depthFirst(nodeA).toString());

    }


}



