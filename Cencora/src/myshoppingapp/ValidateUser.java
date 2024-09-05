package myshoppingapp;

import java.util.HashMap;
import java.util.*;


public class ValidateUser {
    public static HashMap<String,String> UserList;
    public static void validate(){
        String name;
        String pwd;
        UserList =new HashMap<>();
        UserList.put("Admin","123");
        UserList.put("shreya","shreya@123");
        UserList.put("Gaurav","Gaurav@123");
        LoginUser user =new LoginUser();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username");
        name = sc.next();
        System.out.println("Enter your password");
        pwd = sc.next();
        if(name.equals(UserList.containsValue("Admin")) && UserList.get(name).equals(pwd)){
            System.out.println("Welcome"+name+"Your are Successfully logged in");
        }else{
            System.out.println("enter others crentials");
        }
    }
}
