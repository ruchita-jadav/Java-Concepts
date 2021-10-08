package com.github.java.concepts.concuurency.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerExample {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Producer(exchanger);
        new Subscriber(exchanger);
        /**
         * Not working for 2 subscriber at same time.
         */
        new Subscriber2(exchanger);
        System.out.println(Thread.currentThread().getName() +"Finished");
    }
}
