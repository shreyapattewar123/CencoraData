package com.Oops;

class Account{
     static int accid;
     static String accName="Saving account";
    static double finalBalance=4000;

    public static void getAccountDetails(){

        System.out.println("The account deatils are: " + accid +" "+accName+" "+finalBalance);
    }
    public static double remainingBalance(int widrawBalance){
        Account.finalBalance= Account.finalBalance- widrawBalance;

        return Account.finalBalance;
    }
    public static double AddBalance(int Addbalance){
        Account.finalBalance=Account.finalBalance+Addbalance;
        return Account.finalBalance;

    }

}
public class FirstClass {
    public static void main(String[] args){

        Account.getAccountDetails();
        System.out.println(Account.accid);
        Account.remainingBalance(2000);
        System.out.println(Account.finalBalance);
        Account.AddBalance(2122);
        System.out.println(Account.finalBalance);
        Account.getAccountDetails();
    }

}
