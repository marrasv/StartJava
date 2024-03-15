import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarMapTest {
    CarMap<CarOwner,Car> map;


    @BeforeEach
    void setUp() {
        map = new CarHashMap<>();
    }

    @Test
    public void whenPut100ElementsThenSizeBecome100() {
        for (int i = 0; i < 10; i++) {
            map.put(new CarOwner(i, "Name" + i, "lastName" + i), new Car("Brand" + i, i));
        }
        assertEquals(10, map.size());
    }

    @Test
    public void whenPutElementThenSizeIs101() {
        for (int i = 0; i < 100; i++) {
            map.put(new CarOwner(i, "Name" + i, "lastName" + i), new Car("Brand" + i, i));
        }
        assertEquals(100, map.size());
        map.put(new CarOwner(100, "Mara", "Musterfrau"), new Car("Qashkai", 455));
        assertEquals(101, map.size());
    }

    @Test
    public void whenPut100ElementsWith10KeyThenSize10() {
        int index;
        for (int i = 0; i < 100; i++) {
            index = i % 10;
            map.put(new CarOwner(index, "Name" + index, "lastName" + index), new Car("Brand" + index, index));
        }
        assertEquals(10, map.size());
    }

    @Test
    public void whenPutElementThanElementInSet() {
        for (int i = 0; i < 100; i++) {
            map.put(new CarOwner(i, "Name" + i, "lastName" + i), new Car("Brand" + i, i));
        }
        CarOwner mara = new CarOwner(100, "Mara", "Musterfrau");
        Car car = new Car("Qashkai", 455);
        map.put(mara, car);
        assertEquals("Qashkai", map.get(mara).getBrand());
    }


    @Test
    void removeTest() {
        for (int i = 0; i < 100; i++) {
            map.put(new CarOwner(i, "Name" + i, "lastName" + i), new Car("Brand" + i, i));
        }
        assertTrue(map.remove(new CarOwner(5,"Name5", "lastName5")));
        assertEquals(99, map.size());
        assertFalse(map.remove(new CarOwner(5,"Name5", "lastName5")));
    }

    @Test
    void countOfKeysMustBeEqualsCountOfValues() {
        for (int i = 0; i < 100; i++) {
            map.put(new CarOwner(i, "Name" + i, "lastName" + i), new Car("Brand" + i, i));
        }
        assertEquals(100,map.size());
        assertEquals(100,map.keySet().size());
        assertEquals(100,map.values().size());
    }

}