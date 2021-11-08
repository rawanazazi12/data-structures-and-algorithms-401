package challenge30.binaryTree;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    List<Integer> postOrderList = new ArrayList<>(); // FOR TEST
    List<Integer> inOrderList = new ArrayList<>();  // FOR TEST
    List<Integer> preOrderList = new ArrayList<>(); // FOR TEST


    public void postOrder(Node node) {

        if (node == null) {
            return;
        }

        // recur left
        postOrder(node.getLeft());

        // recur right
        postOrder(node.getRight());

        //  print the value
        System.out.print(node.getKey() + " ");
        postOrderList.add(node.getKey());
    }

    public void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.getLeft());

        System.out.print(node.getKey() + " ");
        inOrderList.add(node.getKey());

        inOrder(node.getRight());

    }

    public void preOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.getKey() + " ");
        preOrderList.add(node.getKey());

        preOrder(node.getLeft());

        preOrder(node.getRight());
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}