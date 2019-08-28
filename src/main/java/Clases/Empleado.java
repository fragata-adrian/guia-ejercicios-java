package Clases;

public abstract class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private float sueldoBase;
    private String legajo;

    public Empleado(int dni, String nombre, String apellido, String email, float sueldoBase, String legajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
        this.legajo = legajo;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public String getLegajo() {
        return legajo;
    }

    public abstract float getSueldo();

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", sueldoBase=" + sueldoBase +
                ", legajo='" + legajo + '\'' +
                '}';
    }
}
