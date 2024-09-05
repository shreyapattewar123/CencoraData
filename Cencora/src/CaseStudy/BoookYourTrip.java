package CaseStudy;

import java.util.HashMap;
import java.util.Scanner;

interface booking{
    public void book();
    public void invoice(String name,int n);
}
class PassengerDetails{
    String name;
    String Booking;
    public void getPassengerDetsils(String name,String Booking){
        this.name=name;
        this.Booking=Booking;
        System.out.println("Passenger Name: "+name+"\n"+"Details: "+Booking);
    }

    @Override
    public String toString() {
        return "CaseStudy.PassengerDetails{" +
                "name='" + name + '\'' +
                ", Booking='" + Booking + '\'' +
                '}';
    }
}
class BookTrain extends PassengerDetails implements booking{
    @Override
    public void book() {
        HashMap<String,Integer> hs = new HashMap<>();
        hs.put("RajaRani",100);
        hs.put("ganganagar",200);
        System.out.println(hs);

    }

    @Override
    public void invoice(String name,int n) {
              if(name.equals("RajaRani")){
                  System.out.println("total bill"+"="+n*100);
              }else if(name.equals("ganganagar")){
                  System.out.println("total bill"+"="+n*200);
        }else{
                  System.out.println("Invalid");
              }
    }
    public void getPassengerDetsils(String name,String Booking){
        this.name=name;
        this.Booking=Booking;
        System.out.println("Passenger Name: "+name+"\n"+"TainDetails: "+Booking);
    }
}
class BookPlane implements booking{
    @Override
    public void book() {
    }

    @Override
    public void invoice(String name,int n) {

    }
}
public class BoookYourTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 Train");
        System.out.println("2 Plane");
        System.out.println("Enter valid option");
        int option = sc.nextInt();
        switch (option){
            case 1:
                BookTrain Bt = new BookTrain();
                Bt.book();

                System.out.println("enetr your name");
                String PassengerName = sc.next();
                System.out.println("Enter the train name and number of tickets");
                int n = sc.nextInt();
                String name =sc.next();

                Bt.getPassengerDetsils(PassengerName,name);
                Bt.invoice(name,n);

        }



    }

}
