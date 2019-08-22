package Clases;

public class Administrativo extends Empleado {
    private int hsExtra;
    private int hsMes;

    public Administrativo(int dni, String nombre, String apellido, String email, int sueldoBase, int hsExtra, int hsMes) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }

    public double setSueldo(){
        double sueldo = 0;

        sueldo = sueldoBase * ((hsExtra * 1.5) + hsMes) / hsMes;

        return sueldo;
    }
}
