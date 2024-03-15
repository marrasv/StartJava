package interfaces;

public class MainWaiter {
    public static void main(String[] args) {
        Klient klient1 = new Klient();
        WaiterBob waiterBob = new WaiterBob();
        klient1.order(waiterBob,"hering");

        Klient klient2 = new Klient();
        klient2.order(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Waiter brings dish - " + dish);
            }
        }, "hering");
    }
}
