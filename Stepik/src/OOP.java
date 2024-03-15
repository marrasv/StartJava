// import example.Monstr;
import example.MyArrayList;
import example.Person;

public class OOP {
    public static void main(String[] args) {
        String text = "This is John. He is 27 years old.";
        String name = text.substring(8,12);
        int age = Integer.parseInt(text.substring(20,22));
        Person pers = new Person(name,age);
        System.out.println(pers.getName());
        System.out.println(pers.getAge());
//        MyArrayList employees = getEmployee();
//        employees.remove("Lisa");
//        employees.add("Tolik");
//        for (int i = 0; i< employees.getSize(); i++){
//            System.out.println(employees.getName(i));
//        }

//        Monstr monstr = new Monstr(5);
//        monstr.voice(3,"Aaaaaaaaaaaaaaa...........");
//        monstr.showInfoMonstr();
//        Monstr monstr2 = monstr.copy();
//        monstr2.showInfoMonstr();
//        Employee emp = new Employee("Max","postbote", 1234);
//        emp.showInfo();
//        Rectangle rect = new Rectangle();
//        rect.setDimension(12,34);
//        System.out.println(rect.getSquare());
//        Dog dog = new Dog();
//        dog.name = "zrgf";
//        dog.rasse = "ug";
//        dog. weight = 10;
//        dog.velocity = 5;
//        System.out.println(dog.getInfoDog());
//        dog.run();

    }
//    private static MyArrayList getEmployee(){
//        MyArrayList employee = new MyArrayList();
//        employee.add("Max");
//        employee.add("Mara");
//        employee.add("Kate");
//        employee.add("Lisa");
//        return employee;
//    }
}
