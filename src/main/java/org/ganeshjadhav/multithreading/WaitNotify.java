package org.ganeshjadhav.multithreading;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

class BlockingQueue{
    private final Queue<Integer> queue;
    private final Object lock;
    private final int capacity;

    public BlockingQueue(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
        this.lock = new Object();
    }

    public void add(int num){
        synchronized (lock){
            if(queue.size() == capacity){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.add(num);
            this.notifyAll();
        }
    }

    public void remove(){
        synchronized (lock){
            if(queue.size() == 0){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("element consumed::" + queue.poll());
            this.notifyAll();
        }
    }
}

public class WaitNotify {

    public static void main(String[] args) {

    }
}
