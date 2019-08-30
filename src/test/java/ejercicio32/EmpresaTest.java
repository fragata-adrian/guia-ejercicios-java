package ejercicio32;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class EmpresaTest {
    private Empresa empresa1;
    private Empresa empresa2;
    private Empleado empleado1;
    private Empleado empleado2;
    public List<Empresa> empresas = new ArrayList<>();


    @BeforeTest
    public void describe() {
        empresa1 = new Empresa("DirecTV", "1980", new ArrayList<>());
        empresa2 = new Empresa("Andreani", "1950", new ArrayList<>());
        empleado1 = new Empleado("Aldo", "Veliz", "20/04/96", "5/01/2000");
        empleado2 = new Empleado("Belen", "Noguera", "30/05/1999", "15/11/2006");
        empresas.add(empresa1);
        empresas.add(empresa2);
    }

    @Test
    public void testAgregarEmpleado() {
        empresa1.agregarEmpleado(empleado1);
        assertTrue(empresa1.empleados.contains(empleado1));
    }

    @Test
    public void testListadoEmpresas() {
        /*for(int i=0; i< empresas.size(); i++){
            System.out.println(empresas.get(i));
        }*/
        assertEquals(empresa1.getEmpleados(), "asd");
    }
}