package colecciones31;

import java.util.Objects;

public class Item {
    private String nombre;
    private float cantidad;
    private float precio;

    public Item(String nombre, float cantidad, float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Float.compare(item.cantidad, cantidad) == 0 &&
                Float.compare(item.precio, precio) == 0 &&
                Objects.equals(nombre, item.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantidad, precio);
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
