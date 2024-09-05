import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Ticket{
    int tid;
    String tname;
    double price;

    public Ticket() {
    }

    public Ticket(int tid, String tname, double price) {
        this.tid = tid;
        this.tname = tname;
        this.price = price;
    }

}
public class TicketClass {
    public static List<Ticket> getTicket(){
        Ticket t1 = new Ticket(1,"shreya",1234.32);
        Ticket t2 = new Ticket(1,"Shrinath",123);
        Ticket t3= new Ticket(1,"Swapnil",12.32);
        Ticket t4 = new Ticket(1,"Gaurav",34.32);
        List<Ticket> ticketList = Arrays.asList(t1,t2,t3,t4);
       return ticketList;
    }
    public static List<Ticket> getTicketByName() {

                 List<Ticket> list = new ArrayList<>();
                 list.add(new Ticket(1, "shreya", 1234.32));

                 List<Ticket> newlist = list.stream().filter(s->s.tname.startsWith("s")).collect(Collectors.toList());
                 return newlist;

    }
}
