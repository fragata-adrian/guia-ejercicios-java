package Clases;

public class Vendedor extends Empleado {
    private float porcentComision;
    private float totalVentas;

    public Vendedor(int dni, String nombre, String apellido, String email, float sueldoBase, String legajo, float comision, float ventas) {
        super(dni, nombre, apellido, email, sueldoBase, legajo);

        this.porcentComision = porcentComision;
        this.totalVentas = ventas;
    }

    @Override
    public float getSueldo(){
        return getSueldoBase() + (porcentComision * totalVentas/100);
    }

    public float getPorcentComision() {
        return porcentComision;
    }

    public float getTotalVentas() {
        return totalVentas;
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
                ", comision='" + porcentComision + '\'' +
                ", ventas='" + totalVentas + '\'' +
                '}';
    }

}
