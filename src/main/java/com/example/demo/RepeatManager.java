package com.example.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RepeatManager implements Runnable{

    public void repeatThis(){
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        Runnable task = new RepeatManager();
        executor.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);
    }

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
