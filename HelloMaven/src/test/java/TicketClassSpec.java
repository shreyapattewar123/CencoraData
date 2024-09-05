import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicketClassSpec {
    Ticket ticket;
    private List<Ticket>
            list;
    @BeforeEach
   public void  setup(){
        System.out.println("setting");

    }
    @Test
    public void TicketIsEmptyOrNot(){
       ticket= new Ticket();
       list=TicketClass.getTicket();
       assertTrue(list.isEmpty(),"List should not be empty");

    }
    @Test
    public void TicketStartWithS(){
        ticket=new Ticket();
        list=TicketClass.getTicket();
        assertTrue(list.isEmpty(),"It shoud be present");
    }
}
