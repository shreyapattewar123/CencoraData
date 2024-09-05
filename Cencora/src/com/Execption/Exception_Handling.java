package com.Execption;

public class Exception_Handling {
    public static double divided(int x,int y){
        //throw new ArithmeticException(); //its  behave like object here;

        return x/y;
    }
    public static void main(String[] args){
        try {
            System.out.println(divided(4, 0));
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("always run");
        }

    }
}
