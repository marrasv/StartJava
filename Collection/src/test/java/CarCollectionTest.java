import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarCollectionTest {

    private CarCollection<Car> carCollection;

    @BeforeEach
    void setUp() {
        carCollection = new CarArrayList<>();
//        carCollection = new CarLinkedList<>();
//        carCollection = new CarLinkedList<>();
        for (int i = 0; i < 100; i++) {
            carCollection.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void contain() {
        assertTrue(carCollection.contain(new Car("Brand5", 5)));
        assertFalse(carCollection.contain(new Car("Brand25", 5)));
    }
    @Test

    public void testForEach(){
        int index = 0;
        for (Car car: carCollection){
            index++;
        }
        assertEquals(100, index);
    }
}