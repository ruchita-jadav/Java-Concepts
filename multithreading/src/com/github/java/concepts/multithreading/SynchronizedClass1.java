package com.github.java.concepts.multithreading;

public class SynchronizedClass1 {

    synchronized void method1(SynchronizedClass2 obj2){
        String name = Thread.currentThread().getName();
        System.out.println(name+" called SynchronizedClass1's method1...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("SynchronizedClass1 interrupted running thread "+name);
        }
        System.out.println(name+" thread going forSynchronizedClass2's method2 call...");
        obj2.last2();
    }

    synchronized void last1(){
        System.out.println("Inside SynchronizedClass1 calling last1...");
    }
}
