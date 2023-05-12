package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    void getName() {
        Alumno alumno = new Alumno("Juan");
        assertEquals("Juan", alumno.getName());
    }

    @Test
    void setName() {
    }
}