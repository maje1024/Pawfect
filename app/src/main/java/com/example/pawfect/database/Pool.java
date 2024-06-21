package com.example.pawfect.database;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class Pool {
    private static ExecutorService threadPool;

    public static ExecutorService getThreadPool() {
        synchronized (Pool.class) {
            if (threadPool == null) {
                threadPool = Executors.newFixedThreadPool(2);
            }
        }
        return threadPool;
    }
}
