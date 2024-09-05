class Outer{
    void outerMethod(){
        final int number=10;

    class localInnerclass {
        void printNumber() {
            System.out.println("Number is " + number);

        }
    }
    localInnerclass lc = new localInnerclass();
    lc.printNumber();
    }
}
public class Outerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();


    }
}
