import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarQueueTest {
    private CarQueue<Car> queque;

    @BeforeEach
    void setUp() {
        queque = new CarLinkedList();
        for (int i = 0; i < 10; i++) {
            queque.add(new Car("Brand" + i, i));
        }
    }

    @Test
    void add() {
        assertEquals(10, queque.size());
    }

    @Test
    void peek() {
        Car car = queque.peek();
        assertEquals("Brand0", car.getBrand());
        assertEquals(10, queque.size());
    }

    @Test
    void poll() {
        Car car = queque.poll();
        assertEquals("Brand0", car.getBrand());
        assertEquals(9, queque.size());
    }
}