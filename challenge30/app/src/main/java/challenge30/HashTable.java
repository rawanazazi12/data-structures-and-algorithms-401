package challenge30;

import challenge30.binaryTree.BinaryTree;
import challenge30.binaryTree.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class HashTable <K,V> {

    private ArrayList<HashNode<K,V>>bucketArray;
    private int bucketNum;
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        bucketNum = 20;
        size = 0;

        for(int index = 0; index < bucketNum; index++){
            bucketArray.add(null);
        }
    }

    int hashCode(K key){
        return Objects.hashCode(key);
    }

    private int getBucketIndex(K key){
        int hashCode = hashCode(key);
        int index = hashCode % bucketNum;

        index = index<0 ? index * -1 : index;
        return index;

    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public void add (K key , V value){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K,V> head = bucketArray.get(bucketIndex);

        while(head != null){
            if (head.key.equals(key) && head.hashCode == hashCode){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K,V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex,newNode);

        if ((1.0 * size)/bucketNum >= 0.7){
            ArrayList<HashNode<K,V>> temp = bucketArray;
            bucketNum = 2 * bucketNum;
            size = 0;

            for (int index = 0 ; index < bucketNum; index++){
                bucketArray.add(null);
            }

            for (HashNode<K,V> headNode : temp){
                while (headNode != null){
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V remove (K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K,V> head = bucketArray.get(bucketIndex);

        HashNode<K,V> prev = null;
        while (head != null){
            if (head.key.equals(key) && hashCode == head.hashCode){
                break;
            }
            prev = head;
            head = head.next;
        }
        if (head == null)
            return null;
        size--;

        if (prev != null){
            prev.next = head.next;
        }else {
            bucketArray.set(bucketIndex, head.next);
        }
        return head.value;
    }

    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K,V> head = bucketArray.get(bucketIndex);
        while (head != null){
            if (head.key.equals(key) && hashCode == head.hashCode){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }


    public boolean contains(K key) {
        if (key == null){
            throw new IllegalArgumentException("Cannot find a null key.");
        }
        return get(key) != null;
    }


    // <Challenge 31>

    public String  repeatedWord( String data) {
        String[] words = data.split(" ");
        HashTable<String,String> wordTable = new HashTable<>();
        for(int i=0;i<words.length;i++) {
            String word = words[i].toLowerCase();
            if(word.contains(",")){
                word = word.substring(0, word.length()-1);
            }
            if(wordTable.get(word)!=null) {
                return ("Repeated word:"+word);
            }else {
                wordTable.add(word, word);
            }
        }
        return "No repeated words";
    }

    // Challenge 32

    public HashMap<Integer,Integer> hashMap = new HashMap<>();
    public List<Integer> intersections = new ArrayList<>();

    public List<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2){

        if (tree1.getRoot() == null || tree2.getRoot()  == null) {
            return null;
        }

        traverse(tree2.getRoot());

        compare(tree1.getRoot());

        return intersections;
    }

    public void traverse(Node node) {

        if (node != null) {

            int count = 0 ;
            if(hashMap.get(node.getKey()) == null){
                count = 1;
            }else{
                count = count +1;
            }

            hashMap.put(node.getKey(),count);

            traverse(node.getLeft());
            traverse(node.getRight());
        }
    }

    public void compare(Node node){
        if (node != null) {
            if (hashMap.get(node.getKey()) != null){
                intersections.add(node.getKey());
            }
            compare(node.getLeft());
            compare(node.getRight());
        }

    }
}
