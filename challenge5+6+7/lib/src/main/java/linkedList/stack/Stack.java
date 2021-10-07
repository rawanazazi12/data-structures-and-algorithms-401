package linkedList.stack;

public class Stack {

    private StackNode top;

    public void push (String data){
     if (isEmpty()){
         StackNode node = new StackNode(data);
         top = node ;
     }else {
         StackNode node = new StackNode(data);
         node.setNext(top);
         top = node ;
     }
    }

    public String pop() {
        try{
        if (isEmpty()){
            throw new Exception("The Stack is Empty");
        }
        else {
            String data = top.getData();
            top = (StackNode) top.getNext();
            return data;

        }
        }catch (Exception e){
           return (e.getMessage());
        }

    }

    public String peek(){
       try {
           if (isEmpty()) {
               throw new Exception("The Stack is Empty");
           } else {
               return top.getData();
           }
       } catch (Exception e){
           return e.getMessage();
       }
    }

    public boolean isEmpty(){
           if (top == null) {
               return true;
           }else{
               return false;
           }
    }

    @Override
    public String toString() {
        String stackValue = "Stack { ";
        StackNode node = top;
        while (node != null){
            stackValue += node.getData() + " => ";
            node= (StackNode) node.getNext();
        }
        stackValue += "Null }";
        return stackValue;
    }
}
