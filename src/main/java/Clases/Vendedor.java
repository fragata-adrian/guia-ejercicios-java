package Clases;

public class Vendedor extends Empleado {
    private int porcentComision;
    private int totalVentas;

    public Vendedor(int dni, String nombre, String apellido, String email, int sueldoBase, int comision, int ventas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcentComision = porcentComision;
        this.totalVentas = ventas;
    }

    public double setSueldo(){
        double sueldo = 0;

        sueldo = sueldoBase + (porcentComision * totalVentas/100);

        return sueldo;
    }
}
