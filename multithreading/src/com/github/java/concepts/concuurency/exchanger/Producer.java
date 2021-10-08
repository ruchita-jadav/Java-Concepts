package com.github.java.concepts.concuurency.exchanger;

import java.util.concurrent.Exchanger;

public class Producer implements Runnable {
    private Exchanger<String> stringExchanger;

    public Producer(Exchanger<String> stringExchanger) {
        this.stringExchanger = stringExchanger;
        new Thread(this,"Producer").start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"started");
        int i = 5 ;
        while ( i > 0 ){
            try {
                stringExchanger.exchange("String"+i--);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() +"Finished");

    }
}
