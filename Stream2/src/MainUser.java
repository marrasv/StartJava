import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MainUser {

    public static void main(String[] args) {
        List<Float> numbers = new ArrayList<>();
        for (int i = 0; i < 30_000_000; i++) {
            numbers.add((float) i);
        }
        long before = System.currentTimeMillis();
        numbers.stream()
                .map((number) -> Math.sin(0.2f + number / 5) * Math.cos(0.2f + number / 5) * Math.cos(0.4f + number / 2))
                .collect(Collectors.toList());
        long after = System.currentTimeMillis();
        System.out.println(after - before);

        long before1 = System.currentTimeMillis();
        numbers.parallelStream()
                .map((number) -> Math.sin(0.2f + number / 5) * Math.cos(0.2f + number / 5) * Math.cos(0.4f + number / 2))
                .collect(Collectors.toList());
        long after1 = System.currentTimeMillis();
        System.out.println(after1 - before1);

//        List<User> team = new ArrayList<>();
//        team.add(new User("Alex", 23));
//        team.add(new User("Max", 56));
//        team.add(new User("Mara", 43));
//        team.add(new User("Kate", 17));
//        team.add(new User("John", 31));
//        team.add(new User("Lisa", 13));
//
//        List<User> newList = new ArrayList<>();
//        newList = team.stream()
//                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
//                .limit(3)
//                .collect(Collectors.toList());
//        for (User user: newList){
//            System.out.println(user.getName() + " " + user.getAge());
//        }
//
//        for(User user: newList) System.out.println(user);
//        team.stream()
//                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
//                .limit(3)
//                .forEach(System.out::println);
//
//        Optional<User> oldest = team.stream()
//                .filter((user) -> user.getAge() < 5)
//                .max((Comparator.comparingInt(User::getAge)));
//        oldest.ifPresentOrElse(System.out::println,()-> System.out.println("User not found"));
//
//        team.stream()
//                .filter(user -> user.getName().contains("a"))
//                .findAny()
//                .ifPresentOrElse(System.out::println,() -> System.out.println("Nix"));
    }
}