package CaseStudy;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkesListDemo {
    public static void main(String[] args) {
        LinkedList<String> booking = new LinkedList<>();
        booking.add("shreya");
        booking.add("riddhi");
        booking.add("prachi");
        System.out.println(booking);
        LinkedList<String> waiting = new LinkedList<>();
        waiting.add("Gaurav");
        waiting.add("shrushti");
        Scanner sc = new Scanner(System.in);
        LinkedList<String> Cancle = new LinkedList<>();
       String s=sc.next();
       Cancle.add(s);
      int n =booking.indexOf(s);
        booking.remove(s);
     booking.add(n,waiting.getFirst());
        System.out.println(booking);




    }
}
