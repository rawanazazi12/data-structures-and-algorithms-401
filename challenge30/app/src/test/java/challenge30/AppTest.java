/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge30;

import challenge30.binaryTree.BinaryTree;
import challenge30.binaryTree.Node;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static challenge30.App.leftJoin;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    //   " CHALLENGE 30 "

    @Test
        public void hashTableMethodsTest(){

        HashTable<String, Integer> studentsGrades = new HashTable<>();

        assertTrue(studentsGrades.isEmpty());

        studentsGrades.add("Tara",100);
        assertEquals(1,studentsGrades.getSize());

        studentsGrades.add("Liam", 88);
        assertEquals(2,studentsGrades.getSize());
        assertFalse(studentsGrades.isEmpty());

        studentsGrades.hashCode("Tara");
        assertEquals(2599292, studentsGrades.hashCode("Tara"));

        studentsGrades.remove("Liam");
        assertEquals(1,studentsGrades.getSize());

        assertTrue(studentsGrades.contains("Tara"));
        assertFalse(studentsGrades.contains("John"));

        studentsGrades.get("Sara");
        assertEquals(null, studentsGrades.get("Sara"));

        studentsGrades.remove("Tara");
        assertTrue(studentsGrades.isEmpty());



    }

    // "Challenge 31"


    @Test
    public void repeatedWordTest(){

        HashTable<String, String> test = new HashTable<String, String>();

        String data1 = "Once upon a time, there was a brave princess who...";
        assertEquals("Repeated word:a", test.repeatedWord(data1));

        String data2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only";
        assertEquals("Repeated word:it", test.repeatedWord(data2));

        String data3= "It was a queer,  sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York";
        assertEquals("Repeated word:summer", test.repeatedWord(data3));

    }

    @Test
    public  void repeatedWordTestNoRepeat(){

        HashTable<String, String> test = new HashTable<String, String>();

        String data = "Hello everyone, nice to meet u";
        assertEquals("No repeated words", test.repeatedWord(data));
    }

    //     " Challenge 32 "

    @Test
    public void intersectionTreeMethodTest(){

        HashTable<Integer,Integer> trees = new HashTable<Integer, Integer>();
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.setRoot(new Node(100));
        tree1.getRoot().setLeft(new Node(150));
        tree1.getRoot().setRight(new Node(200));
        tree1.getRoot().getRight().setLeft(new Node(250));
        tree1.getRoot().getRight().setRight(new Node(300));

        tree2.setRoot(new Node(50));
        tree2.getRoot().setLeft(new Node(100));
        tree2.getRoot().setRight(new Node(400));
        tree2.getRoot().getRight().setLeft(new Node(250));
        tree2.getRoot().getRight().setRight(new Node(300));

        assertEquals("[100, 250, 300]", trees.treeIntersection(tree1,tree2).toString());

    }

    @Test
    public void intersectionTreeTestNoResults(){

        HashTable<Integer,Integer> trees = new HashTable<Integer, Integer>();
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.setRoot(new Node(100));
        tree1.getRoot().setLeft(new Node(150));
        tree1.getRoot().setRight(new Node(200));
        tree1.getRoot().getRight().setLeft(new Node(250));
        tree1.getRoot().getRight().setRight(new Node(300));

        tree2.setRoot(new Node(17));
        tree2.getRoot().setLeft(new Node(122));
        tree2.getRoot().setRight(new Node(78));
        tree2.getRoot().getRight().setLeft(new Node(120));
        tree2.getRoot().getRight().setRight(new Node(20));

        assertEquals("[]", trees.treeIntersection(tree1,tree2).toString());

    }

    @Test
    public void intersectionTreeDifferentNumOfNodes(){

        HashTable<Integer,Integer> trees = new HashTable<Integer, Integer>();
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.setRoot(new Node(100));
        tree1.getRoot().setLeft(new Node(150));
        tree1.getRoot().setRight(new Node(200));
        tree1.getRoot().getRight().setLeft(new Node(250));
        tree1.getRoot().getRight().setRight(new Node(300));

        tree2.setRoot(new Node(50));
        tree2.getRoot().setLeft(new Node(100));
        tree2.getRoot().setRight(new Node(400));
        tree2.getRoot().getRight().setLeft(new Node(250));


        assertEquals("[100, 250]", trees.treeIntersection(tree1,tree2).toString());

    }

    //"Challenge 33"

    @Test
    public void leftWithAllJoinsTest(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("flow", "jam");

        HashMap h2 = new HashMap();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("flow", "test");

        assertEquals("[[ wrath, anger, delight ], [ flow, jam, test ], [ fond, enamored, averse ]]", leftJoin(h1, h2).toString());
    }

    @Test
    public void leftWithSomeJoinsTest(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap h2 = new HashMap();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("flow", "jam");


        assertEquals("[[ diligent, employed, null ], [ outfit, garb, null ], [ wrath, anger, delight ], [ guide, usher, null ], [ fond, enamored, averse ]]",leftJoin(h1, h2).toString());
    }

    @Test
    public void emptySecondHashmapTest(){
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap h2 = new HashMap();

        assertEquals("[[ diligent, employed, null ], [ outfit, garb, null ], [ wrath, anger, null ], [ guide, usher, null ], [ fond, enamored, null ]]", leftJoin(h1, h2).toString());

    }

    @Test
    public void twoEmptyHashmapsTest(){
        HashMap h1 = new HashMap();
        HashMap h2 = new HashMap();

        assertEquals("[]", leftJoin(h1, h2).toString());

    }

}
