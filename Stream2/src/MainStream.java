import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add((int)( Math.random() * 100) + 100);
        }
        List<String> filtered = numbers.stream()
                .filter((n) -> (n % 5 == 0)&&(n % 2 ==0))
                .map(Math::sqrt)
                .map((n)->"Root: " + n)
                .toList();
        for (String s: filtered){
            System.out.println(s);
        }
//        List<Integer> filtered = filter(list,(n) -> n > 800);
//        List<String> mapped = map(filtered);
//        for (String str: mapped){
//            System.out.println(str);
//        }
    }
}
