package colecciones31;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


}
