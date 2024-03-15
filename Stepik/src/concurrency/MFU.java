package concurrency;

public class MFU {
    private final Object monitor = new Object();

    public void print(int pages) {

        for (int i = 0; i < pages; i++) {
            synchronized (monitor) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Printed " + (i + 1) + " pages");
            }
        }
    }

    public void scan(int pages) {

        for (int i = 0; i < pages; i++) {
            synchronized (monitor) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Scanned " + (i + 1) + " pages");
            }
        }
    }
}
