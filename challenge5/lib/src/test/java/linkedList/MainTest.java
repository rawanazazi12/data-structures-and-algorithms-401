/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
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
        Assertions.assertEquals("Linked List = {a} => {new} => {b} => {c} => {new} => NULL" , linkedList.toString());
    }
    @Test
    public void insertBeforeFirstNodeTest() {
        LinkedList linkedList=new LinkedList();
        linkedList.addNewNodeAtEnd("a");
        linkedList.addNewNodeAtEnd("b");
        linkedList.addNewNodeAtEnd("c");
        linkedList.insertBefore("a" , "new");
        Assertions.assertEquals("Linked List = {new} => {a} => {b} => {c} => NULL" , linkedList.toString());

    }
    @Test
    public void insertAfterLastNodeTest() {
        LinkedList linkedList=new LinkedList();
        linkedList.addNewNodeAtEnd("a");
        linkedList.addNewNodeAtEnd("b");
        linkedList.addNewNodeAtEnd("c");
        linkedList.insertAfter("c" , "new");
        Assertions.assertEquals("Linked List = {a} => {b} => {c} => {new} => NULL" , linkedList.toString());

    }


    }
