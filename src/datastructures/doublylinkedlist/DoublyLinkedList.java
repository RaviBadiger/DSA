package datastructures.doublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        //       System.out.println(tail.next);
        if (length == 1) {
            head = null;
            tail = null;

        } else {
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void printList() {
        if (length == 0) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = temp.next;

        }
        length--;
        System.out.println("Length" + length);
        return temp;

    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length){
            return false;
        }
        System.out.println("Index " + index + " " + "length " + length);
        if(index == 0){
            prepend(value);
            return true;
        }else if (index == length ){
            append(value);
            return true;
        }else{
            Node newNode = new Node(value);
            Node before = get(index);
            System.out.println("Before " + before + " " + "fetch " + get(index -1 ));
            Node after = before.next;
            newNode.prev = before;
            newNode.next = after;
            before.next = newNode;
            after.prev = newNode;
            length++;
        }
        //
        return true;
    }

    public boolean remove(int index){
        if(index < 0 || index >= length){
            return false;
        }
        if(index == 0){
            removeFirst();
            return true;
        }
        if(index == length - 1){
            removeLast();
            return true;
        }
        Node temp = get(index);
        Node before = temp.prev;
        Node after = temp.next;
        before.next = after;
        after.prev = before;
        temp.prev = null;
        temp.next = null;
        length--;
        return true;
    }

}