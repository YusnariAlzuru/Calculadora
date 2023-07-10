import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testSuma() {
        Calculator calculator = new Calculator();
        double resultado = calculator.suma(2, 3);
        Assertions.assertEquals(5, resultado, "La suma debe ser 5");
    }

    @Test
    public void testResta() {
        Calculator calculator = new Calculator();
        double resultado = calculator.resta(5, 3);
        Assertions.assertEquals(2, resultado, "La resta debe ser 2");
    }

    @Test
    public void testMultiplicacion() {
        Calculator calculator = new Calculator();
        double resultado = calculator.multiplicacion(4, 5);
        Assertions.assertEquals(20, resultado, "La multiplicación debe ser 20");
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double resultado = calculator.division(10, 2);
        Assertions.assertEquals(5.0, resultado, "La división debe ser 5.0");
    }
}