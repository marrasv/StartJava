import java.util.ArrayList;
import java.util.List;

public class MainFilter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int)( Math.random() * 1000));
        }
        List<Integer> filtered = filterM(list,(n) -> n > 800);
        List<String> mapped = map(filtered);
        for (String str: mapped){
            System.out.println(str);
        }
    }
    private static List<String> map(List<Integer> numbers){
        List<String> result = new ArrayList<>();
        for (int number: numbers){
            result.add("Number " + number);
        }
        return result;
    }

    private static List<Integer> filterM(List<Integer> list, Predicate predicate){
        List<Integer> result = new ArrayList<>();
        for (Integer number: list){
            if (predicate.test(number)){
                result.add(number);
            }
        }
        return result;
    }
}
