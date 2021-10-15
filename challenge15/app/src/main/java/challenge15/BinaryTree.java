package challenge15;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree <T>{
    public BinaryNode<T> root;
    List<T> postOrderList = new ArrayList<>();
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
                    traversePostOrder(root);
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

    }

    private void traversePostOrder (BinaryNode <T> root){
        if (root.getLeftNode() != null){
            traversePostOrder(root.getLeftNode());
        }
        if (root.getRightNode() != null){
            traversePostOrder(root.getRightNode());
        }
        System.out.println(root.getData() + " => ");
        postOrderList.add(root.getData());
    }



    public boolean isEmpty(){

        return root==null;
    }


}
