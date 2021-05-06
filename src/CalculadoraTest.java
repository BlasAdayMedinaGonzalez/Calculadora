import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class CalculadoraTest {
    @Test
       public void testSuma() {
        Calculadora c = new Calculadora(5,5);

        double expectedResult = 10;

        assertEquals(expectedResult, c.suma(5, 5));
       }


    @Test
       public void testResta() {
        Calculadora c = new Calculadora(5,5);

        double expectedResult = 0;

        assertEquals(expectedResult, c.resta(5, 5));
       }

    @Test
       public void testMultiplicacion() {
        Calculadora c = new Calculadora(5,5);

        double expectedResult = 25;

        assertEquals(expectedResult, c.multiplicacion(5, 5));
       }

    @Test
       public void testDivision() {
        Calculadora c = new Calculadora(5,5);

        double expectedResult = 1;

        assertEquals(expectedResult, c.division(5, 5));
       }

    @Test
       public void testValorAbsoluto() {
        Calculadora c = new Calculadora(-5);

        double expectedResult = 5;

        assertEquals(expectedResult, c.valorAbsoluto(-5));
       }
    @Test
       public void elevarUnNumero() {
        Calculadora c = new Calculadora(3,2);

        double expectedResult = 9;

        assertEquals(expectedResult, c.elevarUnNumero(3,2));
       }
    @Test
       public void testEsPositivo() {
        Calculadora c = new Calculadora(5);

        boolean expectedResult = true;

        assertEquals(expectedResult, c.esPositivo(5));
       }

   @Test
       public void testObjetoExiste() {
        Calculadora c = new Calculadora(5);
        assertNotNull(c);
       }

   @Test
       public void ObjetoNoIguales() {
        Calculadora c1 = new Calculadora(5);
        Calculadora c2 = new Calculadora(6);
        assertNotEquals(c1, c2);
       }
       
}
