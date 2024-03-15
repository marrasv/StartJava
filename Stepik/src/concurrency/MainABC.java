package concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainABC {
    static final Object monitor = new Object();
    static int counter = 1;

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (counter % 3 != 1) {
                                monitor.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("A");
                        counter++;
                        monitor.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (counter % 3 != 2) {
                                monitor.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("B");
                        counter++;
                        monitor.notifyAll();

                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (counter % 3 != 0) {
                                monitor.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("C");
                        counter++;
                        monitor.notifyAll();
                    }
                }
            }
        }).start();

//        for (int i = 0; i < 5; i++) {
//            blockingQueue.add(task1);
//            blockingQueue.add(task2);
//            blockingQueue.add(task3);
//        }
//        for (int i = 0; i < 5; i++){
//            thread1.start();
//
//        }
    }
}
