/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import linkedList.queue.PseudoQueue;
import linkedList.queue.Queue;
import linkedList.stack.CharStack;
import linkedList.stack.Stack;
import linkedList.stack.StackNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Object Exception;

    @Test void someLibraryMethodReturnsTrue() {
        Main classUnderTest = new Main();
    }
    @Test void isIncludedMethod(){
        LinkedList linkedList =new LinkedList();
        linkedList.insert("m");
        String testValue="m";
        Assertions.assertTrue(linkedList.isIncluded(testValue));
    }

    @Test void isEmpty(){
        LinkedList linkedList=new LinkedList();
        linkedList.insert("g");
        Assertions.assertTrue(linkedList.size>=0);
    }
   @Test void insertMethod(){
        LinkedList linkedList=new LinkedList();
        linkedList.insert("n");
        linkedList.insert("j");
        linkedList.insert("p");
        Assertions.assertEquals(3, linkedList.size);

   }
    @Test
    public void addNewNodeAtEndTest() {
        LinkedList linkedList=new LinkedList();
        linkedList.addNewNodeAtEnd("A");
        linkedList.addNewNodeAtEnd("Z");
        Assertions.assertEquals(2, linkedList.size);
    }
    @Test
    public void addBeforeAndAfterTest() {
        LinkedList linkedList=new LinkedList();
        linkedList.addNewNodeAtEnd("a");
        linkedList.addNewNodeAtEnd("b");
        linkedList.addNewNodeAtEnd("c");
        linkedList.insertBefore("b" , "new");
        linkedList.insertAfter("c" , "new");
        Assertions.assertEquals("a" , linkedList.head.getData());
        Assertions.assertEquals(5, linkedList.size);
        Assertions.assertTrue(linkedList.isIncluded("b") );
        Assertions.assertFalse(linkedList.isIncluded("5") );
        Assertions.assertEquals("{a} => {new} => {b} => {c} => {new} => NULL" , linkedList.toString());
    }
    @Test
    public void insertBeforeFirstNodeTest() {
        LinkedList linkedList=new LinkedList();
        linkedList.addNewNodeAtEnd("a");
        linkedList.addNewNodeAtEnd("b");
        linkedList.addNewNodeAtEnd("c");
        linkedList.insertBefore("a" , "new");
        Assertions.assertEquals("{new} => {a} => {b} => {c} => NULL" , linkedList.toString());

    }
    @Test
    public void insertAfterLastNodeTest() {
        LinkedList linkedList=new LinkedList();
        linkedList.addNewNodeAtEnd("a");
        linkedList.addNewNodeAtEnd("b");
        linkedList.addNewNodeAtEnd("c");
        linkedList.insertAfter("c" , "new");
        Assertions.assertEquals("{a} => {b} => {c} => {new} => NULL" , linkedList.toString());

    }
    @Test
    // test four cases
    public void kthTest(){
        LinkedList linkedList=new LinkedList();
        linkedList.insert("5");
        linkedList.insert("9");
        linkedList.insert("3");
        linkedList.insert("7");
        Assertions.assertEquals(4, linkedList.size);
        Assertions.assertEquals("9",linkedList.kthFromEnd(2));
        Assertions.assertEquals( "k value out of boundaries",linkedList.kthFromEnd(8));
        Assertions.assertEquals( "k value out of boundaries",linkedList.kthFromEnd(4));
        Assertions.assertEquals( "k value out of boundaries",linkedList.kthFromEnd(-5));
        Assertions.assertEquals( "9",linkedList.kthFromEnd(2));


    }
    @Test
    // the case when linked list size =1
    public void kthTestWithSizeOne(){
        LinkedList linkedList=new LinkedList();
        linkedList.insert("5");
        Assertions.assertEquals( "The Linked List size is 1",linkedList.kthFromEnd(4));

    }

    // challenge08 Tests
    @Test
     // first case test
    public void zipListsMethodTest1(){
        LinkedList linkedList=new LinkedList();
        LinkedList list1 =new LinkedList();
        LinkedList list2=new LinkedList();
        list1.insert("1");
        list1.insert("3");
        list1.insert("2");
        list2.insert("5");
        list2.insert("9");
        Assertions.assertEquals( "{1} => {5} => {3} => {9} => {2} => NULL", linkedList.zipLists(list1,list2).toString());
    }
    @Test
    // second case test
    public void zipListsMethodTest2(){
        LinkedList linkedList=new LinkedList();
        LinkedList list1 =new LinkedList();
        LinkedList list2=new LinkedList();
        list1.insert("1");
        list1.insert("3");
        list1.insert("2");
        list2.insert("5");
        list2.insert("9");
        list2.insert("4");
        Assertions.assertEquals( "{1} => {5} => {3} => {9} => {2} => {4} => NULL", linkedList.zipLists(list1,list2).toString());
    }
    @Test
    // third case test
    public void zipListsMethodTest3(){
        LinkedList linkedList=new LinkedList();
        LinkedList list1 =new LinkedList();
        LinkedList list2=new LinkedList();
        list1.insert("1");
        list1.insert("3");
        list2.insert("5");
        list2.insert("9");
        list2.insert("4");
        Assertions.assertEquals( "{1} => {5} => {3} => {9} => {4} => NULL", linkedList.zipLists(list1,list2).toString());
    }

     // test when two lists are empty
    @Test
    // fourth case test
    public void zipListsMethodTest4(){
        LinkedList linkedList=new LinkedList();
        LinkedList list1 =new LinkedList();
        LinkedList list2=new LinkedList();
//        list1.insert("1");
//        list1.insert("3");
//        list2.insert("5");

        Assertions.assertEquals( "NULL", linkedList.zipLists(list1,list2).toString(), "The two lists are empty and the merged list is null");
    }
    @Test
    // fifth case test
    // the first list is empty
    public void zipListsMethodTest5(){
        LinkedList linkedList=new LinkedList();
        LinkedList list1 =new LinkedList();
        LinkedList list2=new LinkedList();
//        list1.insert("1");
//        list1.insert("3");
        list2.insert("5");
        list2.insert("9");
        list2.insert("4");
        Assertions.assertEquals( "{5} => {9} => {4} => NULL", linkedList.zipLists(list1,list2).toString());
    }
    @Test
    // sixth case test
    // the second list is empty
    public void zipListsMethodTest6(){
        LinkedList linkedList=new LinkedList();
        LinkedList list1 =new LinkedList();
        LinkedList list2=new LinkedList();
        list1.insert("1");
        list1.insert("3");
        list1.insert("2");
//        list2.insert("5");
//        list2.insert("9");
//        list2.insert("4");
        Assertions.assertEquals( "{1} => {3} => {2} => NULL", linkedList.zipLists(list1,list2).toString());
    }

    // challenge10 Tests
    //Can successfully push onto a stack
    @Test
    public void pushOntoStack(){
        Stack stack = new Stack();
        stack.push("R");
        stack.push("A");
        stack.push("W");
        stack.push("A");
        stack.push("N");
        Assertions.assertEquals( "Stack { N => A => W => A => R => Null }" ,stack.toString());
    }
    // Can successfully pop off the stack
    @Test
    public void popOffTheStackTest(){
            Stack stackTest = new Stack();
            stackTest.push("R");
            stackTest.push("A");
            stackTest.push("W");
            stackTest.pop();
            assertEquals("Stack { A => R => Null }",stackTest.toString());
        }


    // Can successfully empty a stack after multiple pops
    @Test
    public void isEmptyMethodTest (){
           Stack stack = new Stack();
           stack.push("R");
           stack.push("A");
           stack.push("w");
           stack.push("A");
           stack.push("N");
           stack.pop();
           stack.pop();
           stack.pop();
           stack.pop();
           stack.pop();
           stack.pop();
           assertEquals(true ,stack.isEmpty() );
       }

       // Can successfully peek the next item on the stack
    @Test
       public void peekMethodTest (){
           Stack stack = new Stack();
           stack.push("R");
           stack.push("A");
           stack.push("w");
           stack.push("A");
           stack.push("N");
           assertEquals("N" ,stack.peek());
           stack.pop();
           assertEquals("A" ,stack.peek());
       }

    @Test
    public void emptyStackTest() {
        Stack stack = new Stack();
        stack.push("R");
        stack.push("A");
        stack.push("W");
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals("Stack { Null }",stack.toString());
        assertTrue(stack.isEmpty());
    }
    // Calling pop or peek on empty stack raises exception
    @Test
    public void exceptionTest(){
        Stack stack = new Stack();
        stack.push("R");
        stack.pop();
        assertEquals("The Stack is Empty",stack.pop(), "Exception message");
        stack.peek();
        assertEquals("The Stack is Empty",stack.peek(), "Exception message");
        assertEquals( java.util.Optional.of("The Stack is Empty"), java.util.Optional.ofNullable(stack.peek()));
        stack.push("A");
        stack.push("B");
        stack.push("C");
        assertEquals( java.util.Optional.of("C"), java.util.Optional.ofNullable(stack.peek()));



    }

    // Queue Tests
    @Test
    public void enqueueToQueueTest(){
        Queue queue = new Queue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertEquals("Queue { A => B => C => Null }",queue.toString());
    }

    @Test
    public void dequeueFromQueueTest(){
        Queue queue = new Queue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.dequeue();
        assertEquals("Queue { B => C => Null }",queue.toString());
    }

    @Test
    public void emptyQueueTest(){
        Queue queue = new Queue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
        assertEquals("Queue { Null }",queue.toString());
        assertEquals("Queue is Empty",queue.peek());
        assertEquals("Queue is Empty",queue.dequeue());

    }

    @Test
    public void peekQueueTest(){
        Queue queue = new Queue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertEquals( java.util.Optional.of("A"), java.util.Optional.ofNullable(queue.peek()));
        queue.dequeue();
        assertEquals(java.util.Optional.of("B"),java.util.Optional.ofNullable(queue.peek()));
    }
