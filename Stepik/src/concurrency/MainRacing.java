package concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class MainRacing {
    private static int winnerNumber = -1;
    static final int NUMBER_PLAYERS = 10;
    static final int CAPACITY_TUNNEL = 3;
    static Map<Integer, Long> list = new ConcurrentHashMap<>();
    static List<Integer> orderOnFinish = new ArrayList<>();

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(NUMBER_PLAYERS);
        CountDownLatch countDownLatch2 = new CountDownLatch(NUMBER_PLAYERS);
        Semaphore semaphore = new Semaphore(CAPACITY_TUNNEL);
        Object monitor = new Object();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    String name = Thread.currentThread().getName();
                    System.out.println("Car" + name + "...");
                    sleep();
                    System.out.println("Car" + name + " is ready");
                    countDownLatch.countDown();
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    long before = System.currentTimeMillis();
                    System.out.println("Start " + name + " I-- first part ");
                    sleep();
                    System.out.println("Finish " + name + " first part --I");
                    try {
                        semaphore.acquire();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Start " + name + " .................<<<<<<<tunnel");
                    sleep();
                    System.out.println("Finish " + name + " .......................tunnel>>>>>> and start second part");
                    semaphore.release();
                    sleep();
                    System.out.println("Finish " + name + "-------------------------------------------------------- second part FINISH");
                    orderOnFinish.add(Integer.parseInt(Thread.currentThread().getName()));
                    synchronized (monitor) {
                        if (winnerNumber < 0) {
                            winnerNumber = Integer.parseInt(Thread.currentThread().getName());
                        }
                    }
                    long after = System.currentTimeMillis();
                    list.put(Integer.parseInt(name), after - before);
                    countDownLatch2.countDown();
                }
            }, Integer.toString(i)).start();
        }
        try {
            countDownLatch2.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nWINNER Car N" + winnerNumber + "!");
        for(Integer number: orderOnFinish){
            System.out.println("Car N" + number + " - " + list.get(number) + "ms");
        }
    }

    private static void sleep() {
        try {
            Thread.sleep((int) (Math.random() * 100) + 500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
