package Clases;

public class Empleado {
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected int sueldoBase;
    protected int tipo;

    public Empleado(int dni, String nombre, String apellido, String email, int sueldoBase){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }

}
