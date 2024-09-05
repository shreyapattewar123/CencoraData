package CaseStudy;

import java.util.Scanner;

interface  Booking{
    public
     void bbok();
}
class Ticket{
    long TicketNo;
    String TraverllerName;
    String dateOfBooking;
    double price;

    public Ticket(long ticketNo, String traverllerName, String dateOfBooking, double price) {
        TicketNo = ticketNo;
        TraverllerName = traverllerName;
        this.dateOfBooking = dateOfBooking;
        this.price = price;
    }

    public Ticket() {

    }

    @Override
    public String toString() {
        return "Ticket{" +
                "TicketNo=" + TicketNo +
                ", TraverllerName='" + TraverllerName + '\'' +
                ", dateOfBooking='" + dateOfBooking + '\'' +
                ", price=" + price +
                '}';
    }
    public Ticket BookTicket(){
        Scanner sc;String name;String dob;
        System.out.println("enter if you want to travel");
        int choice = new Scanner(System.in).nextInt();
        if(choice==1){
            System.out.println("Enter your name");
            sc= new Scanner(System.in);
        }
        return new Ticket();
    }
}
public class TicketReservation {
    public static void main(String[] args) {
        System.out.println("Ticket Zone");
        Ticket t1 = new Ticket();

    }

}
