package linkedList.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxStack {
    private static MaxStack maxStack;
    private static MaxStack stack;
    int size;
    //    private static MaxStack maxSt;
//    private static MaxStack st;
    public Node top;

    public void push(int data) {
        if (isEmpty()) {
            Node node = new Node(data);
            top = node;
        } else {
            Node node = new Node(data);
            node.setNext(top);
            top = node;
            size++;
        }
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("The Stack is Empty");
        }
        else {
            int data = top.getData();
            top = top.getNext();
            size--;
            return data;


        }
    }
//

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("The Stack is Empty");
        } else {
            return top.getData();
        }

    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }
//
//    public int getMax(MaxStack mainStack) throws Exception {
//        int max=0;
//
//        MaxStack trackStack = new MaxStack();
//
//     if (mainStack.isEmpty()){
//         System.out.println("the stack is empty");
//     }else {
//         while (!mainStack.isEmpty()) {
//             trackStack.push(mainStack.peek());
//
//             mainStack.pop();
//
//             if (trackStack.peek() < mainStack.peek()) {
//                 trackStack.pop();
//                 trackStack.push(mainStack.peek());
//                 if (trackStack.peek()>mainStack.peek()){
//                     mainStack.pop();
//                 }
//
//             } else {
//                 max = trackStack.peek();
//                 //                 System.out.println(max);
//                 break;
//             }
//
//         }
//     }
//        return max;


        MaxStack st = new MaxStack();
    MaxStack maxSt = new MaxStack();
    public static void push(int data) throws Exception {

        int max = data;

        if (!maxStack.isEmpty() && max < maxStack.peek()) {
            max = maxStack.peek();
        }

        stack.push(data);
        maxStack.push(max);
    }

    public void pop() {
        stack.pop();
        maxStack.pop();
    }

    public int getMax() throws Exception {
        return maxStack.peek();
    }



    @Override
    public String toString() {
        String stackValue = "Stack { ";
        Node node = top;
        while (node != null){
            stackValue += node.getData() + " => ";
            node= node.getNext();
        }
        stackValue += "Null }";
        return stackValue;
    }


    static MaxStack mainStack = new MaxStack ();

//    static void push(int x){
//        mainStack.push(x);
//    }

    public int getMax() throws Exception {
        int max = mainStack.peek();
        while(mainStack.size!=0){

            if(max<mainStack.peek()){
                max = mainStack.peek();
            }


            mainStack.pop();
        }
        return max;
    }

//    static void pop(){
//        mainStack.pop();
//    }
}
