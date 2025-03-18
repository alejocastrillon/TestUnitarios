import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

class CalculadoraTest {

    @Test
    void testSuma() {
        int res = Calculadora.suma(2, 3);
        assertEquals(5, res);
    }

    @Test
    void testResta() {
        int res = Calculadora.resta(8, 3);
        assertEquals(5, res);
    }

}
