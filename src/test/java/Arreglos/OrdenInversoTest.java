package Arreglos;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OrdenInversoTest {

    @Test
    public void testInvertirOrden() {
        OrdenInverso pepe = new OrdenInverso();
        int[] esperado = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        assertEquals(pepe.invertirOrden(), esperado);
    }
}