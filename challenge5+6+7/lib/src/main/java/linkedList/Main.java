/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class Main {
    public static void main (String [] args){

        System.out.println("*************************Start*************************");
        LinkedList linkedList = new LinkedList();
        linkedList.insert("a");
        linkedList.insert("b");
        linkedList.insert("c");
        linkedList.insert("d");
        System.out.println(linkedList);
        System.out.println(linkedList.isIncluded("g"));
        System.out.println(linkedList.size);

        // code challenge06

        //add at the end of linked list
        linkedList.addNewNodeAtEnd("node at end");
        System.out.println(linkedList);

        // insert before a specific node
        linkedList.insertBefore("c","node before");
        System.out.println(linkedList);

        // insert after specific node
        linkedList.insertAfter("2","node after");
        System.out.println(linkedList+ "\nLinked List Size => "+linkedList.size);


        //*** challenge 07
        // kth from end

        System.out.println(linkedList.kthFromEnd(3));
        System.out.println(linkedList.kthFromEnd(10));





        System.out.println("*************************End***************************");

    }


}
