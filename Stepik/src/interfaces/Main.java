package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Bird bird = new Bird();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        //animals.add(fish);
        animals.add(bird);
        for (Animal animal: animals){
            animal.eat();
        }
        ArrayList<AbleToRun> animalsRun = new ArrayList<>();
        animalsRun.add(cat);
        animalsRun.add(dog);
        //animals.add(fish);
        animalsRun.add(bird);
        for (AbleToRun animal: animalsRun){
            animal.run();
        }
        AbleToFly birdFly = new Bird();
        birdFly.fly();
    }
}