// challenge 11 Test

    @Test
    public void pseudoEnqueueTest() {

        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue("R");
        pseudoQueue.enqueue("A");
        pseudoQueue.enqueue("W");
        pseudoQueue.enqueue("A");
        pseudoQueue.enqueue("N");
        assertEquals("Stack { N => A => W => A => R => Null }", pseudoQueue.toString());
        assertEquals("N", pseudoQueue.firstStack.peek());
        pseudoQueue.enqueue("B");
        assertEquals("B",pseudoQueue.firstStack.peek());
        assertFalse(pseudoQueue.firstStack.isEmpty());
    }

    @Test
    public void dequeueTest(){
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue("A");
        pseudoQueue.enqueue("B");
        pseudoQueue.enqueue("C");
        pseudoQueue.dequeue();
        assertEquals("Stack { C => B => Null }",pseudoQueue.toString());
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        assertTrue(pseudoQueue.firstStack.isEmpty());
        assertEquals("Stack { Null }",pseudoQueue.toString());
        assertEquals("Empty", pseudoQueue.dequeue());
    }

// challenge13
//@Test
//public void validateBracketsTest() throws Exception {
//
//    assertEquals(true, Main.validateBrackets("{}"));
//    assertEquals(false, Main.validateBrackets("{}([){}"));
//    assertEquals(true,Main.validateBrackets("(v)[[Extra Characters]]"));
//    assertFalse(Main.validateBrackets("[({}]"));
//
//}
    }




