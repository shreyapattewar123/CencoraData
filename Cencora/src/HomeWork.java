import java.util.*;
public class HomeWork {
   static Scanner sc;
   static double totalvalue =0;
    public static void mainMeun(){
        System.out.println("*****welcome to star Bazaar");
        System.out.println("Do you wish to shop?");
        System.out.println("1. yes");
        System.out.println("2. No");
        sc=new Scanner(System.in);
        int choice =sc.nextInt();
        System.out.println("Enter the category you wish to shop in");

        System.out.println("Sr.No\t \t Category name \t\t");
        System.out.println("1.\t\t Clothes\t\t");
        sc=new Scanner(System.in);
        int option1= sc.nextInt();
        do {
            switch (option1) {
                case 1:
                    clothes();
                    break;
                case 2:
                    grocery();
                    break;
                default:
                    System.out.println("Invalid options");
            }
        }while(choice!=2);{
            System.out.println("Thank you for the visit");
        }
    }

    private static void grocery() {
        System.out.println("Sr.No\t \t name  \t\t price \t\t");
        int rice =100;
        int weat =30;

        System.out.println("1.\t\t     rice \t\t"+rice);
        System.out.println("2.\t\t     weat \t\t"+weat);
        int option =sc.nextInt();
        switch(option){
            case 1:


        }


    }

    private static void clothes() {

    }

    public static void main(String[] args){
        HomeWork.mainMeun();



    }
}
