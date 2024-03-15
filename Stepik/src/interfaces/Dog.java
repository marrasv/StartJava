package interfaces;

public class Dog extends Animal implements AbleToRun{
    public void eat(){
        System.out.println("Собачий корм");
    }
    public void run(){
        System.out.println("Собака бежит");
    }
}
