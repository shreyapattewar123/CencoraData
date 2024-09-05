package com.Oops;
abstract  class Employee{
    abstract void calculateSalary();
    public void getDetails(){
        System.out.println("Get your Details");
    }
}
class SalesManager extends Employee{
    @Override
    void calculateSalary() {
        double incentives=3000;
        System.out.println( 5000+incentives+"SalesManager salary: ");
    }

    @Override
    public void getDetails() {
        System.out.println("Sales Maneger is Shreya");
    }
}
public class AbtracationClass {
    public static void main(String[] args){
        Employee eobj = new Employee() {
            @Override
            void calculateSalary() {

            }
        };
       SalesManager sm = new SalesManager();
       sm.calculateSalary();
    }



}
