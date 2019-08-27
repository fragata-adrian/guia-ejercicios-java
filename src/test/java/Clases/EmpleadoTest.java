package Clases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class EmpleadoTest {


    @BeforeTest
    public void setup(){
        Empleado emp1 = new Vendedor(42856997, "Aldo","Veliz", "aldov@gmail.com", 15000,10, 45);
        Empleado emp2 = new Vendedor(42758978, "Roberto", "Gonzales", "robergon@gmail.com", 14568, 10, 57);
        Empleado emp3 = new Administrativo(45621458, "Yesica", "Pay", "yesipay99@gmail.com", 25000, 12, 140);
        Empleado emp4;
    }

    @Test
    public void testEmpleado(){
        Empleado emp1 = new Vendedor(42856997, "Aldo","Veliz", "aldov@gmail.com", 15000,10, 45);
        Empleado emp2 = new Vendedor(42758978, "Roberto", "Gonzales", "robergon@gmail.com", 14568, 10, 57);
        Empleado emp3 = new Administrativo(45621458, "Yesica", "Pay", "yesipay99@gmail.com", 25000, 12, 140);
        Empleado emp4 = new Administrativo(45621458, "Daniela", "Ponce", "daniponce99@gmail.com", 28000, 12, 110);

        ArrayList<Object> empleados = new ArrayList<>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);

    }

}