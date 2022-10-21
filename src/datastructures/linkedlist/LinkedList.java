package datastructures.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

    }
    //- this constructor is called when LinkedList object is created and a value is passed
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){removeLast();
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    //When append method is called the Node constructor is called directly not linkedlist constructor
    public void append(int value){
        Node newNode = new Node(value);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length ==0){
            return null;
        }
        Node temp = head;
        Node pre = head;
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail= pre;
            tail.next = null;
            length--;
            if (length==0){
                head = null;
                tail = null;
            }
            return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;

        }else {
            newNode.next = head;
            head = newNode;
            length++;
        }
    }

    public Node removeFirst(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        if(length ==0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(length == 0 || index >= length){
            return null;
        }
        int count=0;
        Node temp = head;
        while(count != index){
            count++;
            temp = temp.next;
        }
        return temp;

    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null){
            temp.value =value;
            return true;
        }
        return false;
    }

    public boolean inset(int index, int value){
        if(length == 0 || index > length){
            return false;
        }
        if(index == 0){
            prepend(value);
            length++;
            return true;
        }
        if (index == length - 1 ) {
            append(value);
            length++;
            return true;
        }
            Node newNode = new Node(value);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;

    }

    public Node remove(int index){
        if(length == 0 || index > length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length - 1){
            return removeLast();
        }
        //Node  = get(index);
        Node prev = get(index -1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
      //  System.out.println(temp1.value + " " + temp2.value);
        length--;
        return temp;
    }

    public void reverse(){
        if(length == 0 || length == 1){
            return;
        }
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }
}
