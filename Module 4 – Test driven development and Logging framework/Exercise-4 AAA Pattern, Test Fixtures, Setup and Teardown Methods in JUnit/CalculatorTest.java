import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    //  Setup before each test
    @Before
    public void setUp() {
        calc = new Calculator();  // Arrange
        System.out.println("Setup: Calculator instance created.");
    }

    //  Test using AAA pattern
    @Test
    public void testAddition() {
        // Act
        int result = calc.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calc.subtract(10, 3);

        // Assert
        assertEquals(7, result);
    }

    // Teardown after each test
    @After
    public void tearDown() {
        System.out.println("Teardown: Test finished.\n");
    }
}
