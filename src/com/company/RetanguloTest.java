package com.company;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RetanguloTest {
    Retangulo retangulo = new Retangulo(2, 3);

    @Test
    public void testArea() {
        assertTrue(6 == retangulo.calcularArea());
    }

    @Test
    public void testPerimetro() {
        assertTrue(10 == retangulo.calcularPerimetro());
    }
}

