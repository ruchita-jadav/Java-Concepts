package com.github.java.concepts.collection.queue;

import java.util.PriorityQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Integer> queue =  new PriorityBlockingQueue<>(1);
        System.out.println(queue.poll());
        queue.add(1);
        Thread.sleep(3000000);
        System.out.println(queue.poll());
        queue.add(2);
        System.out.println();
    }
}
