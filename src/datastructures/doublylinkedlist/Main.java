package datastructures.doublylinkedlist;

import datastructures.doublylinkedlist.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(4);
        doublyLinkedList.append(2);
        doublyLinkedList.append(5);
        doublyLinkedList.append(20);
        doublyLinkedList.append(15);
        doublyLinkedList.remove(4);
        doublyLinkedList.printList();
    }
}