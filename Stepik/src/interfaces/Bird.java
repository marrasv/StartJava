package interfaces;

public class Bird extends Animal implements AbleToRun, AbleToFly{
    public void eat(){
        System.out.println("Птичий корм");
    }

    @Override
    public void run() {
        System.out.println("Птица бежит");
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}

