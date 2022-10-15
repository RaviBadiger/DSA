package datastructures.stack;

import datastructures.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        /*myStack.push(56);
        myStack.push(76);*/
        myStack.printStack();
        myStack.getTop();
        myStack.getHeight();
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop());
        myStack.printStack();

    }
}