package com.github.java.concepts.concuurency.exchanger;

import java.util.concurrent.Exchanger;

public class Subscriber implements Runnable {
    private Exchanger<String> stringExchanger;

    public Subscriber(Exchanger<String> stringExchanger) {
        this.stringExchanger = stringExchanger;
        new Thread(this,"Subscriber").start();
    }
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() +"started");
        int i = 5 ;
        while ( i > 0 ){
            try {
                String value = stringExchanger.exchange(new String());
                System.out.println(Thread.currentThread().getName()+" Value- "+value);
                i--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() +"Finished");
    }
}
