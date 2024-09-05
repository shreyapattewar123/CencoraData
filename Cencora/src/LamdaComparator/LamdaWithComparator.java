package LamdaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
    int id;
    String name;
    int price;
    public Product(int id, String name,int price){
        this.id =id;
        this.name = name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Prduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class LamdaWithComparator {
    public static void main(String[] args) {
      ArrayList<Product> prod = new ArrayList<Product>();
        prod.add(new Product(5,"Shreya",450));
        prod.add(new Product(1,"Gaurav",9000));
        prod.add(new Product(15,"Riddhi",454));
        prod.add(new Product(55,"Swapnil",890));
        Comparator<Product> prname =Comparator.comparing(e->e.name);
        Collections.sort(prod,prname);
        prod.forEach(e-> System.out.println(e));
        System.out.println("comparing by price");
        Comparator<Product> prprice =Comparator.comparing(e->e.price);
        Collections.sort(prod,prprice);
        prod.forEach(e-> System.out.println(e));
        System.out.println("comapring by id");
        Comparator<Product> prId =Comparator.comparing(e->e.id);
        Collections.sort(prod,prId);
        prod.forEach(e-> System.out.println(e));


    }
}
