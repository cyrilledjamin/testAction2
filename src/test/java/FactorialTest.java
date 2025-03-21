import org.example.Factorial;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial() {
        assertEquals(1, Factorial.calculate(0));
        assertEquals(1, Factorial.calculate(1));
        assertEquals(2, Factorial.calculate(2));
        assertEquals(6, Factorial.calculate(3));
        assertEquals(24, Factorial.calculate(4));
        assertEquals(120, Factorial.calculate(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumber() {
        Factorial.calculate(-1);
    }
}
