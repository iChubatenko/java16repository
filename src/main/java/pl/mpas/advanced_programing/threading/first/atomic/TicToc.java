package pl.mpas.advanced_programing.threading.first.atomic;

public class TicToc {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            System.out.println("Tik");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tak");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
