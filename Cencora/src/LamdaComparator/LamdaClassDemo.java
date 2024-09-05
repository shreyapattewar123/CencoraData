package LamdaComparator;

interface MathOperation{
    int Opertion(int a,int b);

}
interface Addeble{
    int add(int a,int b);
}
interface Incrementor{
    int increment(int i);
}
interface printable{
    void print();
}
public class LamdaClassDemo {
    public static void main(String[] args) {
        MathOperation add=(a,b)->a+b;

        MathOperation sub=(a,b)->a-b;
        MathOperation divide=(a,b)->a/b;
        System.out.println("Addition: "+add.Opertion(10,20));
        System.out.println("subtraction: "+sub.Opertion(20,3));
        System.out.println("Divide: "+sub.Opertion(20,3));
        printable p=()-> System.out.println("hello");
        p.print();
        Incrementor n=i->{return ++i;};
        System.out.println("Increment "+n.increment(6));

    }
}
