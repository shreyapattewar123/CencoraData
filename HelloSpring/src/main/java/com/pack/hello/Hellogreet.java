package com.pack.hello;

public class Hellogreet {
    private  int id;
    private String ticketdate;
    public Hellogreet(){
        System.out.println("Ticket is"+ticketdate);
    }
    public Hellogreet(int id){
        this.id=id;
    }
    public Hellogreet(String ticketdate){
        this.ticketdate=ticketdate;
    }
    public Hellogreet(int id,String ticketdate){
        this.id =id;
        this.ticketdate=ticketdate;
    }
    public void display(){
        System.out.println(id + ticketdate);
    }
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
