package ejercicio33;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlumnoTest {
    Alumno aldo;
    Alumno belen;
    Asignatura objetosI;
    Asignatura baseDeDatos;

    @BeforeTest
    public void describe() {
        aldo = new Alumno("Aldo", "Veliz", "aldov@gmail.com", new ArrayList<>());
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

    @Test
    public void testListarAlumnos() {
        objetosI.agregarAlumno(belen);
        objetosI.agregarAlumno(aldo);
        List<Alumno> esperado = new ArrayList<>();
        esperado.add(belen);
        esperado.add(aldo);

        assertEquals(objetosI.getAlumnos(), esperado);
    }

    @Test
    public void testListarAsignaturas() {
        belen.agregarAsignatura(objetosI);
        belen.agregarAsignatura(baseDeDatos);

        List<Asignatura> esperado = new ArrayList<>();
        esperado.add(objetosI);
        esperado.add(baseDeDatos);

        assertEquals(belen.getAsignaturas(), esperado);
    }

    @Test
    public void testTotalDeHoras() {
        aldo.agregarAsignatura(objetosI);
        aldo.agregarAsignatura(baseDeDatos);

        assertEquals(aldo.totalDeHoras(), 12);
    }
}