package org.ganeshjadhav.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


class ThreadSafeDateFormatter {
    public static ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = ThreadLocal.withInitial(
            () -> new SimpleDateFormat("yyyy-MM-dd")
    );
}

public class ThreadLocalDemo {
    private static final ExecutorService executorService= Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            int id = i;
            executorService.submit(() ->{
                ThreadLocalDemo demo = new ThreadLocalDemo();
                demo.birthDate(id);
            });
        }

    }

    public String birthDate(int userId){
        Date date = new Date();
        SimpleDateFormat sdf = ThreadSafeDateFormatter.simpleDateFormatThreadLocal.get();
        System.out.println(sdf.format(date));
        return sdf.format(date);
    }
}
