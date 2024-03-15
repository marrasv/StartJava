import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarSetTest {

    private CarSet carset;
    private int size;

    @BeforeEach
    void setUp() {
        carset = new CarHashSet();
        for (int i = 0; i < 100; i++) {
            carset.add(new Car("Brand" + i, i));
        }
    }

    @Test
    void whenAddThreeSimilarObjectsMustBeOnlyOne() {
        assertEquals(100, carset.size());
        assertTrue(carset.add(new Car("VW", 5)));
        assertFalse(carset.add(new Car("VW", 5)));
        assertFalse(carset.add(new Car("VW", 5)));
        assertEquals(101, carset.size());
    }

    @Test
    void whenAddCarSizeIncrease() {
        assertEquals(100, carset.size());
        Car car = new Car("BMW", 777);
        carset.add(car);
        assertEquals(101, carset.size());
    }

    @Test
    void whenRemoveCarSizeDecrease() {
        assertTrue(carset.remove(new Car ("Brand5", 5)));
        assertEquals(99, carset.size());
    }

    @Test
    void whenRemoveNotExistedCar() {
        Car car = new Car("ABC", 123);
        assertFalse(carset.remove(car));
    }


    @Test
    void clear() {
        assertEquals(100, carset.size());
        carset.clear();
        assertEquals(0, carset.size());
    }

    @Test
    void whenElementExistReturnTrue() {
        Car car = new Car("Brand5",5);
        assertTrue(carset.contain(car));
    }
}