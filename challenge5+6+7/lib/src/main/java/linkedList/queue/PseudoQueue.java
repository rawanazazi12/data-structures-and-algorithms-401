package linkedList.queue;

import linkedList.stack.Stack;

public class PseudoQueue {

    public Stack firstStack = new Stack();
    public Stack secondStack = new Stack();

    public PseudoQueue(Stack firstStack, Stack secondStack) {
        this.firstStack = firstStack;
        this.secondStack = secondStack;
    }

    public PseudoQueue() {

    }

    public void enqueue(String data) {

        firstStack.push(data);
    }

    public String dequeue() {

        if (firstStack.isEmpty()) {
            return("Empty");
        } else {
            while (firstStack.top != null) {
                secondStack.push(firstStack.pop());
            }
            secondStack.pop();
            while (secondStack.top != null) {
                firstStack.push(secondStack.pop());
            }
        }

      return"";
    }

    @Override
    public String toString() {
        return firstStack.toString();
    }
}
