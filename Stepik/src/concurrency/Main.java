package concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        System.out.print(".");
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Future<String> futureName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "John";
            }
        });
//        try {
//            String name = futureName.get();
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
        Future<Integer> futureAge = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(10000);
                return 25;
            }
        });
//        try {
//            int age = futureAge.get();
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
        executorService.shutdown();
        try {
            System.out.println("\nName " + futureName.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("\nage " + futureAge.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
//=====================================================================================================================
//    public static void main(String[] args) {
//        long before = System.currentTimeMillis();
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        CountDownLatch countDawnLatch = new CountDownLatch(3);
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                long sum = 0;
//                for (int i = 0; i < 1_000_000; i++){
//                    if (i % 2 == 0){
//                        sum += i;
//                    }
//                }
//                System.out.println("Summa %2 = " + sum);
//                countDawnLatch.countDown();
//            }
//        });
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                long sum2 = 0;
//                for (int i = 0; i < 1_000_000; i++){
//                    if (i % 7 == 0){
//                        sum2 += i;
//                    }
//                }
//                System.out.println("Summa %7 = " + sum2);
//                countDawnLatch.countDown();
//            }
//        });
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                List<Integer> list = new ArrayList<>();
//                for (int i = 0; i < 1000; i++) {
//                    list.add((int) (Math.random() * 1000));
//                }
//                int sum = 0;
//                for (int i = 0; i < list.size(); i++){
//                    if (list.get(i) % 2 == 0){
//                        sum++;
//                    }
//                }
//                System.out.println("Summa List %2 = " + sum);
//                countDawnLatch.countDown();
//            }
//        });
//        executorService.shutdown();
//        try {
//            countDawnLatch.await();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        long after = System.currentTimeMillis();
//        System.out.println("3 Thread time = " + (after - before) + "ms");
//=======================================================================================================================

//            final int index = i;
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("Start " + index);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("Finish " + index);
//                    countDawnLatch.countDown();
//                }
//            });
//        }
//        try {
//            countDawnLatch.await();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("All threads are terminated");


//        =================================================================
//    public static void main(String[] args) {
//        Bankomat bankomat = new Bankomat(1000);
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                bankomat.giveMoney("Max", 500);
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                bankomat.giveMoney("Alex", 400);
//            }
//        });
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                bankomat.giveMoney("Mara", 300);
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//    =================================================================
//    public static final int CAPACITY = 50_000_000;
//    private static final float[] array = new float[CAPACITY];
//
//    public static void withoutConcurrency() {
//        Arrays.fill(array, 1f);
//        long before = System.currentTimeMillis();
//        for (int i = 0; i < CAPACITY; i++) {
//            float f = (float) i;
//            array[i] = (float) (array[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
//        }
//        long after = System.currentTimeMillis();
//        System.out.println("withoutConcurrency " + (after - before) + "ms");
//    }
//
//    public static void withConcurrency() {
//        Arrays.fill(array, 1f);
//        long before = System.currentTimeMillis();
//        float[] array1 = new float[CAPACITY / 2];
//        System.arraycopy(array, 0, array1, 0, CAPACITY / 2);
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < array1.length; i++) {
//                float f = (float) i;
//                array1[i] = (float) (array1[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5)
//                        * Math.cos(0.4f + f / 2));
//            }
//        });
//
//        float[] array2 = new float[CAPACITY / 2];
//        System.arraycopy(array, CAPACITY / 2 - 1, array2, 0, CAPACITY / 2);
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < array2.length; i++) {
//                    float f = (float) i;
//                    array2[i] = (float) (array2[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5)
//                            * Math.cos(0.4f + f / 2));
//                }
//            }
//        });
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.arraycopy(array1, 0, array, 0, array1.length);
//        System.arraycopy(array2, 0, array, array1.length, array2.length);
//        long after = System.currentTimeMillis();
//        System.out.println("withConcurrency " + (after - before) + "ms");
//    }
//    public static void startTimer(){
//        Thread timer = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int seconds = 0;
//                try {
//                    while (true){
//                        System.out.println(seconds++);
//                        Thread.sleep(1000);
//                    }
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        timer.setDaemon(true);
//        timer.start();
//    }
//    ==================================================================
//    public static void main(String[] args) {
//        Counter counter = new Counter();
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++){
//                    counter.inc();
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++){
//                    counter.dec();
//                }
//            }
//        });
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(counter.getValue());
//    }

}
