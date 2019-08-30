package ejercicio32;

import java.util.List;
import java.util.Objects;

public class Empresa {
    private String nombre, anioFundacion;
    protected List<Empleado> empleados;

    public Empresa(String nombre, String anioFundacion, List<Empleado> empleados) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnioFundacion() {
        return anioFundacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", anioFundacion='" + anioFundacion + '\'' +
                ", empleados=" + empleados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombre, empresa.nombre) &&
                Objects.equals(anioFundacion, empresa.anioFundacion) &&
                Objects.equals(empleados, empresa.empleados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anioFundacion, empleados);
    }

    public void agregarEmpleado(Empleado nombre) {
        empleados.add(nombre);
    }
}
