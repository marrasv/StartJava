import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class CarListTest {
    private CarList<Car> carlist;

    @BeforeEach
    public void setUp(){
        carlist = new CarLinkedList<>();
//        carlist = new CarArrayList();
        for (int i = 0; i < 100; i++) {
            carlist.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void whenAdd100ThenMustBe100() {
        assertEquals(100, carlist.size());

    }

    @Test
    public void whenElementByIndexRemovedThenSizeMustBeDecreased() {
        assertTrue(carlist.removeAt(5));
        assertEquals(99, carlist.size());

    }

    @Test
    public void whenElementRemovedThenSizeMustBeDecreased() {
        Car car = new Car("Q", 455);
        carlist.add(car);
        assertEquals(101, carlist.size());
        assertTrue(carlist.remove(car));
        assertEquals(100, carlist.size());
    }

    @Test
    public void whenRemoveNotExistElementThenMustBeException() {
        Car car = new Car("Q", 455);
        assertFalse(carlist.remove(car));
        assertEquals(100, carlist.size());
    }

    @Test
    public void whenListClearedThenSizeMustBe0() {
        carlist.clear();
        assertEquals(0, carlist.size());
    }

    @Test //(expected = IndexOutOfBoundsException.class)
    public void whenOutOfSizeThenThrowException() {
        assertThrows(IndexOutOfBoundsException.class, () -> carlist.get(1000));
    }

//    @Test
//    public void testFooThrowsIndexOutOfBoundsException() {
//        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> carlist.get(100));
//        assertEquals("expected messages", exception.getMessage());
//    }
    @Test
    public void methodGetReturnedRightValue() {
        Car car = carlist.get(0);
        assertEquals("Brand0",car.getBrand());
    }
    @Test
    public void insertIntoMiddle(){
        Car car = new Car("BMW",455);
        carlist.add(car,50);
        Car carFromList = carlist.get(50);
        assertEquals("BMW",carFromList.getBrand());
    }

    @Test
    public void insertIntoFirstPosition(){
        Car car = new Car("BMW",455);
        carlist.add(car,0);
        Car carFromList = carlist.get(0);
        assertEquals("BMW",carFromList.getBrand());
    }

    @Test
    public void insertIntoLastPosition(){
        Car car = new Car("BMW",455);
        carlist.add(car, 100);
        Car carFromList = carlist.get(100);
        assertEquals("BMW",carFromList.getBrand());
    }

    @Test
    void whenElementExistReturnTrue() {
        Car car = new Car("Brand5",5);
        assertTrue(carlist.contain(car));
    }

    @Test
    void whenElementNotExistReturnFalse() {
        Car car = new Car("Brand500",5);
        assertFalse(carlist.contain(car));
    }
}