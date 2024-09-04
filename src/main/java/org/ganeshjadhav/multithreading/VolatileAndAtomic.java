package org.ganeshjadhav.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Volatile{
    private volatile int counter;
    private boolean flag = false;
    public void increment(){
        counter++;
    }

    public void print(){
        System.out.println(counter);
    }

    public void changeToTrue(){
        this.flag = true;
    }

    public void reader(){
        while(!flag){
            System.out.println("flag is not changed yet");
        }
        System.out.println("flag updated to true");
    }
}

class Atomic{
    private final AtomicInteger counter = new AtomicInteger(0);
    public void increment(){
        counter.getAndIncrement();
    }

    public void print(){
        System.out.println(counter);
    }
}
public class VolatileAndAtomic {

    public static void main(String[] args) throws InterruptedException {
        Volatile aVolatile = new Volatile();
        Atomic counter = new Atomic();
        Thread t1 = new Thread(() ->{
            for(int i = 0; i < 1000; i++)
                counter.increment();
        });

        Thread t2 = new Thread(() ->{
            for(int i = 0; i < 1000; i++)
                counter.increment();
        });

        Thread t3 = new Thread(aVolatile::reader);
        Thread t4 = new Thread(() ->{
            try {
                Thread.sleep(1);
                aVolatile.changeToTrue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t3.start();
        t4.start();
        t3.join();
        t4.join();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        counter.print();
    }
}
