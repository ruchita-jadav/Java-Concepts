package com.github.java.concepts.collection.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * PriorityQueue<E> extends AbstractQueue<E>
 * AbstractQueue<E> extends AbstractCollection<E> implements Queue<E>
 * AbstractCollection<E> implements Collection<E>
 * <p>
 * It prioritized based on queue's comparator. Default comparator sorts elements in ascending order. Comparator should be assigned via constructor only.
 * Default capacity is 11. It's dynamic, growing as necessary
 * <p>
 * SUGGESTION : Iterator will not consider comparator, so order is not gauranteed. Use of offer and poll is suggested.
 * <p>
 * USECASE : Arrange as per timestamp.
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue<>(12,Comparator.reverseOrder());

        // Point : Default capacity vs size. Size is no of elements present in a collection.
        System.out.println(priorityQueue.size());

        //Point : For default comparator it will show null.
        System.out.println(priorityQueue.comparator());

        //Point : showing default comparator nature with dynamic in size
        for (int i = 0; i < 12; i++) {
            priorityQueue.add(i);
        }
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll()+" ");
        }
        System.out.println();

        // Point : Assigned custom comparator.
        priorityQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());

        //priorityQueue = new PriorityQueue<Integer>((x, y) -> x < y ? 1 : -1);  // Another way to pass descending order comparator
        //priorityQueue = new PriorityQueue<Integer>((x,y) -> x-y ); // Another way to pass descending order comparator

        System.out.println(priorityQueue.comparator());
        //Point : showing custom comparator nature with dynamic in size
        for (int i = 0; i < 12; i++) {
            priorityQueue.add(i);
            priorityQueue.add(i - 1);
        }
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll()+" ");
        }
        System.out.println();

        //Point : Object comparator, comparision on field
//        priorityQueue = new PriorityQueue<>(Comparator.comparingInt(User::getId));    //ascending order
        priorityQueue = new PriorityQueue<User>((x1,x2) -> x2.id - x1.id);      //descending order
        System.out.println("Object comparator :" + priorityQueue.comparator());
        Random random = new Random();

        for (int i = 5; i < 10; i++) {
            priorityQueue.add(new User(random.nextInt()));
        }
        for (int i = 0; i < 5; i++) {
            priorityQueue.add(new User(-random.nextInt(12)));
        }
        while (!priorityQueue.isEmpty()) {
            User user = (User) priorityQueue.poll();
            System.out.print(user.id+" ");
        }
    }

    static class User{
        int id ;

        public User(int id) {
            this.id = id ;
        }

        public int getId() {
            return id;
        }
    }
}

