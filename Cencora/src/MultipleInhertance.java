

interface flyingObject{
    public void fly();
}
interface flyingvehicle{
    public void wings();
}
class Areoplane implements flyingvehicle,flyingObject{

    @Override
    public void fly() {
        System.out.println("areoplane fly in the sky");
    }

    @Override
    public void wings() {
System.out.println("areplone have wings to fly in the sky");
    }
}

public class MultipleInhertance {
    public static void main(String[] args){
        Areoplane A = new Areoplane();
        A.fly();
        A.wings();
    }
}
