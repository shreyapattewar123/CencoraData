package LamdaComparator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateProduct {
    public static void main(String[] args) {
        Product p1 = new Product(23,"Sandhya",3423);
        Product p2 = new Product(13,"Shri",3423);
        Product p3 = new Product(3,"Mohan",3423);
        Product p4 = new Product(2,"Ram",3423);
        Product p5 = new Product(43,"Radheye",3423);
        List<Product> productList = Arrays.asList(p1,p2,p3,p4,p5);
        Predicate<Product> pr =p->p.price>3;

        productList.stream().filter(pr).forEach(System.out::println);
    }
}
