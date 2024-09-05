
class A{
    public A(){
        System.out.println("this is inside the A");
    }
}
class B extends  A{
    public B(){
      super();
        System.out.println("This is inside B");
    }
}
class C extends B{
    public C(){
        super();
        System.out.println("This is inside  C");
    }
}

public class MultilevelInheritence {
    public static void main(String[] args){
        C c = new C();

    }
}
