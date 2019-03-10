package pl.mpas.advanced_programing.threading.first.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercice1 {

    public static void main(String[] args) {

        AtomicInteger ai = new AtomicInteger(0);
        Runnable shop = () -> {

            System.out.println("Cashier is ready...");

            for (int i = 0; i < 100; i++) {
                int tmp = ai.incrementAndGet();

                System.out.println("Run by: " + Thread.currentThread().getName() + ", current atomic value: " + tmp);
            }
        };
        ExecutorService transactions = Executors.newFixedThreadPool(3);

        transactions.execute(shop);
        transactions.execute(shop);
        transactions.execute(shop);

        transactions.shutdown();

        boolean done = false;
        do {
            try {
                transactions.awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!done);

        System.out.println("Value from main: " + ai);
    }
//        transactions.shutdown();
//
//        int currentValue = ai.intValue();
//
//        do {
//            currentValue = ai.intValue();
//        } while (!ai.compareAndSet(currentValue, currentValue + 2));
//    }
}