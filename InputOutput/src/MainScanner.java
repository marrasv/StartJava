import java.io.*;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) throws IOException {
        File file = new File("text3");
        System.out.println("Your name: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder text = new StringBuilder();
        while (!word.equals("Exit")) {
            text.append(word).append(" ");
            word = scanner.nextLine();
        }
        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(text.toString().getBytes());

        } catch (
                Exception e) {
            throw new RuntimeException(e);
        }
        byte[] array = new byte[8];
        int count = 0;
        text.delete(0,text.length());

        try(InputStream inputStream = new FileInputStream(file)) {
            count = inputStream.read(array);
            while (count>0) {
                text.append(new String(array, 0, count));
                count = inputStream.read(array);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(text);
    }
}