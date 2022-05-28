import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    @DisplayName("Metodo para comprobar suma")
    public void sumaTest(){
        Calculadora sumaCalc = new Calculadora();
        Assertions.assertEquals(2, sumaCalc.suma(1,1), "El resultado es 2");
    }

    @Test
    @DisplayName("Metodo para comprobar assertion")
    public void assertionTest (){
        //boolean valorBoolean = false;
        // assertTrue(valorBoolean);
        assertAll(
                "Encabezado",
                ()-> assertEquals(2, 1+1, "Deberia ser 2"),
                ()-> assertTrue(true, "Deberia ser true")
            );
        }

}
