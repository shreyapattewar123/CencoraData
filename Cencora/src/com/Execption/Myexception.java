package com.Execption;
class IpaddressexceptionFound extends Exception{
    String msg;
    public IpaddressexceptionFound(String msg){
        super(msg);
    }
    public static void checkIp(String ipaddress) throws IpaddressexceptionFound {
        if(ipaddress!="192.168.2.2"){
            throw new IpaddressexceptionFound("Enter proper ip address");
        }else{
            System.out.println("connected");
        }
    }

}
public class Myexception {
    public static void main(String[] args) throws IpaddressexceptionFound {
       try {
           IpaddressexceptionFound.checkIp("192.168.2.2");
       }catch(IpaddressexceptionFound e){
           System.out.println(e);
           e.printStackTrace();
       }
    }
}
