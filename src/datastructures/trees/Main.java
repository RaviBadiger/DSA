package datastructures.trees;

import datastructures.stack.Stack;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(45);
        myBST.insert(55);
        myBST.insert(34);
        myBST.insert(22);
        System.out.println(myBST.root.left.left.value);
        System.out.println(myBST.contains(10));

    }
}