package com.example.javafx.Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComidaTest {

    @Test
    void testCreacionHamburguesa() {
        try {
            Comida c = new Comida("Baki Burger", "Grande", "Brioche", "Queso", "Ternera", "Huevo", "Brioche");
            assertEquals("Baki Burger", c.getNomhamburguesa());
            assertEquals("Ternera", c.getTipocarne());
        } catch (Exception e) {
            fail("Error al crear la hamburguesa: " + e.getMessage());
        }
    }

    @Test
    void testListasIngredientes() {
        try {
            Comida c = new Comida(null, null, null, null, null, null, null);
            assertEquals(6, c.cantidadIngredientes(), "Debería haber 6 ingredientes en el array");
        } catch (Exception e) {
            fail("Error en las listas: " + e.getMessage());
        }
    }

    @Test
    void testModificarNombre() {
        try {
            Comida c = new Comida("Original", "Mediana", "Air", "Tomate", "Cerdo", "Cebolla", "Air");
            c.setNomhamburguesa("Bichota");
            assertEquals("Bichota", c.getNomhamburguesa());
        } catch (Exception e) {
            fail("Error al modificar nombre: " + e.getMessage());
        }
    }

    @Test
    void testGetPanPorIndice() {
        try {
            Comida c = new Comida(null, null, null, null, null, null, null);
            assertEquals("Pan brioche", c.getPan(0));
        } catch (Exception e) {
            fail("Error al obtener tipo de pan: " + e.getMessage());
        }
    }
}