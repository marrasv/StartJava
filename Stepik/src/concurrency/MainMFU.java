package concurrency;

public class MainMFU {
    static MFU mfu = new MFU();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.print(15);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan(15);
            }
        }).start();
    }
}
