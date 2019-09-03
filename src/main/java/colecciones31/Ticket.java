package colecciones31;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Ticket {
    private int id;
    private Date fecha;
    private List<Item> items;



    public Ticket(int id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
        items = new ArrayList<>();
    }


    public void agregarItem(Item item) {
        items.add(item);
    }

    public void removerItem(Item item) {
        items.remove(item);
    }

    public boolean cotieneItem(Item item) {
        return items.contains(item);
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id &&
                Objects.equals(fecha, ticket.fecha) &&
                Objects.equals(items, ticket.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, items);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", items=" + items +
                '}';
    }
}
