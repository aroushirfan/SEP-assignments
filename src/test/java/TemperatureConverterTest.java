import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testFahrenheitToCelsius() {
        double result1 = converter.fahrenheitToCelsius(50);
        assertEquals(10, result1, 0.01);
        double result2 = converter.fahrenheitToCelsius(32);
        assertEquals(0, result2, 0.01);
    }
    @Test
    public void testCelsiusToFahrenheit() {
        double result1 = converter.celsiusToFahrenheit(10);
        assertEquals(50, result1, 0.01);
        double result2 = converter.celsiusToFahrenheit(0);
        assertEquals(32, result2, 0.01);
    }
    @Test
    public void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-50));
        assertTrue(converter.isExtremeTemperature(60));
        assertFalse(converter.isExtremeTemperature(45));
    }
}
