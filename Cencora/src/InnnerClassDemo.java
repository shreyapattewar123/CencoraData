public class InnnerClassDemo {
    static class inner{
        static int invar=10;
        static class innermost{
           public static int mostinner=10;
        }
    }

    public static void main(String[] args) {
        inner in = new inner();
        System.out.println(inner.innermost.mostinner);
         inner.innermost.mostinner=12;
        System.out.println(inner.innermost.mostinner);
        System.out.println(inner.invar);

    }
}
