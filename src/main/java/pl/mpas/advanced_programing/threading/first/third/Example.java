package pl.mpas.advanced_programing.threading.first.third;

public class Example {

    public static void main(String[] args) {

        Runnable deamonJob = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Run by: " + Thread.currentThread().getName() +
                        "Iteration: " + (i + 1));
            }
        };

        Runnable spawnJob = () -> {
            for (int i = 0; i < 3; i++) {
                String deamonName = Thread.currentThread().getName() + "-" + "deamon-" + i;
                Thread newOne = new Thread(deamonJob);
                newOne.setDaemon(true);
                newOne.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread janusz = new Thread(spawnJob, "janusz");
        janusz.setPriority(Thread.MAX_PRIORITY);
        janusz.start();
        Thread andrzej = new Thread(spawnJob, "andrzej");
        janusz.setPriority(Thread.MIN_PRIORITY);
        janusz.start();

    }
}

//        Runnable cars = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Go by " + Thread.currentThread().getName() +
//                        ", number: " + (i + 1));
//            }
//        };
//
//        Thread car1 = new Thread(cars, "Mazda");
//        for (int i = 0; i < 3; i++) {
//            new Thread("car1Daemon" + i).setDaemon(true);
//
//            car1.start();
//        }
//
//        Thread car2 = new Thread(cars, "BMW");
//        for (int i = 0; i < 3; i++) {
//            new Thread("car2Daemon" + i).setDaemon(true);
//
//            car2.start();
//
//        }
//    }
