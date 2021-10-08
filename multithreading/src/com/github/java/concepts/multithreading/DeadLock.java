package com.github.java.concepts.multithreading;

public class DeadLock implements Runnable{
    static SynchronizedClass2 obj2 = new SynchronizedClass2();
    static SynchronizedClass1 obj1 = new SynchronizedClass1();

    DeadLock(){
        Thread.currentThread().setName("Main Thread");
        Thread t = new Thread(this, "RacingThread");
        t.start();

        obj1.method1(obj2);
        System.out.println("Back in main thread");
    }

    public static void main(String[] args) {
        // Via constructor
        // new DeadLock();
        // Calling here
        Thread t1 = new Thread(()-> { obj1.method1(obj2); },"thread1");
        Thread t2 = new Thread(()-> { obj2.method2(obj1); },"thread2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        obj2.method2(obj1);
        System.out.println("Back in other thread");
    }
}
