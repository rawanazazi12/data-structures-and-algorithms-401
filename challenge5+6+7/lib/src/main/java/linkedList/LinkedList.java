package linkedList;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class LinkedList {
    public LinkedListNode head;
    public int size;

    public LinkedList() {
    }

    public void insert(String data) {

        if (head == null) {
            LinkedListNode node = new LinkedListNode(data);
            head = node;
            size++;
        } else {
            LinkedListNode current;
            current = head;
            while (current.getNext() != null) {
                current = (LinkedListNode) current.getNext();
            }
            LinkedListNode node = new LinkedListNode(data);
            current.setNext(node);
            size++;

        }

    }

    public boolean isIncluded(String data) {
        LinkedListNode node = head;
        while (node != null) {
            if (node.getData() == data) {
                return true;
            }
            node = (LinkedListNode) node.getNext();
        }
        return false;
    }

    public String toString() {
        String linkedListData = "";
        LinkedListNode node = head;
        while (node != null) {
            linkedListData += "{";
            linkedListData += node.getData();
            linkedListData += "}";
            linkedListData += " => ";
            node = (LinkedListNode) node.getNext();
        }
        linkedListData += "NULL";
        return linkedListData;
    }

    public void addNewNodeAtEnd(String data) {
        LinkedListNode node = new LinkedListNode(data);
        if (head == null) {
            head = node;
        } else {
            LinkedListNode last = head;
            while (last.getNext() != null) {
                last = (LinkedListNode) last.getNext();
            }
            last.setNext(node);
        }
        size++;
    }

    public void insertBefore(String referenceNodeData, String newNodeData) {
        LinkedListNode newNode = new LinkedListNode(newNodeData);
        if (head == null) {
            head = newNode;
        } else if (head.getData() == referenceNodeData) {
            newNode.setNext(head);
            head = newNode;
        } else if (isIncluded(referenceNodeData) == false) {
            System.out.println("The reference node you entered is not exist");
        } else {
            LinkedListNode temp = head;
            while (temp.getNext().getData() != referenceNodeData) {
                temp = (LinkedListNode) temp.getNext();
            }
            newNode.setNext((LinkedListNode) temp.getNext());
            temp.setNext(newNode);
        }
        size++;
    }

    public void insertAfter(String referenceNodeData, String newNodeData) {
        LinkedListNode newNode = new LinkedListNode(newNodeData);
        if (head == null) {
            head = newNode;
        } else if (isIncluded(referenceNodeData) == false) {
            System.out.println("The reference node you entered is not exist");
        } else {
            LinkedListNode temp = head;
            while (temp.getData() != referenceNodeData) {
                temp = (LinkedListNode) temp.getNext();
            }

            newNode.setNext((LinkedListNode) temp.getNext());
            temp.setNext(newNode);

        }
        size++;
    }

    // challenge 07

    public String kthFromEnd(int k) {
        int counter = 0;
        // setup our current
        LinkedListNode current = head;

        try {

            while (current != null) {
                current = (LinkedListNode) current.getNext();
                counter++;

            }
            int index = counter - k - 1;
            current = head;
            for (int i = 0; i < index; i++) {
                current = (LinkedListNode) current.getNext();
                if (k < 0 && counter != 1) {
                    throw new IndexOutOfBoundsException("k value out of boundaries");
                }

            }
            if (k > counter - 1 && counter != 1) {
                throw new IndexOutOfBoundsException("k value out of boundaries");
            } else if (counter == 1) {
                return "The Linked List size is 1";
            }

        } catch (IndexOutOfBoundsException e) {
            return e.getMessage();
        }

        return current.getData();

    }

    // Challenge08
    public LinkedList zipLists(@NotNull LinkedList x, LinkedList y) {
        LinkedList mergedList = new LinkedList();
        if (x.head == null && y.head == null) {
            System.out.println("The two lists are empty");

        } else if (y.head == null) {
            System.out.println("The second list is empty, here is The first list : ");
            mergedList = x;
            return mergedList;
        } else if (x.head == null) {
            System.out.println("The first list is empty, here is The second list : ");
            mergedList = y;
            return mergedList;
        } else {
            LinkedListNode currentX = x.head;
            LinkedListNode currentY = y.head;
            while (currentX.getNext() != null && currentY.getNext() != null) {
                mergedList.insert(currentX.getData());
                mergedList.insert(currentY.getData());
                currentX = (LinkedListNode) currentX.getNext();
                currentY = (LinkedListNode) currentY.getNext();
            }
            mergedList.insert(currentX.getData());
            mergedList.insert(currentY.getData());

            if (currentX.getNext() != null) {
                while (currentX.getNext() != null) {
                    currentX = (LinkedListNode) currentX.getNext();
                    mergedList.insert(currentX.getData());
                }
            } else if (currentY.getNext() != null) {
                while (currentY.getNext() != null) {
                    currentY = (LinkedListNode) currentY.getNext();
                    mergedList.insert(currentY.getData());
                }
            }
        }

        return mergedList;
    }




    // challenge09

    public LinkedListNode reverseList(LinkedListNode temp) {
        LinkedListNode current = temp;
        LinkedListNode prevNode = null;
        LinkedListNode  nextNode;

        while (current != null) {
            nextNode = (LinkedListNode) current.getNext();
            current.setNext(prevNode);
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }


    public void isPalindromeLL(){
        LinkedListNode current = head;
        if(head == null){
            System.out.println("the linked list is empty");
            return;
        }
        boolean flag = true;

        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);

        for(int i=1; i<mid; i++){
            current = (LinkedListNode) current.getNext();
        }

        LinkedListNode revHead = reverseList((LinkedListNode) current.getNext());

        while(head != null && revHead != null){
            if(head.getData() != revHead.getData()){
                flag = false;
                break;
            }
            head = (LinkedListNode) head.getNext();
            revHead = (LinkedListNode) revHead.getNext();
        }

        if(flag)
            System.out.println("True");
        else
            System.out.println("False");
    }














//    public void isPalindromeLL() {
//        int size = 0;
//        LinkedListNode current = head;
//        if (head == null) {
//            System.out.println("The linked list is empty");
//            return;
//        } else {
////            while (current != null) {
////                current = current.getNext();
////                System.out.println(current.getData());
////                size++;
////            }
//            boolean flag = true;
//            int midIndex;
//            if (size % 2 == 0) {
//                midIndex = size / 2;
//            } else {
//                midIndex = (size + 1) / 2;
//            }
//          for (int i =1 ; i<midIndex; i++){
//              current = current.getNext();
//          }
//            LinkedListNode revHead = reverseList(current.getNext());
//            while (head != null && revHead != null) {
//                if (head.data != revHead.data) {
//                    flag = false;
//                    System.out.println(flag);
//                    break;
//
//                }
//              head = head.getNext();
//              revHead = revHead.getNext();
//
////          }
//
//            }
//            System.out.println(flag);
//        }
//
//    }

}














