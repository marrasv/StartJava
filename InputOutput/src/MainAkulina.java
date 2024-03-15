import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class MainAkulina {
    public static void main(String[] args) {
        File file = new File("file.txt");
        char[] array = new char[8];
        StringBuilder result = new StringBuilder();
        int count = 0;
        try (Reader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
            count = reader.read(array);
            while(count>0) {
                result.append(array, 0, count);
                count = reader.read(array);
            }
            Arrays.stream(String.valueOf(result).split(" "))
                    .filter((s) -> s.startsWith("А"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
