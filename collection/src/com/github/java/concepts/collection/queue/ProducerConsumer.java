package com.github.java.concepts.collection.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

class ProducerConsumer {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        BlockingQueue q = new PriorityBlockingQueue<String>();
        Producer p = pc.new Producer(q);
        Consumer c1 = pc.new Consumer(q);
        Consumer c2 = pc.new Consumer(q);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }

    class Producer implements Runnable {
        private final BlockingQueue queue;

        Producer(BlockingQueue q) {
            queue = q;
        }

        int i = 5;

        public void run() {
            try {
                while (i > 0) {
                    queue.put("Value- " + i--);
//                    Thread.sleep(100);
                }
            } catch (InterruptedException ex) {
            }
        }
    }

    class Consumer implements Runnable {
        private final BlockingQueue queue;

        Consumer(BlockingQueue q) {
            queue = q;
        }

        int i = 5;

        public void run() {
            try {
                while (i > 1 ) {
//                    Thread.sleep(100);
                    consume((String) queue.take());
                    i--;
                }
            } catch (InterruptedException ex) {
            }
        }

        void consume(String x) {
            System.out.println(x);
        }
    }
}
