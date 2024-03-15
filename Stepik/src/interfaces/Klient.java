package interfaces;

public class Klient{
    public void order(Waiter waiter, String dish){
        waiter.bringOrder(dish);
    }
}
