# Challenge15 - Binary Tree and BST Implementation

## Challenge

- Creating a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Creating a Binary Tree class
- Defining a method for each of the depth first traversals in Binary Tree class:
   - pre order
   - in order
   - post order
- Creating a Binary Search Tree class
- Implement add method to add new nodes to a tree
- Implement contains method which returns a boolean value indicating whether the value in the tree or not.


### Methods in Binary Tree class

- postOrder(): depth-first traversal to print and store the nods in array list by left >> right >> root way.
- inOrder(): depth-first traversal to print and store the nods in array list by left >> root >> right way.
- preOrder(): depth-first traversal to print and store the nods in array list by root >> left >> right way.

### Methods in Binary Search Tree class

- add(T data): Adds a new node with that value in the correct location in the binary search tree.
- addHelper(BinaryNode <T> root, T data)
- contains(T data): Returns boolean indicating whether or not the value is in the tree at least once.

