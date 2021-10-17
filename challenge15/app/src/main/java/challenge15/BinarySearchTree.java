package challenge15;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>  {

    public void add ( T data){
        if (isEmpty()){
            root = (BinaryNode<T>) new BinaryNode(data);
        } else {
            addHelper(root, data);
        }
    }


    private void addHelper(BinaryNode <T> root, T data){
        BinaryNode <T> binaryNode = new BinaryNode<>(data);
        if (data.compareTo(root.getData()) < 0 ) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(binaryNode);
            }else {
                addHelper(root.getLeftNode(),data);
            }


        }else if (data.compareTo(root.getData()) > 0 ){
            if (root.getRightNode() == null){
                root.setRightNode(binaryNode);
            }else {
                addHelper(root.getRightNode(), data);
            }
        }
    }

    public boolean contains(T data){

        while (root != null) {
            if (data.compareTo(root.getData()) > 0 )
                root = root.getRightNode();
            else if (data.compareTo(root.getData()) < 0 )
                root = root.getLeftNode();
            else
                return true;
        }
        return false;
    }




    @Override
    public String toString() {
        return super.toString();
    }
}





