import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void boxTest() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            numbers.add(i);
        }
        List<Integer> numbers2 = new ArrayList<>();
        Box.transfer(numbers, numbers2);
        assertEquals(100, numbers2.size());
        assertEquals(0, numbers.size());
//        Box<Integer> box1 = new Box<>(1, 2, 3);
//        Box<Float> box3 = new Box<>(1f, 2f, 3f);
//        assertEquals(2,box1.avg(),0.001);
//        assertEquals(0, box1.compare(box3));
//        Box<String, Integer, Float> box1 = new Box<>("box first", 20, 23f);
//        Box<String, Integer, Float> box2 = new Box<>("box second", 10, 29f);
//        int result = (int)(box1.getValue() + box1.getNorma() + box2.getValue() + box2.getNorma());
//        assertEquals(82, result);
    }

}