package inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        Triangle tri = new Triangle(10,5,5);
        System.out.println(rect.perim());
        System.out.println(tri.perim());
//        BoxWeight boxW = new BoxWeight();
//        boxW.showInfo();
//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        System.out.println(cat.legs + " " + cat.eyes + " " + cat.canEatPerson);
//        System.out.println(lion.canEatPerson);
//        cat.eat();
//        lion.eat();
    }
}
