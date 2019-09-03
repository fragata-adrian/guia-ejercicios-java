package colecciones31;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.testng.Assert.*;

public class TicketTest {

    private Ticket ticket;

    @BeforeTest
    public void describe() {
        ticket = new Ticket(1, new Date());
    }

    @Test
    public void testAgregarItem() {
        Item item = new Item("Coca", 1,100);
        ticket.agregarItem(item);

        assertTrue(ticket.cotieneItem(item));
    }

    @Test
    public void testRemoverItem() {
        Item item = new Item("Coca", 1,100);
        ticket.agregarItem(item);

        ticket.removerItem(item);

        assertFalse(ticket.cotieneItem(item));
    }

    @Test
    public void testGetProductos() {
        Item coca = new Item("Coca", 1, 100);
        ticket.agregarItem(coca);

        List<Item> esperado = new ArrayList<>();
        esperado.add(coca);

        assertEquals(ticket.getItems(), esperado);
    }
}