package linkedList.stack;

import linkedList.Node;

public class CharNode {
    public Character data;
    private CharNode next;

    public CharNode(Character data) {
        this.data = data;
    }

    public Character getData() {
        return data;
    }

    public void setData(Character data) {
        this.data = data;
    }

    public CharNode getNext() {
        return next;
    }

    public void setNext(CharNode next) {
        this.next = next;
    }
}
