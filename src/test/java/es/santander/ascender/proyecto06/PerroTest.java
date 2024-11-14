package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PerroTest {
    @Test
    void testComer() {
        Perro perro = new Perro(45);

        perro.comer(34.52);

        assertEquals(79.52, perro.getPeso(), 0.00001);
    }
}
