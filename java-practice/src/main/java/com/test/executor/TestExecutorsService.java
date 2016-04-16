package com.test.executor;

import org.apache.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
    private static final Logger logger =
            Logger.getLogger(Processor.class);
    private int id;

    protected Processor(int id) {
        this.id = id;
    }

    public void run() {
        logger.info("Starting id " + id + " Thread Name: " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Completing id " + id);
    }
}

public class TestExecutorsService {
    private final static Logger logger = Logger.getLogger(TestExecutorsService.class);

    public static void main(String[] args) {
        if (logger.isDebugEnabled()) {
            logger.debug("This is DEBUG");
        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Processor(i));
        }

        executorService.shutdown();
        logger.info("All tasks submitted");
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("All tasks completed");
    }
}
