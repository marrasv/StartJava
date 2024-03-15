package interfaces;

public class Cat extends Animal implements AbleToRun{
    public void eat(){
        System.out.println("Кошачий корм");
    }

    @Override
    public void run() {
        System.out.println("Кошка бежит");
    }
}
