package linkedList.stack;

public class CharStack {

        public CharNode top;

        public void push (Character data){
            if (isEmpty()){
                CharNode node = new CharNode(data);
                top = node ;
            }else {
                CharNode node = new CharNode(data);
                node.setNext(top);
                top = node ;
            }
        }

        public Character pop() throws Exception {
                if (isEmpty()) {
                    throw new Exception("The Stack is Empty");
                }
                else {
                    Character data = top.getData();
                    top = (CharNode) top.getNext();
                    return data;

                }
            }


        public Character peek() throws Exception {
                if (isEmpty()) {
                    throw new Exception("The Stack is Empty");
                } else {
                    return top.getData();
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
            CharNode node = top;
            while (node != null){
                stackValue += node.getData() + " => ";
                node= (CharNode) node.getNext();
            }
            stackValue += "Null }";
            return stackValue;
        }
    }

