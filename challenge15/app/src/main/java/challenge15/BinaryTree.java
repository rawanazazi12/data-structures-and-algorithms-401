package challenge15;

import org.checkerframework.checker.units.qual.A;

import java.util.*;

public class BinaryTree <T extends Comparable<T>>{
    public BinaryNode<T> root;
    List<Integer> postOrderList = new ArrayList<>();
    List<T> preOrderList = new ArrayList<>();
    List<T> inorderList = new ArrayList<>();


    // Inorder

    public void inorderTraversal() {
        try {
            if (isEmpty()) {
                throw new Exception("Tree is Empty");
            } else {
                traverseInorder(root);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    private void traverseInorder(BinaryNode<T> root){
        if (root.getLeftNode() != null){
            traverseInorder(root.getLeftNode());
        }
        System.out.println(root.getData() + " => ");
        inorderList.add(root.getData());

        if (root.getRightNode() != null){
            traverseInorder(root.getRightNode());
        }
    }

    //Preorder

    public void preorderTraversal(){
        try {
            if (isEmpty()) {
                throw new Exception("Tree is Empty");
            } else {
                traversePreorder(root);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void traversePreorder (BinaryNode <T> root){
        System.out.println(root.getData() + " => ");
        preOrderList.add(root.getData());

        if (root.getLeftNode() != null){
            traversePreorder(root.getLeftNode());
        }
        if (root.getRightNode() != null){
            traversePreorder(root.getRightNode());
        }
    }

    //Postorder

    public void postOrderTraversal (){
            try {
                if (isEmpty()) {
                    throw new Exception("Tree is Empty");
                } else {
                    traversePostOrder((BinaryNode<Integer>) root);
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

    }

    private void traversePostOrder (BinaryNode <Integer> root){
        if (root.getLeftNode() != null){
            traversePostOrder(root.getLeftNode());
        }
        if (root.getRightNode() != null){
            traversePostOrder(root.getRightNode());
        }
//        System.out.println(root.getData() + " => ");
        postOrderList.add(root.getData());
    }



    public boolean isEmpty(){

        return root==null;
    }


    public int findMaxvalue() {

        try {
            if (isEmpty()) {
                throw new Exception("Tree is Empty");
            } else {
                Integer max = (Integer) root.getData();

                traversePostOrder((BinaryNode<Integer>) root);

                for(int i = 0; i<postOrderList.size(); i++){
                    if(max <postOrderList.get(i)){
                        max = postOrderList.get(i);
                    }
                }
                return max;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

       return 0;
    }

    public ArrayList<Integer> breadthFirst(BinaryTree binaryTree)
    {
        if(isEmpty()){
            System.out.println("Tree is Empty");
            return null;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        ArrayList <Integer> values = new ArrayList<>();
        queue.add(binaryTree.root);
        while (!queue.isEmpty()) {
            BinaryNode tempNode = queue.poll();
            values.add((Integer) tempNode.getData());
            if (tempNode.getLeftNode() != null) {
                queue.add(tempNode.getLeftNode());
            }
            if (tempNode.getRightNode() != null) {
                queue.add(tempNode.getRightNode());
            }
        }
        return values;
    }



    public BinaryNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }
}
