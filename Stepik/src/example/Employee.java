package example;

public class Employee {
    String name;
    String beruf;
    int salary;
    Employee(String name, String beruf, int salary){
        this.name = name;
        this.beruf = beruf;
        this.salary = salary;
    }

    void showInfo(){
        System.out.println("Имя " + name + "\nДолжность " + beruf + "\nЗарплата " + salary);
    }
}
