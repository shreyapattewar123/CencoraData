class Base{
    int var1 =10;
    String name ="Shreya";
    public Base(){
        System.out.println("Default constructor of Base class");
        System.out.println(var1);
    }
    public Base(int v){
        this.var1=v;
        System.out.println(var1);
    }
    public Base returnObj(){
        Base b=null;
        return b;
    }
    public void baseMethod(){
        System.out.println("this is base method");
    }
}
class child extends Base{

    public child(){
        System.out.println("Default constructor of Base class");

    }
    public void baseMethod(){
        System.out.println("calling base method int child class");
    }
    public child returnObj(){
        child c=null;
        return c;
    }

    public void childMethod(){
        System.out.println("Child method");
    }
}
public class Child_parent {
    public static void main(String[] args){
        Base B = new Base(25);
        Base Ba = new Base();
        child C = new child();
        B.baseMethod();
        C.childMethod();
        System.out.println(C.var1);
        System.out.println(C.name);
       int a= C.var1=25;
       String s= C.name="Ram";
        System.out.print(a +" "+s);


    }
}
