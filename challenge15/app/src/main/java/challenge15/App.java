/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge15;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        BinarySearchTree <Integer> binaryTree = new BinarySearchTree<>();
        binaryTree.add(1);
        binaryTree.add(5);
        binaryTree.add(2);
        binaryTree.add(7);
        binaryTree.add(0);
        binaryTree.postOrderTraversal();
        binaryTree.toString();
        System.out.println(binaryTree.contains(2));
        System.out.println(binaryTree.contains(10));

    }
}
