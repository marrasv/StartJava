package example;

public class Dog {
    String name;
    String rasse;
    int weight;
    int velocity;
    String getInfoDog(){
        return ("Имя " + name + "\nПорода " + rasse + "\nВес " + String.valueOf(weight));
    }

    void run(){
        for(int i = 1; i <= velocity; i++){
            System.out.println("Бегу!");
        }
    }
}
