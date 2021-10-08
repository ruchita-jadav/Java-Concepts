package com.github.java.concepts.multithreading;

public class MainThreadExample {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Main thread name : " + thread.getName());
        thread.setName("New Thread 1");
        System.out.println("Main thread name changed : " + thread.getName());
        System.out.println("Main thread priority : " + thread.getPriority());
        thread.setPriority(thread.getPriority()+2);
        System.out.println("Main thread priority changed : " + thread.getPriority());
        System.out.println("Main thread group : " + thread.getThreadGroup().getName());

        for (int i = 0; i < 2; i++) {
            System.out.println("Counter" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted");
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Counter" + i);
            try {
                Thread.sleep(1000,999999);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted");
            }
        }
        System.out.println("Main thread priority : " + thread.getPriority());
    }
}
