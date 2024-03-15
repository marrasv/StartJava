package concurrency;

public class Bankomat {
    private int sumInBankomat;
    private final Object monitor = new Object();

    public int getSumInBankomat() {
        return sumInBankomat;
    }

    public void setSumInBankomat(int sumInBankomat) {
        this.sumInBankomat = sumInBankomat;
    }

    public Bankomat(int sumInBankomat) {
        this.sumInBankomat = sumInBankomat;
    }

    public void giveMoney(String name, int summa) {
        synchronized (monitor) {
            System.out.println(name + " подошёл к банкомату");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (summa <= sumInBankomat) {
                System.out.println(name + " вывел " + summa + " рублей. ");
                sumInBankomat -= summa;
                System.out.println("После " + name + " В банкомате осталось " + sumInBankomat + " рублей");
            } else {
                System.out.println("В банкомате недостаточно рублей для " + name);
            }
        }
    }
}
