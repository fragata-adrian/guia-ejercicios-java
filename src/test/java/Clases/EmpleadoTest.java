package Clases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class EmpleadoTest {

    private List<Empleado> empleados;

    @BeforeTest
    public void describe(){
        empleados = new ArrayList<>();

        Empleado vendedor1 = new Vendedor(
                42856997,
                "Aldo",
                "Veliz",
                "aldov@gmail.com",
                15000,
                "1",
                10f,
                1000);

        Empleado vendedor2 = new Vendedor(
                42758978,
                "Roberto",
                "Gonzales",
                "robergon@gmail.com",
                14568,
                "1",
                57,
                120);

        Empleado administrativo1 = new Administrativo(
                45621458,
                "Yesica",
                "Pay",
                "yesipay99@gmail.com",
                25000,
                "2",
                140,
                1200);

        Empleado administrativo2 = new Administrativo(
                45621458,
                "Daniela",
                "Ponce",
                "daniponce99@gmail.com",
                28000,
                "2",
                110,
                1220);

        empleados.add(vendedor1);
        empleados.add(vendedor2);
        empleados.add(administrativo1);
        empleados.add(administrativo2);

    }

    @Test
    public void testEmpleado1() {
        for(Empleado e: empleados){
            System.out.println(e.getDni() + e.getNombre() + e.getApellido() + e.getSueldo());
        }
    }


    @Test
    public void testEmpleado(){
        empleados.stream().forEach(e -> System.out.println(e.getDni() + e.getNombre() + e.getApellido() + e.getSueldo()));
    }

}