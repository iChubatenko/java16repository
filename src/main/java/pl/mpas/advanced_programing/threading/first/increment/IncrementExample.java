package pl.mpas.advanced_programing.threading.first.increment;

class  Job implements Runnable {
    private long toIncrement = 0;
    private static int staticIncrement = 1;

    static public void  incStatic() {

        synchronized (Job.class) {
            staticIncrement++;
        }
    }

    @Override
    public String toString() {
        return "toIncrement: " + toIncrement;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Increased by thread: " + Thread.currentThread().getName());
            synchronized (this) {
                toIncrement++;
            }
        }
    }
}

    public class IncrementExample {

        public static void main(String[] args) {
            Job job = new Job();

            Thread worker1 = new Thread(job, "janusz");
            Thread worker2 = new Thread(job, "andrzej");
            worker1.start();
            worker2.start();

            try {
                worker1.join();
                worker2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Current job value: " + job);
        }
    }
