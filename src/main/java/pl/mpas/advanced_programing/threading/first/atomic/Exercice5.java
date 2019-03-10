package pl.mpas.advanced_programing.threading.first.atomic;

public class Exercice5 {

    public static void main(String[] args) {
        Person ihor = new Person("Ihor", "Chubatenko", null);
        try {
            System.out.println("Before calling");
            synchronized (ihor) {
                ihor.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End...");
    }
}
