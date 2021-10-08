package com.github.java.concepts;

/**
 * Max it has created 4069 thread
 */
public class JVMThreadCounts {

    public static void main(String[] args) {
        threadCreator();
    }

    static void threadCreator() {
        int counter = 1;
        while (counter < 1000) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " is created");
                    Thread.sleep(300000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "Thread-" + counter++).start();
        }
    }
}
