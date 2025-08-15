package dev.paula;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TablaDeMultiplicarTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testMostrarTablaConNumeroCinco() {
        
        TablaDeMultiplicar tabla = new TablaDeMultiplicar();
        tabla.mostrarTabla(5);

        String expectedOutput = "5 x 1 = 5\n" +
                                "5 x 2 = 10\n" +
                                "5 x 3 = 15\n" +
                                "5 x 4 = 20\n" +
                                "5 x 5 = 25\n" +
                                "5 x 6 = 30\n" +
                                "5 x 7 = 35\n" +
                                "5 x 8 = 40\n" +
                                "5 x 9 = 45\n" +
                                "5 x 10 = 50\n";
        
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}