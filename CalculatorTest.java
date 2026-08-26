import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Tests")
public class CalculatorTest {

    @Test
    @DisplayName("Addition: 5 + 3 should equal 8")
    void testAdd() {
        assertEquals(8.0, Calculator.add(5, 3));
    }

    @Test
    @DisplayName("Addition: negative numbers")
    void testAddNegative() {
        assertEquals(-5.0, Calculator.add(-2, -3));
    }

    @Test
    @DisplayName("Addition: positive and negative")
    void testAddMixed() {
        assertEquals(2.0, Calculator.add(5, -3));
    }

    @Test
    @DisplayName("Subtraction: 10 - 4 should equal 6")
    void testSubtract() {
        assertEquals(6.0, Calculator.subtract(10, 4));
    }

    @Test
    @DisplayName("Subtraction: negative result")
    void testSubtractNegative() {
        assertEquals(-5.0, Calculator.subtract(3, 8));
    }

    @Test
    @DisplayName("Subtraction: negative numbers")
    void testSubtractNegativeNumbers() {
        assertEquals(-1.0, Calculator.subtract(-5, -4));
    }

    @Test
    @DisplayName("Multiplication: 6 * 7 should equal 42")
    void testMultiply() {
        assertEquals(42.0, Calculator.multiply(6, 7));
    }

    @Test
    @DisplayName("Multiplication: by zero")
    void testMultiplyByZero() {
        assertEquals(0.0, Calculator.multiply(5, 0));
    }

    @Test
    @DisplayName("Multiplication: negative numbers")
    void testMultiplyNegative() {
        assertEquals(12.0, Calculator.multiply(-3, -4));
    }

    @Test
    @DisplayName("Multiplication: positive and negative")
    void testMultiplyMixed() {
        assertEquals(-15.0, Calculator.multiply(5, -3));
    }

    @Test
    @DisplayName("Division: 20 / 4 should equal 5")
    void testDivide() {
        assertEquals(5.0, Calculator.divide(20, 4));
    }

    @Test
    @DisplayName("Division: decimal result")
    void testDivideDecimal() {
        assertEquals(3.5, Calculator.divide(7, 2));
    }

    @Test
    @DisplayName("Division: by zero should return 0")
    void testDivideByZero() {
        assertEquals(0.0, Calculator.divide(10, 0));
    }

    @Test
    @DisplayName("Division: negative numbers")
    void testDivideNegative() {
        assertEquals(-4.0, Calculator.divide(-12, 3));
    }

    @Test
    @DisplayName("Division: both negative")
    void testDivideBothNegative() {
        assertEquals(2.0, Calculator.divide(-8, -4));
    }

    @Test
    @DisplayName("Division: divide zero")
    void testDivideZero() {
        assertEquals(0.0, Calculator.divide(0, 5));
    }
}
