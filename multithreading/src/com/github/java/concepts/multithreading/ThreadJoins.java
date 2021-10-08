package com.github.java.concepts.multithreading;

public class ThreadJoins {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = () -> {
            System.out.println(Thread.currentThread().getName()+"started");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+"finished");
        };

        Runnable runnable2 = () -> {
            System.out.println(Thread.currentThread().getName()+"started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+"finished");
        };

        Thread t1 = new Thread(runnable1,"Thread-1");
        Thread t2 = new Thread(runnable2,"Thread-2");

        t1.start();
//        t2.start();   // Scenario for already running thread.
        t1.join();
        t2.start();
        System.out.println("Main thread is running. ");
    }
}
