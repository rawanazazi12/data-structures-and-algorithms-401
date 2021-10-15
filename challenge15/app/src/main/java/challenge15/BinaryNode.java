package challenge15;

public class BinaryNode<T> {
    private T data;
    private BinaryNode<T> leftBinaryNode;
    private BinaryNode<T> rightBinaryNode;

    public BinaryNode(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryNode<T> getLeftNode() {
        return leftBinaryNode;
    }

    public void setLeftNode(BinaryNode<T> leftBinaryNode) {
        this.leftBinaryNode = leftBinaryNode;
    }

    public BinaryNode<T> getRightNode() {
        return rightBinaryNode;
    }

    public void setRightNode(BinaryNode<T> rightBinaryNode) {
        this.rightBinaryNode = rightBinaryNode;
    }
}
