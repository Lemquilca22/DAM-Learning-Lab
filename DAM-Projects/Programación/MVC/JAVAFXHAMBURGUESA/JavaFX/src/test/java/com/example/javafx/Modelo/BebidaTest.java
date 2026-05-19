package com.example.javafx.Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BebidaTest {

    @Test
    void testGetPrecioEstatico() {
        try {
            double precio = Bebida.getPrecio(1);
            assertEquals(2.50, precio, "El precio de la primera bebida debe ser 2.50");
        } catch (Exception e) {
            fail("Error en testGetPrecioEstatico: " + e.getMessage());
        }
    }

    @Test
    void testConstructorBebida() {
        try {
            Bebida b = new Bebida("Agua", 2.0, "Pequeño", false);
            assertEquals("Agua", b.getNombreBebida());
            assertEquals("Pequeño", b.getTamanoBebida());
        } catch (Exception e) {
            fail("Error en testConstructorBebida: " + e.getMessage());
        }
    }

    @Test
    void testLimiteArrayBebidas() {
        try {
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                Bebida.getNombre(10);
            });
        } catch (Exception e) {
        }
    }
}