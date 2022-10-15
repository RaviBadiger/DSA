package datastructures.queues;

import datastructures.stack.Stack;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(67);
//        queue.enqueue(90);
//        queue.enqueue(10);
        queue.printQueue();
        System.out.println( "Deq " +  queue.dequeue().value);
        queue.printQueue();
        System.out.println( "Deq " +  queue.dequeue());
//        queue.getFirst();
//        queue.getLast();
        queue.getLength();

    }
}