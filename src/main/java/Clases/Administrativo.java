package Clases;

public class Administrativo extends Empleado {
    private float hsExtra;
    private float hsMes;

    public Administrativo(int dni, String nombre, String apellido, String email, float sueldoBase, String legajo, float hsExtra, float hsMes) {
        super(dni, nombre, apellido, email, sueldoBase, legajo);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }

    public float getHsExtra() {
        return hsExtra;
    }

    public float getHsMes() {
        return hsMes;
    }

    @Override
    public float getSueldo(){
        return  getSueldoBase() * ((hsExtra * 1.5f) + hsMes) / hsMes;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "dni=" + getDni() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", email='" + getApellido() + '\'' +
                ", sueldoBase=" + getSueldoBase() +
                ", legajo='" + getLegajo() + '\'' +
                ", hsExtra='" + hsExtra + '\'' +
                ", hsMes='" + hsMes + '\'' +
                '}';
    }


}
