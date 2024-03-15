import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

//    private static Calculator calculator;
//
//    @BeforeAll
//    public static void setUp() {
//        calculator = new Calculator();
//    }

    @Test
    void add10to15result15() {
        double expected = 15;
        double result = calculator.add(10, 5);
        assertEquals(expected, result);
    }

    @Test
    void add150to50result150() {
        double expected2 = 150;
        double result2 = calculator.add(100, 50);
        assertEquals(expected2, result2);
    }

    @Test
    void add150to50result150string() {
        double expected2 = 150;
        double result2 = calculator.add("100", "50");
        assertEquals(expected2, result2);
    }

    @Test
    void addIncorrectString() {
        Assertions.assertThrows(NumberFormatException.class, () -> calculator.add("asd", "5"));
    }

    @Test
    void multiply() {
        double expected = 50;
        double result = calculator.multiply(10, 5);
        assertEquals(expected, result);
        double expected2 = 50;
        double result2 = calculator.multiply(1, 50);
        assertEquals(expected2, result2);
    }

    @Test
    void divide() {
        double expected = 2;
        double result = calculator.divide(10, 5);
        assertEquals(expected, result);
        double expected2 = 2;
        double result2 = calculator.divide(100, 50);
        assertEquals(expected2, result2);
    }

    @Test
    void pow() {
        double expected = 100;
        double result = calculator.pow(10, 2);
        assertEquals(expected, result);
        double expected2 = 8;
        double result2 = calculator.pow(2, 3);
        assertEquals(expected2, result2);
        double expected3 = 4;
        double result3 = calculator.pow(2, 2);
        assertEquals(expected3, result3, 0.0001);
    }

    @Test
    void testMultiply() {
        double expected3 = 4;
        double result3 = calculator.multiply(2);
        assertEquals(expected3, result3, 0.0001);
    }

    @AfterEach
    public void close() {
        calculator = null;
    }
}