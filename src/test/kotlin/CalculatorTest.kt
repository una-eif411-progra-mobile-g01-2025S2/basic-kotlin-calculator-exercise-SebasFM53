import org.example.Calculator
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    // Test de suma
    @Test
    fun testAddition() {
        val result = calculator.addition(5.0, 3.0)
        assertEquals(8.0, result, "5 + 3 debería ser 8")
    }

    // Test de resta
    @Test
    fun testSubtraction() {
        val result = calculator.subtract(10.0, 4.0)
        assertEquals(6.0, result, "10 - 4 debería ser 6")
    }

    // Test de multiplicación
    @Test
    fun testMultiplication() {
        val result = calculator.multiply(7.0, 6.0)
        assertEquals(42.0, result, "7 * 6 debería ser 42")
    }

    // Test de división
    @Test
    fun testDivision() {
        val result = calculator.divide(20.0, 4.0)
        assertEquals(5.0, result, "20 / 4 debería ser 5")
    }

    // Test de error (división por cero)
    @Test
    fun testErrorCases() {
        assertFailsWith<IllegalArgumentException> {
            calculator.divide(10.0, 0.0)
        }
    }
}
