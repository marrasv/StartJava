import java.io.*;

public class MainUser {
    public static void main(String[] args) {
        File file = new File("user.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        User user = new User("Alex", "Smith", 23, new Address("Bigstreet", 5));
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            User savedUser = (User)objectInputStream.readObject();
            System.out.println(savedUser);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
