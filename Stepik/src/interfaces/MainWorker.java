package interfaces;

import java.util.ArrayList;

public class MainWorker {
    public static void main(String[] args) {
        Director dire = new Director();
        Programmer prog = new Programmer();
        Cock cock = new Cock();
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(dire);
        workers.add(prog);
        workers.add(cock);
        for(Worker worker: workers){
            worker.work();
        }
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(prog);
        drivers.add(cock);
        for(Driver driver:drivers){
            driver.drive();
        }
    }
}
