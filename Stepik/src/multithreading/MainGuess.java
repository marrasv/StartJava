package multithreading;

import java.util.Random;

public class MainGuess {
    static boolean isGuessed = false;
    static int bound = 1_000_000_000;

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(bound);
        System.out.println(number);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isGuessed) {
                    int numberThread = random.nextInt(bound);
                    if (number == numberThread) {
                        isGuessed = true;
                        System.out.printf("Number %d?\n", numberThread);
                    }
                }
            }
        });
        thread1.start();
        Thread threadTimer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (isGuessed) {
                        System.out.println("Угадал за " + i + " sec");
                        break;
                    }
                    System.out.println(i + " sec");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        threadTimer.start();
    }
}
