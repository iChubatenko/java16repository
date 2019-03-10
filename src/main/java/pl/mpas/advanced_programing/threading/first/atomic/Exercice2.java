package pl.mpas.advanced_programing.threading.first.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercice2 {

    volatile static long counter = 0;

    public static void main(String[] args) {
        Runnable increaseJob = () -> {
            long currentCounterValue;
            for (int i = 0; i < 500_000; i++) {

//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (Exercice2.class) {
                    currentCounterValue = ++counter;
                }

                System.out.println(String.format("Current value: [%s], from thred: [%s]",
                        currentCounterValue, Thread.currentThread().getName()));
            }
        };

        Runnable showJob = () -> {
            while (true) {
                System.out.println("Value: [" + counter + "]");
            }
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);
        workers.execute(showJob);
        workers.execute(increaseJob);
        workers.execute(increaseJob);
        workers.execute(increaseJob);


    }
}