import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals: 2 + 3 should equal 5
        assertEquals(5, 2 + 3);

        // Assert true: 5 is greater than 3
        assertTrue(5 > 3);

        // Assert false: 5 is not less than 3
        assertFalse(5 < 3);

        // Assert null: the value is null
        assertNull(null);

        // Assert not null: the object is not null
        assertNotNull(new Object());
    }
}
