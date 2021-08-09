package com.github.java.concepts.collection.queue;

import java.util.ArrayDeque;

/**
 * ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>
 * AbstractCollection<E> implements Collection<E>
 *
 * Default capacity 16. It's dynamic array with no capacity restriction.
 *
 * Note : Deque supports capacity restriction but such implementation is not required.
 */
public class ArrayQueueExample {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Point : Dynamic nature
        for ( int i = 0 ; i < 20 ; i++){
            arrayDeque.push(i);
        }
        System.out.println(arrayDeque.size());

        // Point : array conversion. It will return Object array only
        Object[] ints = arrayDeque.toArray();

    }
}
