package pl.mpas.advanced_programing.threading.first.threading.second;

public class SecondThreadExample {

    public static void main(String[] args) {
        System.out.println("main() - beginning...");
        Runnable job = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Run by: " + Thread.currentThread().getName() +
                        ", iteration" + (i + 1));
            }
        };

        Thread worker1 = new Thread(job, "Ihor");
        worker1.setDaemon(true);
        worker1.run();
        worker1.start();
        System.out.println("inside main");

        Thread worker2 = new Thread(job, "Vasya");
        worker2.setDaemon(true);
        //worker2.run();
        worker2.start();

        System.out.println("main() - end");
    }
}
