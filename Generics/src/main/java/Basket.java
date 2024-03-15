import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {
    List<T> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double weight1 = 0;
        for (T element : fruits) {
            weight1 += element.getWeight();
        }
        return weight1;
    }

    public static <U extends Fruit> void transfer(Basket<? extends U> src, Basket<? super U> dst) {
        dst.fruits.addAll(src.fruits);
        src.fruits.clear();
    }

    public int compare(Basket<?> anotherBasket) {
        return Double.compare(this.getWeight(), anotherBasket.getWeight());
    }
}
