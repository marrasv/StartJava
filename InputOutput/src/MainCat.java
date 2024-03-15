import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainCat {
    public static void main(String[] args) {
        List<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(new Cat("Alex", "A", 12));
        listOfCats.add(new Cat("Bella", "B", 2));
        listOfCats.add(new Cat("Con", "C", 5));
        listOfCats.add(new Cat("Duck", "D", 12));
        listOfCats.add(new Cat("Elba", "E", 7));
        listOfCats.add(new Cat("Frank", "F", 6));

        File file = new File("cats.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(listOfCats);
//            for (Cat listOfCat : listOfCats) {
//                objectOutputStream.writeObject(listOfCat);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            List<Cat> cats = (List<Cat>) objectInputStream.readObject();
            for(Cat cat:cats){
                System.out.println(cat.getNickName());
            }
//            for (int i = 0; i < listOfCats.size(); i++) {
//                Cat cat = (Cat) objectInputStream.readObject();
//                System.out.println(cat.getNickName());
//            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
