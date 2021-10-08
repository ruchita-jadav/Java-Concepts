package com.github.java.concepts.multithreading;

public class SynchronizedClass2 {

    synchronized void method2(SynchronizedClass1 obj1) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " called SynchronizedClass2's method2...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("SynchronizedClass2 interrupted running thread " + name);
        }
        System.out.println(name + " thread going forSynchronizedClass1's method1 call...");
        obj1.last1();
    }

    synchronized public void last2() {
        System.out.println("Inside SynchronizedClass2 calling last2...");
    }
}
