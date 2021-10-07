package linkedList.queue;

public class Queue {

    private QueueNode front;
    private QueueNode rear;

    public void enqueue(String data) {
        if (isEmpty()) {
            QueueNode node = new QueueNode(data);
            front = node;
            rear = node;
        } else {
            QueueNode node = new QueueNode(data);
            rear.setNext(node);
            rear = node;
        }
    }

    public String dequeue(){
        try {
            if (isEmpty()) {
                throw new Exception("Queue is Empty");
            } else {
                String data = front.getData();
                front = (QueueNode) front.getNext();
                return data;
            }
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public String peek (){
        try {
            if (isEmpty()) {
                throw new Exception("Queue is Empty");
            } else {
                return front.getData();
            }
        }catch (Exception e){
            return e.getMessage();
        }

    }


    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String queueValue = "Queue { ";
        QueueNode node = front;
        while (node != null) {
            queueValue += node.getData() + " => ";
            node = (QueueNode) node.getNext();
        }
        queueValue += "Null }";
        return queueValue;

    }
}
