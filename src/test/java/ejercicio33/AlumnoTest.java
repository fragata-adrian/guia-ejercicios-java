package ejercicio33;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlumnoTest {
    Alumno aldo;
    Alumno belen;
    Asignatura objetosI;
    Asignatura baseDeDatos;

    @BeforeTest
    public void describe() {
        belen = new Alumno("Belen", "Noguera", "belu@gmail.com", new ArrayList<>());
        objetosI = new Asignatura("ObjetosI", 8, new ArrayList<>());
        baseDeDatos = new Asignatura("Base de datos", 4, new ArrayList<>());
    }

    @Test
    public void testAgregarAsignatura() {
        belen.agregarAsignatura(objetosI);
        assertTrue(belen.asignaturas.contains(objetosI));
    }

    @Test
    public void testAgregarAlumno() {
        objetosI.agregarAlumno(belen);
        assertTrue(objetosI.alumnos.contains(belen));
    }

    @Test
    public void testgetHoras() {
        assertEquals(objetosI.getHorasSemanales(), 8);
        assertEquals(baseDeDatos.getHorasSemanales(), 4);
    }



}