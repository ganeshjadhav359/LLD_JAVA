package org.ganeshjadhav.multithreading;


class Counter{
    private int counter;
    public void increment(){
        counter++;
    }

    public synchronized void print(){
        System.out.println(counter);
    }
}
public class SyncronizedKeywordDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Runnable runnable = () -> {
            for(int i = 0 ;i < 10; i++)
                counter.increment();
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ;i < 10; i++)
                    counter.increment();
            }
        });
        Thread t3 = new Thread(() ->{
            for(int i = 0 ;i < 10; i++)
                counter.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t3.start();
        t3.join();
        t2.join();
        counter.print();
    }
}
