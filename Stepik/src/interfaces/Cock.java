package interfaces;

public class Cock implements Worker, Driver{
    @Override
    public void work() {
        System.out.println("Cock works");
    }

    @Override
    public void drive() {
        System.out.println("Cock drives");
    }
}

