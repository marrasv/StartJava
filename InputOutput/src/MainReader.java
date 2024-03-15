import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainReader {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (Reader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
            long before = System.currentTimeMillis();
            int a = reader.read();
            StringBuilder result = new StringBuilder();
            while (a != -1) {
                result.append((char) a);
                a = reader.read();
            }
            System.out.print(result);
            long after = System.currentTimeMillis();
            System.out.println((after - before) + "ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//end psvm
}
