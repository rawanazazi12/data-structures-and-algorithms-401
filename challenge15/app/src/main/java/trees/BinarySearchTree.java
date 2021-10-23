package trees;

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


     public Integer findSum(){
         try {
             if (isEmpty()) {
                 throw new Exception("Tree is Empty");
             }else{
                 Integer sum = 0;
//                 traversePostOrder((BinaryNode<Integer>) root);
                 postOrderTraversal();
                 for (int i = 0; i<postOrderList.size(); i++){
                     if(postOrderList.get(i) % 2 == 1 ){
                         sum+=postOrderList.get(i);
                     }
                 }
                 return sum;
             }
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
         return 0;
     }

    @Override
    public String toString() {
        return super.toString();
    }
}





