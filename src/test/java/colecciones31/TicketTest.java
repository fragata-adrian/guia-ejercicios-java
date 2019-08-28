package colecciones31;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;

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
}