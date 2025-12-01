// Producer-Consumer pattern with wait and notify

import java.util.Random;

class SharedData {
    private int data;
    private boolean available = false;
    
    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify();
    }
    
    public synchronized int consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer extends Thread {
    SharedData shared;
    
    Producer(SharedData shared) {
        this.shared = shared;
    }
    
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(100) + 1;
            shared.produce(value);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    SharedData shared;
    int evenCount = 0;
    
    Consumer(SharedData shared) {
        this.shared = shared;
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = shared.consume();
            if (value % 2 == 0) {
                evenCount++;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nTotal even numbers received: " + evenCount);
    }
}

public class Q12_ProducerConsumer {
    public static void main(String[] args) {
        SharedData shared = new SharedData();
        Producer producer = new Producer(shared);
        Consumer consumer = new Consumer(shared);
        
        producer.start();
        consumer.start();
    }
}
